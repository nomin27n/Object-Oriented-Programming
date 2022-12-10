// **********************************************************************************
//   UpdateInventory.java        Author: Lewis/Loftus (with modification)
//
//   Demonstrates the use of character file I/O.
// **********************************************************************************
package InventoryItem;
import java.io.*;
import java.util.StringTokenizer;

public class UpdateInventory
{
    public static void main (String[] args){
	final int MAX = 100;
	InventoryItem[] items = new InventoryItem[MAX];
	StringTokenizer tokenizer;
	String line, name = null;
	String file = "/home/user/다운로드/Lab12src/InventoryItem/inventory.dat";
	int units, count = 0;
	//int addedUnits;
	float price;

	try{
		FileReader fr = new FileReader (file);
		BufferedReader inFile = new BufferedReader (fr);
		line = inFile.readLine();
		while (line != null){
			tokenizer = new StringTokenizer (line);
			name = tokenizer.nextToken();
			try{line = inFile.readLine();
				units = Integer.parseInt (tokenizer.nextToken());
				price = Float.parseFloat (tokenizer.nextToken());
				items[count++] = new InventoryItem (name, units, price);
			    }catch (NumberFormatException exception){
				System.out.println ("Error in input. Line ignored.");
				System.out.println (line);
			    }
			//line = inFile.readLine();
		    }
		inFile.close();
		
		System.out.println("\nEnter the name of product which you will add units: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s = input.readLine();
		int tmp = -1;
		
		for(int i = 0; i < count; i++) {
			if(items[i].getName().equals(s)) {
				tmp = i;
				break;
			}
		}
	
		System.out.println ("\nEnter the number of additional units of each item: ");
		// Set up the output file stream
		s = input.readLine();
		tokenizer = new StringTokenizer(s);
		items[tmp].restock(Integer.parseInt (tokenizer.nextToken()));
		

		for (int scan = 0; scan < count; scan++){
			System.out.println (items[scan]);
		}

		File newFile = new File("inventory.dat");
		FileWriter fw = new FileWriter(file, false);
		
		for(int i = 0; i < count; i++) {
			System.out.println(items[i].getName());
			fw.write(items[i].getName());
			fw.write(" ");
			fw.write(Integer.toString(items[i].getUnits()));
			fw.write(" ");
			fw.write(Float.toString(items[i].getPrice()));
			fw.write(" ");
			fw.write("\n");
		}
		
		/*
		Widget 14 3.35
		Spoke 132 0.32
		Wrap 58 1.92
		Thing 28 4.17
		Brace 25 1.75
		Clip 409 0.12
		Cog 142 2.08
		*/
		// Close the output file stream
			fw.close();
			fr.close();
			input.close();
	    }catch (FileNotFoundException exception){
	    	System.out.println ("The file " + file + " was not found.");
	    	//exception.printStackTrace();
	    }
	
		catch (IOException exception){
			System.out.println (exception);
	    }
	
    }
}

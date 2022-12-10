package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Buffered {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		do{
			
			try {
				System.out.print("Enter a sentence: ");
				s = input.readLine();
			}catch(IOException e){
				System.out.println("IOException is occured.");
			}
			StringTokenizer st = new StringTokenizer(s);
			
			if(!s.equals("quit")){
				int n = st.countTokens();
				System.out.println("There are "+n+" words in this line.");
				
				for(int i = 0; i < n; i++)
					System.out.print(st.nextToken()+" ");
					
				System.out.println();
			}
			
		}while(!s.equals("quit"));
	}
}

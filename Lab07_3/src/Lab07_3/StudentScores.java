package Lab07_3;

public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private String[] names;
	private int[] scores;
	private int numStudents;

	public StudentScores() {
		scores = new int[MAX_STUDENTS];
		names = new String[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		names[numStudents] = name;
		scores[numStudents] = score;
		numStudents++;
	}

	public String getHighest() {
		if (numStudents == 0)
			return null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (scores[i] > scores[highest])
				highest = i;

		return names[highest];
	}

	public String getLowest() {
		if (numStudents == 0)
			return null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (scores[i] < scores[lowest])
				lowest = i;

		return names[lowest];
	}
}
package lineards;

import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<marks.length;i++)
		{
			int val = sc.nextInt();
			marks[i] = val;
		}
		
		StudentDetails student1 = new StudentDetails("Nandhan",marks);
		StudentDetails student2 = new StudentDetails("Varma",marks);
		
		System.out.println(student1.getNumberOfMarks());
		System.out.println(student1.getSumOfMarks());
		System.out.println(student1.getAverageMarks());
		System.out.println(student1.maximumMark());
		System.out.println(student1.minimumMark());
		
		System.out.println(student2.getNumberOfMarks());
	}

}

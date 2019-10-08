import java.io.*;
import java.util.Scanner;

public class GradeSheet{

	private String courseName;
	private int[] grades;

	public GradeSheet(String courseName, int numberofStudents){
		this.courseName = courseName;
		grades = new int[numberofStudents];
	}

	public void setGrade(int index, int grade){
		grades[index] = grade;
	}

	public int getGrade(int index){
		return grades[index];
	}

	public void getGrades(String filename) throws IOException{
		File file = new File(filename);
		Scanner scan = new Scanner(file);

		int i = 0;
		while (scan.hasNext() && i < grades.length){
			grades[i] = scan.nextInt();
			i++;
		}
	}

	public double getAverage(){
		int total = 0;
		for(int i=0; i<grades.length; i++){
			total += grades[i];
		}
		return (double)total / grades.length;
	}

	public static void main(String[] args) throws IOException{
		GradeSheet cs14002 = new GradeSheet("CS14002", 35);
		cs14002.getGrades("cs14002.txt");

		System.out.println("Course name: " + cs14002.courseName);
		System.out.println("Student\t  Grade");
		System.out.println("-------\t  -----");
		for (int i=0; i<cs14002.grades.length; i++){
			System.out.printf("  %02d\t   %02d%n", i+1, cs14002.grades[i]);
		}
		System.out.println();
		System.out.printf("Course average: %5.2f%n", cs14002.getAverage());
	}
}

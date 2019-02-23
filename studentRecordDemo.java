import java.util.Scanner;

public class studentRecordDemo
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your grade for the first quiz (0-10)");
		int quiz1 = input.nextInt();

		System.out.println("Enter your grade for the second quiz (0-10)");
		int quiz2 = input.nextInt();

		System.out.println("Enter your grade for the third quiz (0-10)");
		int quiz3 = input.nextInt();

		System.out.println("Enter your grade for the Midterm (0-100)");
		int midterm = input.nextInt();

		System.out.println("Enter your grade for the final exam (0-100)");
		int exam = input.nextInt();

		studentRecord newGrade = new studentRecord(quiz1,quiz2,quiz3,midterm,exam);
		System.out.println(newGrade);

	}
}
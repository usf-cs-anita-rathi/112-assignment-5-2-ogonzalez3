public class studentRecord
{
	private int quiz1;
	private int quiz2;
	private int quiz3;
	private int midterm;
	private int exam;

	public String toString()
	{
		double numericGrade = finalGrade();
		return("Student Record \nQuiz1: "+quiz1+"\nQuiz2: "+quiz2+"\nQuiz3: "+quiz3+"\nMidterm: "+midterm+"\nFinal Exam: "+exam+"\nNumeric Grade: "+numericGrade+"\nLetter Grade: "+letterGrade(numericGrade));
	}
	public void studentRecord()
	{
		quiz1 = 0;
		quiz2 = 0;
		quiz3 = 0;
		midterm = 0;
		exam = 0;
	}
	public studentRecord(int q1, int q2, int q3, int mt, int ex)
	{
		midterm = mt;
		exam = ex;

		if (q1>10 || q1 < 0)
		{
			System.out.println("Invalid quiz score. Must be out of 10");
			System.exit(0);
		}
		else
		{
			quiz1 = q1 *10;
		}
		if (q2>10 || q2 < 0)
		{
			System.out.println("Invalid quiz score. Must be out of 10");
			System.exit(0);
		}
		else
		{
			quiz2 = q2*10;
		}
		if (q3>10 || q3 < 0)
		{
			System.out.println("Invalid quiz score. Must be out of 10");
			System.exit(0);
		}
		else
		{
			quiz3 = q3*10;
		}
		if (mt>100 || mt < 0)
		{
			System.out.println("Invalid midterm score. Must be out of 100");
			System.exit(0);
		}
		else
		{
			midterm = mt;
		}
		if (ex>100 || ex < 0)
		{
			System.out.println("Invalid final exam score. Must be out of 100");
			System.exit(0);
		}
		else
		{
			exam = ex;
		}
	}
	public double getQuizGrade()
	{
		return (((quiz1 + quiz2+ quiz3)/3)*.25);
	}
	public double getMidterm()
	{
		return midterm * .35;
	}
	public double getExam()
	{
		return exam *.40;
	}
	public double finalGrade()
	{
		return getQuizGrade() + getMidterm() + getExam();
	}
	public String letterGrade(double numericGrade)
	{
		if(numericGrade>=90)
		{
			return "A";
		}
		else if (numericGrade<90 && numericGrade >=80)
		{
			return "B";
		}
		else if (numericGrade<80 && numericGrade>=70)
		{
			return "C";
		}
		else if (numericGrade < 70 && numericGrade>=60)
		{
			return "D";
		}
		else
		{
			return "F";
		}
	}
}
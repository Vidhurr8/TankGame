package Unit11GradesArrayList;
import static java.lang.System.out;

public class StudentTester 
{
	public static void main(String args[]) 
	{
		Student stu = new Student("Billy Bob", "5 - 90 85 95.5 77.5 88");
		out.println(stu);
		out.println("sum = " + stu.getSum());
		out.println("average = " + stu.getAverage());
		out.println("average after dropping low grade = " + String.format("%.4g", stu.getAverageMinusLow()));
		out.println("low grade = " + stu.getLowGrade());
		out.println("high grade = " + stu.getHighGrade());
	}
}
import java.util.Scanner;
public class GradeBook {
	private String courseName;
	private String instrName;
	public GradeBook(String name, String intructor) {
		courseName = name;
		instrName = intructor;		
	}
	public void setCourseName(String name){
		courseName = name;
	}
	public String getCourseName(){
		return courseName;
	}
	public void setInstructorName(String name){
		instrName = name;
	}
	public String getInstructorName(){
		return instrName;
	}
	public void displayMessage() {     
		System.out.println("Welcome to the grade book for " + getCourseName() );
		System.out.println("This course is presented by: " + getInstructorName());
		System.out.println();
	}
	public void determineClassAverage(){
		Scanner input = new Scanner(System.in);

		int total;
		int gradeCounter;
		int grade;
		double average;

		total = 0;
		gradeCounter = 0;

		System.out.print("Enter grade or -1 to quit: ");
		grade = input.nextInt();

		while (grade != -1){
			total += grade;
			gradeCounter++;
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}

		if(gradeCounter != 0){
			average = (double) total/gradeCounter;

			System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCounter, total);
			System.out.printf("Class average is %.2f\n", average );
		} else {
			System.out.println("No grades were entered");
		}
	}
}
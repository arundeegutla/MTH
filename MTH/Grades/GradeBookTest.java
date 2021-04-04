import java.util.Scanner;
public class GradeBookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeBook myGradeBook = new GradeBook("How to make Chicken Biryani", "Arun Deegutla");
		GradeBook myGradeBook2 = new GradeBook("How to make Mutton Biryani", "Arun Deegutla");
		System.out.println("Initial course One name is: " + myGradeBook.getCourseName() + "\n"+ "By: " + myGradeBook.getInstructorName());
		System.out.println();
		System.out.println("Initial course Two name is: " + myGradeBook2.getCourseName()+ "\n"+"By: " + myGradeBook2.getInstructorName());
		System.out.println();
		
		System.out.println("Please enter the course name for Grade Book 1:");		
		String nameOfCourse = input.nextLine();
		myGradeBook.setCourseName( nameOfCourse );
		System.out.println();
		
		System.out.println("Please enter the Professor's name for Grade Book 1:");
		String nameOfInst = input.nextLine();
		myGradeBook.setInstructorName( nameOfInst );
		System.out.println();
		
		System.out.println("Please enter the course name for Grade Book 2:");
		nameOfCourse = input.nextLine();
		myGradeBook2.setCourseName( nameOfCourse );
		System.out.println();
		
		System.out.println("Please enter the Professor's name for Grade Book 2:");
		nameOfInst = input.nextLine();
		myGradeBook2.setInstructorName( nameOfInst );
		System.out.println();
		
		myGradeBook.displayMessage();
		myGradeBook2.displayMessage();
	}
}
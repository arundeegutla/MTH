import java.util.Scanner;
public class GradeBookTest1 {
	public static void main(String[] args) {
		GradeBook myGradeBook = new GradeBook("How to make Chicken Biryani", "Arun Deegutla");
		
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
	}
}
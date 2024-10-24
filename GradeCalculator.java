import java.util.Scanner;


public class GradeCalculator {

	public static void main(String[] args) {
		        int totalMarks=0;

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the number of subjects: ");
		        int numSubjects = scanner.nextInt();
				int[] marks = new int[numSubjects];

                System.out.println("Enter the marks:");
		        for (int i = 0; i < numSubjects; i++) {
		            marks[i] = scanner.nextInt();
		            totalMarks += marks[i];
				}
		     
		        float Percentage = (float) totalMarks / numSubjects;

		        String grade;
		        if (Percentage >= 90) {
		            grade = "A";
		        } else if (Percentage >= 80) {
		            grade = "B";
		        } else if (Percentage >= 70) {
		            grade = "C";
		        } else if (Percentage >= 60) {
		            grade = "D";
		        } else {
		            grade = "F";
		        }

		        // Display the results
		        System.out.println("Total marks: " + totalMarks+"/"+(numSubjects*100));
		        System.out.println("Percentage: " + Percentage);
		        System.out.println("Grade: " + grade);

		        scanner.close();
		    }
		}
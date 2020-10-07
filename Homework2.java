
public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grade1 = 91.14;
		double grade2 = 85.01;
		int grade3 = 72;
		int grade4 = 63;
		double grade5 = 81.14;

		double averageGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
		System.out.println("Your average score is " + averageGrade);

		if ((averageGrade >= 90) && (averageGrade <= 100)) {
			System.out.println("A: Fantastic job!");
		} else if ((averageGrade >= 80) && (averageGrade <= 89.99)) {
			System.out.println("B: Good!");
		} else if ((averageGrade >= 70) && (averageGrade <= 79.99)) {
			System.out.println("C: Please try more next time!");
		} else if ((averageGrade >= 0) && (averageGrade <= 69.99)) {
			System.out.println("F: Unfortunately you failed!");
		} else {
			System.out.println("Invalid  Grade");
		}

	}

}

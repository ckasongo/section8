import java.util.Scanner;



public class ForeverStamp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int count = 0;

		while (count < 2) {

			System.out.print("Enter a sequence of weights in ounces for the letters that will mail out."

				+ " When done entering, please enter -1 to finish: ");

			double weight = input.nextDouble();

			count += 1;
			if (count <= 1) {

				System.out.println("You can use a forever stamp");

			}

			if (weight == -1) {

				System.out.println("Good Bye");

			}

			if (weight > 1) {

				System.out.println("You need additional postage than a forever stamp");

			

			}

		

		



		}







		

	}



}

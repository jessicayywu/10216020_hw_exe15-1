/** Name: Yen-Yi Wu
 *  ID: U10216020
 *  Ex.: 15.1
 *  Information:
 *  			A program that calculates the answers of functions using abstract methods
 *  
 *  			In the program, an abstract class AbstractCalculateFunction and 7 subclasses
 *  			of it are tested.
 *  			The 7 subclasses are respectively:
 *  				a. Function1: f(x) = x^2
 *  				b. Function2: f(x) = sin(x)
 *  				c. Function3: f(x) = cos(x)
 *  				d. Function4: f(x) = tan(x)
 *  				e. Function5: f(x) = cos(x) + 5sin(x)
 *  				f. Function6: f(x) = 5cos(x) + sin(x)
 *  				g. Function7: f(x) = log(x) + x^2
 */
import java.util.Scanner;
public class TestAbstractCalculateFunction {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Function1 function1 = new Function1();
		Function2 function2 = new Function2();
		Function3 function3 = new Function3();
		Function4 function4 = new Function4();
		Function5 function5 = new Function5();
		Function6 function6 = new Function6();
		Function7 function7 = new Function7();
		
		AbstractCalculateFunction[] functions = new AbstractCalculateFunction[7];
		functions[0] = function1;
		functions[1] = function2;
		functions[2] = function3;
		functions[3] = function4;
		functions[4] = function5;
		functions[5] = function6;
		functions[6] = function7;
		
		System.out.println("This is a program that calculates several functions.");
		System.out.println("The Functions are respectively:");
		
		for(AbstractCalculateFunction function: functions)
			System.out.println(function);
		
		System.out.println("===================================================");
		
		int toContinue = 1;
		double x;
		int f;
		
		while (toContinue == 1) {
			System.out.print("Enter the value of x: ");
			x = input.nextDouble();
			System.out.print("Choose a function: (Enter number 1 to 7): ");
			f = input.nextInt();
		
			switch(f) {
				case 1: System.out.printf("f(x) = %.2f\n", function1.f(x)); break;
				case 2: System.out.printf("f(x) = %.2f\n", function2.f(x)); break;
				case 3: System.out.printf("f(x) = %.2f\n", function3.f(x)); break;
				case 4: System.out.printf("f(x) = %.2f\n", function4.f(x)); break;
				case 5: System.out.printf("f(x) = %.2f\n", function5.f(x)); break;
				case 6: System.out.printf("f(x) = %.2f\n", function6.f(x)); break;
				case 7: System.out.printf("f(x) = %.2f\n", function7.f(x)); break;
				default: System.out.println("Invalid Input.");
			}
			
			System.out.print("Again? (Enter 1 to calculate functions again and others to exit): ");
			toContinue = input.nextInt();
		}

		

	}
}

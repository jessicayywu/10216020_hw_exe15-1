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
 *  
 *  			And the executing result is:
 *  				Function1: f(x) = x^2
 *					x = 5.00
 *					f(x) = 25.00
 *					============================
 *					Function2: f(x) = sin(x)
 *					x = 1.57
 *					f(x) = 1.00
 *					============================
 *					Function3: f(x) = cos(x)
 *					x = 0.00
 *					f(x) = 1.00
 *					============================
 *					Function4: f(x) = tan(x)
 *					x = 6.28
 *					f(x) = -0.00
 *					============================
 *					Function5: f(x) = cos(x) + 5sin(x)
 *					x = 4.71
 *					f(x) = -5.00
 *					============================
 *					Function6: f(x) = 5cos(x) + sin(x)
 *					x = 3.14
 *					f(x) = -5.00
 *					============================
 *					Function7: f(x) = log(x) + x^2
 *					x = 10.00
 *					f(x) = 101.00 
 */
public class TestAbstractCalculateFunction {
	/** Main method */
	public static void main(String[] args) {
		/** Test Function1 class */
		Function1 function1 = new Function1();
		function1.setX(5); // x = 5
		System.out.println(function1.toString());
		System.out.println("============================");
		
		/** Test Function2 class */
		Function2 function2 = new Function2();
		function2.setX(Math.PI / 2); // x = PI / 2
		System.out.println(function2.toString());
		System.out.println("============================");
		
		/** Test Function3 class */
		Function3 function3 = new Function3();
		function3.setX(0); // x = 0
		System.out.println(function3.toString());
		System.out.println("============================");
		
		/** Test Function4 class */
		Function4 function4 = new Function4();
		function4.setX(Math.PI * 2); // x = PI * 2
		System.out.println(function4.toString());
		System.out.println("============================");
		
		/** Test Function5 class */
		Function5 function5 = new Function5();
		function5.setX(Math.PI * 1.5); // x = PI * 1.5
		System.out.println(function5.toString());
		System.out.println("============================");
		
		/** Test Function6 class */
		Function6 function6 = new Function6();
		function6.setX(Math.PI); // x = PI
		System.out.println(function6.toString());
		System.out.println("============================");
		
		/** Test Function7 class */
		Function7 function7 = new Function7();
		function7.setX(10); // x = 10
		System.out.println(function7.toString());	
	}
}

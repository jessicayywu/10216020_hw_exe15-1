
public class TestAbstractCalculateFunction {

	public static void main(String[] args) {
		Function1 function1 = new Function1(); 
		Function2 function2 = new Function2();
		Function3 function3 = new Function3();
		Function4 function4 = new Function4();
		Function5 function5 = new Function5();
		Function6 function6 = new Function6();
		Function7 function7 = new Function7();
		
		
		System.out.println("x = " + function1.f(5));
		System.out.println("x = " + function2.f(Math.PI/2));
		System.out.println("x = " + function3.f(0));
		System.out.println("x = " + function4.f(Math.PI/4));
		System.out.println("x = " + function5.f(Math.PI));
		System.out.println("x = " + function6.f(Math.PI));
		System.out.println("x = " + function7.f(10));

	}

}

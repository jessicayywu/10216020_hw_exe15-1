
public class TestAbstractCalculateFunction {

	public static void main(String[] args) {
		Function1 function1 = new Function1();
		function1.setX(5);
		System.out.println(function1.toString());
		System.out.println("============================");
		
		Function2 function2 = new Function2();
		function2.setX(Math.PI / 2);
		System.out.println(function2.toString());
		System.out.println("============================");
		
		Function3 function3 = new Function3();
		function3.setX(0);
		System.out.println(function3.toString());
		System.out.println("============================");
		
		Function4 function4 = new Function4();
		function4.setX(Math.PI * 2);
		System.out.println(function4.toString());
		System.out.println("============================");
		
		Function5 function5 = new Function5();
		function5.setX(Math.PI * 1.5);
		System.out.println(function5.toString());
		System.out.println("============================");
		
		Function6 function6 = new Function6();
		function6.setX(Math.PI);
		System.out.println(function6.toString());
		System.out.println("============================");
		
		Function7 function7 = new Function7();
		function7.setX(10);
		System.out.println(function7.toString());	

	}

}

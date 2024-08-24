package hw17;

public class hw17StartJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	finalCoundown();
		digitsCount(23232);
		evenDigitsCount(4444);
		//xPower(5,2);
		//factorial(5);
		System.out.println(factorial(5));
		System.out.println(xPower(5,2));

	}
	public static void finalCoundown() {
		int i;
		for(i = 5; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("rega!");
		System.out.println("daka!");
		System.out.println("GO!");
		System.out.println(i);
	}
	
	public static int digitsCount(int number) {
		 int count = 0;
		    while (number > 0) {		       
		              count++;
		          number /= 10;
		    }
		    System.out.printf("Count %d \n",count);
		    return count;
	}
	public static int evenDigitsCount(int number) {
		 int count = 0;
		    while (number > 0) {		       
		    	   int digit = number % 10;
		           if (digit % 2 == 0) {
		               count++;
		           }
		           number /= 10;
		    }
		    System.out.printf("Count %d \n",count);
		    return count;
	}
	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		}
		return factorial(number - 1) * number;
	}
	
	public static int xPower(int x, int power) {
		if (x <=0 ) {
			return 0;
		}
		if (power < 0) {
			return 0;
		}
		int result = 1;
		while (power != 0) {
			result *= x;
			power -= 1;
		}

		return result;
	}

}

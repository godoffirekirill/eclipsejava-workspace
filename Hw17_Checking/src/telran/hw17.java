package telran;

public class hw17 {

	public static void main(String[] args) {
		
		int number = 12345;
		int res = digitCount(number );
		if(res == -1)
			System.out.println("Wrong data");
		else 
			System.out.println("Number of digits in " + number + " = " + res);
		
		res = evenDigitCount(number);
		printResult(res);
		number = 122;
		printResult(factorial(number));
		int power = 22;
		System.out.println(number + "^" + power + " = " + xPower(number, power));
	}

	private static int xPower(int number, int power) {
		System.out.print("xPower method: ");
		if(power <=0)
			{
			System.out.println("Wrong Power");
		return 0;
			}
		long res;
		for(res = 1; power > 0; power--) {
			res *=number;
			if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
				System.out.println("Wrong args");
				return 0;
			}
		}
		return (int) res;
	}

	private static int factorial(int number) {
		System.out.print("Factorial method: ");
		if(number <=0 || number > 12)
		return -1;
		int res;
		for(res = 1; number > 1; number --)
			res*= number;
		
		return res;
	}

	private static void printResult(int res) {
		if(res == -1)
			System.out.println("Wrong data");
		else 
			System.out.println(" result  =  " + res);
		
	}

	private static int evenDigitCount(int number) {
		System.out.print("evenDigitCountMethod:");
		if(number <= 0)
			return -1;
		int count;
		for(count = 0; number !=0; number /= 10) {
			if(number %2 ==0)
				count ++;
		}
		return count;
	}

	private static int digitCount(int number) {
		if(number <=0)
			return -1;
		int count;
		for(count = 0; number != 0; number /=10, count++) {
//			count ++;
			;
		}
		return count;
	}

}

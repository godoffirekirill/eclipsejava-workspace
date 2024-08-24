package telran;

public class FirtstIntro {
	
public static void main(String[] args) {
		
		System.out.print("Hello \n");
		System.out.println("world!");		
		System.out.printf("Today is %d of August, temp = %.2f\n", 4, 29.5);
		
		/*
		 1000 0000 - 0111 1111
		 byte    1byte (-128 - 127)
		 short   2byte(-32768 - 32767)
		 int     4byte (-2_147_643_328 - 2147643327)
		 long    8byte 
		 ===============================
		 float   4byte 
		 double  8byte
		 ===============================
		 char    2byte UNSIGNED (0 - 65534);
		 ===============================
		 boolean (true/false) 4byte (boolean[] -> 1byte)
		 */
		
		byte b = 120;
		short sh = 30567;
		System.out.println(b);
		System.out.println(sh);
		int i = 567;
		System.out.println(i);
		long lg = 123_456_789_013L;
		System.out.println(lg);
		//================================
		float f = 3.14f;
		System.out.println(f);
		double d = 3.14159;
		//================================
		char c = 'A';
		System.out.println(c);
		c = 65;
		System.out.printf("%d\n",(int)c);
		int c1 = c;
		System.out.println(c1);
		//===============================
		boolean bl = true;
		bl = i < b;
		System.out.println(bl);
		System.out.println(f == d);
		System.out.println(f < d);
		
		finalCoundown();
		//====================String=========================
		String str = "Hi!";
		//str[0];
		String str1 = ", Java";
		str = str + str1;
		System.out.println(str);
		System.out.println(1 + 2 + "number" + 3 + 4);
		
		System.out.printf("%s\n", str);
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
	
	
	
	

}

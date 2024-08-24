package telran;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr1 = {1, 2, 3, 4, 5}; 
	        int[] rArra = ArrayUtils.reverseArray(arr1);

	        System.out.println("Original Array: ");
	        ArrayUtils.printArray(arr1);

	        System.out.println("Reversed Array: ");
	        ArrayUtils.printArray(rArra);

	
		int[] arr4 = new int[20];
		ArrayUtils.fillArray(arr4, -8, 15);
		ArrayUtils.printArray(arr4);
		ArrayUtils.firstPosLastNegReverse(arr4);
		ArrayUtils.printArray(arr4);
		ArrayUtils.bubbleSort(rArra);
		ArrayUtils.printArray(rArra);

		ArrayUtils.selectSort(rArra);
		ArrayUtils.printArray(rArra);

	}

}

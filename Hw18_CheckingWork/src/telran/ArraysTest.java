package telran;

public class ArraysTest {

		public static void main(String[] args) {
			
			int[] arr = new int[20];
			ArrayUtils.fillArray(arr, -10, 10);
			ArrayUtils.printIntArray(arr);
		ArrayUtils.bubbleSort(arr);
//			ArrayUtils.selectSort(arr); 
//			ArrayUtils.firstPosLastNegReverse(arr); 
			ArrayUtils.printIntArray(ArrayUtils.reverseArray(arr));
			ArrayUtils.printIntArray(arr);
		}
	

}

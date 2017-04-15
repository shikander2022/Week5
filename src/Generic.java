//fig 20.3
public class Generic {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.printf("Array integerArray contains:%n");
		printArray(intArray);
		System.out.printf("Array doubleArray contains:%n");
		printArray(doubleArray);
		System.out.printf("Array charArray contains:%n");
		printArray(charArray);

	}

	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray)
			System.out.printf("%s", element);
		System.out.println();
	}

}


public class GenericEqual {
	public static void main(String[] args) {
		Integer[] iray = { 1, 2, 3, 4 };
		Character[] cray = { 'd', 'u', 'c', 'k' };
		printMe(iray);
		printMe(cray);
		max(1, 2);

	}

	public static <T> void printMe(T[] x) {
		for (T b : x)
			System.out.printf("%s", b);
		System.out.println();
	}

	public static <T extends Comparable<T>> T max(T a, T b) {
		T m = a;

		if (b.equals(a)) {
			System.out.print(b);

			return m;
		}
		return null;
	}
}


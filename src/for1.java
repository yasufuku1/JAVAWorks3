
public class for1 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i ++) {
			System.out.println("Hello World: " + i);
		}

		String[] array1 = {"world", "java"};
		System.out.println("配列の要素数:" + array1.length);
		for (String text :array1) {
			System.out.println(text);
		}

		int[] array2 = {1, 2, 3, 4, 5};
		System.out.println("配列の要素数:" + array2.length);
		for (int num: array2) {
			System.out.println(num);
		}
	}
}

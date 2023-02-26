
public class Break01 {
	public static void main(String[] args) {
//		ループ処理の途中でループ処理を終了させたい場合に使用する制御文（break文）
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
			System.out.println("Break01:" + count);
		}

		String[] array = {"apple", "lemon","banana", "orange"};

		for (String fruit : array) {
			if (fruit.equals("banana")) {
				break;
			}
		System.out.println(fruit);
		}
	}

}

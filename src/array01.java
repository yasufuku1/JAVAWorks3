import java.util.ArrayList;

public class array01 {
	public static void main(String[] args) {
//		配列に要素を追加する（その1）

//		int[] foo = new int[10]; //元の配列
//		int[] bar = new int[15]; //データを5個追加したい場合に用意する配列
//
//		System.arraycopy(foo, 0, bar, 0, 10);

//		配列に要素を追加する（その2）
//		コレクション(ArralyList)に値を追加する
		ArrayList<Integer> hoge = new ArrayList<Integer>();
		hoge.add(1);
		hoge.add(2);
		for (int num : hoge) {
			System.out.println(num);
		}

		String str = "neko";

		System.out.println(str.substring(1,2));

	}
}

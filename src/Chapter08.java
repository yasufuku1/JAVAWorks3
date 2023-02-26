
public class Chapter08 {
	public static void main(String[] args) {
//		1.while文
//		1以上5未満の数の2乗を出力
		int num = 1;
		while (num < 5) {
			int i =num * num;
			System.out.println(i);
			num ++;
		}

//		2.通常「for」文
//		要素数が4の「int」配列を初期化
//		配列のサイズ分ループして、要素を出力
		int[] array = {1, 2, 3, 4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

//		3.拡張「for」文
//		「2.」の配列をループ
//		要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
		for (int i: array) {
			if ( i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}

package exception;

public class Exception01 {
	public static void main(String[] args) {

			int n[] = {18, 29};
			System.out.println("開始します");
			// trｙ開始
			try {
				for(int i = 0; i < 4; i++) {
					System.out.println(n[i]);
				}
			}
			 // ArrayIndexOutOfBoundsExceptionクラスの例外が発生した場合の例外処理
			catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲を超えています");
			}
			finally {
				// 例外発生しても処理を実行
				System.out.println("終了しました");
			}
	}
}

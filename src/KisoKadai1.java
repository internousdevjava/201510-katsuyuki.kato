
import java.io.*;

public class KisoKadai1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 変数を決めて、初期化
		int x = 0;
		int y = 0;

		// whileを使ってx,yのループを作成（条件の決定）
		while (x < 1 || 100 < x) {
			try {
				System.out.println("xに1~100の値を入力してください。");
				x = 0;
				System.out.print("x=");
				x = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.out.println("数字にしてください。");
			}
		}

		while (y < 1 || 100 < y) {
			try {
				System.out.println("yに1~100の値を入力してください。");
				y = 0;
				System.out.print("x=" + x + " y=");
				y = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.out.println("数字にしてください。");
			}
		}

		// 繰り返し
		for (int i = y; i > 0; i--) {
			for (int j = 1; j <= x; j++) {
				System.out.print(i * j);
				// x*yの桁数によって余白の大きさを変化させることで調整
				if (i * j < 10) {
					System.out.print("     ");
				} else if (i * j < 100) {
					System.out.print("    ");
				} else if (i * j < 1000) {
					System.out.print("   ");
				} else if (i * j < 10000) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}

	}
}

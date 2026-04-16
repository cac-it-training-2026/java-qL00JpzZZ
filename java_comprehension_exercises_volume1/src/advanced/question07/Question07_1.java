package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		String[] itemNames = new String[5];
		int[] prices = new int[5];
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println("商品" + (i + 1) + "を入力してください: >");
			str = reader.readLine();
			itemNames[i] = str;
		}
		for (int i = 0; i < prices.length; i++) {
			System.out.println(itemNames[i] + "の単価: >");
			str = reader.readLine();
			prices[i] = Integer.parseInt(str);
		}
		System.out.println("登録商品一覧\n");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + ":" + prices[i] + "円");
		}
	}

}

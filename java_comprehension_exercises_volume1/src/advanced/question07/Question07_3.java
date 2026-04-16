package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int totalPrice = 0;

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 550, 400, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];
		int[] stocks = new int[5];
		for (int i = 0; i < amounts.length; i++) {
			stocks[i] = 5;
		}
		int i = 0;

		boolean Frag = false;

		while (!Frag) {
			System.out.print(itemNames[i] + "の在庫数: >");
			str = reader.readLine();
			if (stocks[i] < Integer.parseInt(str)) {
				System.out.println("在庫を超えています。もう一度入力してください。");
				continue;
			} else if (i != 4) {
				amounts[i] = Integer.parseInt(str);
				stocks[i] -= amounts[i];
				i++;
			} else {
				amounts[i] = Integer.parseInt(str);
				stocks[i] -= amounts[i];
				Frag = true;

			}

		}
		for (int j = 0; j < itemNames.length; j++) {
			System.out.println(itemNames[j] + ":" + "購入" + amounts[j] + "個\n" + stocks[j]);
			totalPrice += amounts[j] * prices[j];
		}
		System.out.println("合計金額：" + totalPrice);

	}
}

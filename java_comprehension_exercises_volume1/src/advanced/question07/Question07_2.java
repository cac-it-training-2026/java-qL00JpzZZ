package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] amount = new int[5];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		// 登録済み商品（値は変更可）
		int totalPrice = 0;
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 550, 400, 100 };

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			str = reader.readLine();
			amount[i] = (Integer.parseInt(str) * prices[i]);
			totalPrice += amount[i];

		}
		for (int i = 0; i < amount.length; i++) {
			System.out.println(itemNames[i] + ":" + amount[i] + "円");

		}
		System.out.println("合計金額:" + totalPrice + "円");

	}
}

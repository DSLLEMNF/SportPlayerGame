package SportPlayer;

import java.util.Scanner;

public class PlayerMarketMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = false;
		PlayerMarketService PS = new PlayerMarketService();

		while (run = true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("|1.선수등록|2.선수목록|3.구매등록|4.협상진행|5.가격변동|6.  종료|");
			System.out.println("-----------------------------------------------------------");
			Long select = scan.nextLong();
			if (select == 1L) {
				PS.SignIn();
			} else if (select == 2L) {
				PS.ShowAll();
			} else if (select == 3L) {
				PS.Buy();
			} else if (select == 4L) {
				PS.Sell();		
			} else if (select == 5L) {
				PS.PriceChange();
			} 	else if (select == 6L) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.println("다시 입력하시오");
			}
		}
	}

}

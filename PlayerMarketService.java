package SportPlayer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayerMarketService {
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	PlayerMarketRepository pmr = new PlayerMarketRepository();

	public void SignIn() {
		System.out.println("선수명 : ");
		String PlayerName = scan.next();
		System.out.println("판매자 명 :");
		String TeamName = scan.next();
		System.out.print("가격: ");
		int price = scan.nextInt();
		scan.nextLine();
		LocalDateTime dateTime = LocalDateTime.now();
		String registTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		PlayerMarketDTO PM = new PlayerMarketDTO(++id, PlayerName, TeamName, price, registTime, null, null);
		boolean playerRegist = pmr.save(PM);
		if (playerRegist) {
			System.out.println("선수등록완료");
		} else {
			System.out.println("선수등록실패");
		}

	}

	public void ShowAll() {
		List<PlayerMarketDTO> PlayerList = pmr.findAll();
		for (PlayerMarketDTO P : PlayerList) {
			System.out.println(P);
		}
	}

	public void Buy() {
		System.out.println("구매자 명: ");
		String Seller = scan.next();
		scan.nextLine();
		LocalDateTime dateTime = LocalDateTime.now();
		String registTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("전화번호 : ");
		String phone = scan.next();
		PlayerMarketBuyerDTO PMB = new PlayerMarketBuyerDTO(++id, Seller, 0, registTime, phone);
		boolean transferRegist = pmr.Buy(PMB);
		if (transferRegist) {
			System.out.println("구매등록완료");
		} else {
			System.out.println("구매등록실패");
		}System.out.println(PMB);
	}

	public void Sell() {
		System.out.println("이적시장이 열렸습니다.");
		System.out.println("구매자 명을 입력하시오");
		String Seller = scan.next();
		boolean result = pmr.tradeteam(Seller);
		if (result) {
			System.out.println("환영합니다.");
		} else {
			System.out.println("이적시장에 구매등록을 하십시오");
		}
		System.out.println(Seller + "와 협상하시겠습니까? yes or no");
		String sentence = scan.next();
		if (sentence.equals("yes")) {
			System.out.println("협상을 진행합니다.");
			System.out.println("선수의 이름을 적으시오");
			String name = scan.next();
			System.out.println("구매자의 에이전트의 전화번호를 입력하시오");
			String number = scan.next();
			System.out.println("연결 성공");
			System.out.println("가격협상을 시작합니다");
			int Pprice = 0;
			int Playerprice = pmr.playerPrice(name, Pprice);
			System.out.println(Playerprice + "만 $ 입니다");
			System.out.println("구매하시겠습니까?  yes or no");
			String sentence2 = scan.next();
			if (sentence2.equals("yes")) {
				System.out.println("협상 완료되었습니다.");
			 pmr.transfer(name,Seller);
			} else {
				System.out.println("협상결렬");
			}
		} else if (sentence.equals("no")) {
			System.out.println("구매절차를 취소합니다");
		} else {
			System.out.println("다시 입력하세요");
		}
	}

	public void PriceChange() {
		System.out.println("알고싶은 선수의 이름을 적으시오");
		String name = scan.next();
		int price= 0;
		int Condition = (int) (Math.random() * 5) + 1;
		if (Condition == 1) {
			System.out.println("계약기간이 만료되었습니다.");
			String A = "계약기간이 만료되었습니다.";
			pmr.PlayerCondition1(name,A);
		}else if(Condition == 2) {
			System.out.println("선수가 범죄를 저질렀습니다.");
			pmr.PlayerCondition2(name);
		}else if(Condition == 3) {
			System.out.println("선수가 크게 활약했습니다.");
			String C = "선수가 크게 활약했습니다";
			pmr.PlayerCondition3(name,C,price);
		}else if(Condition == 4) {
			System.out.println("선수가 부진하고 있습니다.");
			String D = "선수가 부진하고 있습니다.";
			pmr.PlayerCondition4(name,D,price);
		}else {
			System.out.println("뉴스기사가 없습니다.");
		}
	}

	public void CheckTrade() {
		List<PlayerMarketDTO> PlayerList = pmr.findAll();
		for (PlayerMarketDTO P : PlayerList) {
			System.out.println(P);
		}
		}
	}

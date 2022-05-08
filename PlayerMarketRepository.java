package SportPlayer;

import java.util.*;

public class PlayerMarketRepository {

	public List<PlayerMarketDTO> PMList = new ArrayList<>();
	public List<PlayerMarketBuyerDTO> PMBList = new ArrayList<>();

	public boolean save(PlayerMarketDTO PM) {
		return PMList.add(PM);
	}

	public List<PlayerMarketDTO> findAll() {
		return PMList;
	}

	public boolean Buy(PlayerMarketBuyerDTO PMB) {
		return PMBList.add(PMB);
	}

	public int playerPrice(String name, int Pprice) {
		Pprice = 0;
		for (int i = 0; i < PMList.size(); i++) {
			if (name.equals(PMList.get(i).getName())) {
				Pprice = PMList.get(i).getPrice();
			}
		}
		return Pprice;
	}

	public boolean tradeteam(String Buyer) {
		for (int i = 0; i < PMBList.size(); i++) {
			if (Buyer.equals(PMBList.get(i).getName())) {
			}
		}
		return true;

	}

	public void PlayerCondition1(String name, String a) {
		for (int i = 0; i < PMList.size(); i++) {
			if (name.equals(PMList.get(i).getName())) {
				PMList.get(i).setPrice(0);
				PMList.get(i).setCondition(a);
			}
		}

	}

	public void PlayerCondition2(String name) {
		for (int i = 0; i < PMList.size(); i++) {
			if (name.equals(PMList.get(i).getName())) {
				PMList.remove(i);
			}
		}
	}

	public void PlayerCondition3(String name, String c, int price) {
		for (int i = 0; i < PMList.size(); i++) {
			if (name.equals(PMList.get(i).getName())) {
				price=PMList.get(i).getPrice()+500;
				PMList.get(i).setPrice(price);
				PMList.get(i).setCondition(c);
			}
		}
	}


	public void PlayerCondition4(String name, String d, int price) {
		for (int i = 0; i < PMList.size(); i++) {
			if (name.equals(PMList.get(i).getName())) {
			  price = PMList.get(i).getPrice()-500;
			  PMList.get(i).setPrice(price);
			  PMList.get(i).setCondition(d);
			}
		}
	}

	public void transfer(String name,String Seller) {
		for (int i = 0; i < PMList.size(); i++) {
			if (name.equals(PMList.get(i).getName())) {
				PMList.get(i).setTransfer(Seller);
			}

		}
	}
}
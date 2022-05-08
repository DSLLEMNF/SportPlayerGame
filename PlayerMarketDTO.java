package SportPlayer;

public class PlayerMarketDTO {
	private Long id;
	private String name;
	private String teamname;
	private int price;
	private String time;
	private String condition;
	private String transfer;
	
	PlayerMarketDTO(){
		
	}

	public PlayerMarketDTO(Long id,String name, String teamname, int price, String time, String condition,String transfer) {
		super();
		this.id = id;
		this.name = name;
		this.teamname = teamname;
		this.price = price;
		this.time = time;
		this.condition = condition;
		this.transfer=transfer;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getTransfer() {
		return transfer;
	}

	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "PlayerMarketDTO [id=" + id + ", name=" + name + ", teamname=" + teamname + ", price=" + price
				+ ", time=" + time + ", condition=" + condition + ", transfer=" + transfer + "]";
	}
	
}

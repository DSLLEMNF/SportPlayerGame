package SportPlayer;

public class PlayerMarketBuyerDTO {
	private Long id;
	private String name;
	private String time;
	private String phone;
	
	PlayerMarketBuyerDTO(){
		
	}
	public PlayerMarketBuyerDTO(Long id, String name, int price, String time, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.phone = phone;
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


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PlayerMarketBuyerDTO [id=" + id + ", name=" + name + ", time=" + time + ", phone="
				+ phone + "]";
	}
}

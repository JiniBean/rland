package kr.co.rland.web.entity;

import java.util.Date;

public class Menu {
	private int id;
	private String korName;
	private String engName;
	private String img;
	private int price;
	private boolean like;
	private Date regDate;
	
	public Menu() {

	}

	
	
	public Menu(int id, String korName, String engName, String img, int price, boolean like, Date regDate) {
		super();
		this.id = id;
		this.korName = korName;
		this.engName = engName;
		this.img = img;
		this.price = price;
		this.like = like;
		this.regDate = regDate;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getKorName() {
		return korName;
	}


	public void setKorName(String korName) {
		this.korName = korName;
	}


	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean getLike() {
		return like;
	}

	public void setLike(boolean like) {
		this.like = like;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	
}

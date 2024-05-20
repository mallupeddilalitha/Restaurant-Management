package Global;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//All variables declared here
public class FoodOrderItems {
	public LocalDateTime currentDateTime = LocalDateTime.now();
	public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	public String formattedDateTime = currentDateTime.format(formatter);

	private String name[] = { "VEG BIRIYANI            ", "PANEER BIRIYANI         ", "PANEER SPL BIRIYANI     ",
			"KAJU PANEER BIRIYANI    ", "MUSHROOM BIRIYANI       ", "HYDERABAD SPL BIRIYANI  ",
			"CHICKEN 65 BIRIYANI     ", "SPL DUM  BIRIYANI       ", "MUTTON BIRIYANI         ",
			"CHICKEN MUGHLAI BIRIYANI", "SPRITE                  ", "THUMS UP                ",
			"COCO-COLA               ", "MAAZA                   ", "WATER BOTTLE            " };
	private String price[] = { "180", "200", "250", "300", "180", "250", "320", "280", "350", "320", "50 ", "60 ",
			"60 ", "45 ", "20 " };
	
	

	private String Uname;
	private String Uadd;
	private String UmNo;
	private static String username;
	private static String password;
	private String cardNo;

	private int count = 0;
	private int option; // main options [veg,non-veg,Drinks]
	private int n_plates;
	private int opt; // continue or exit
	private int bill_v = 0;
	private int updateBill_v = 0;
	private boolean validCode = false;

	private String feedback;

	public String[] getName() {
		return name;
	}

	public void setName(String name[]) {
		this.name = name;
	}

	public String[] getPrice() {
		return price;
	}

	public void setPrice(String price[]) {
		this.price = price;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String Uname) {
		this.Uname = Uname;
	}

	public String getUadd() {
		return Uadd;
	}

	public void setUadd(String Uadd) {
		this.Uadd = Uadd;
	}

	public String getUmNo() {
		return UmNo;
	}

	public void setUmNo(String UmNo) {
		this.UmNo = UmNo;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		FoodOrderItems.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		FoodOrderItems.password = password;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public int getN_plates() {
		return n_plates;
	}

	public void setN_plates(int n_plates) {
		this.n_plates = n_plates;
	}

	public int getOpt() {
		return opt;
	}

	public void setOpt(int opt) {
		this.opt = opt;
	}

	public int getbill_v() {
		return bill_v;
	}

	public void setbill_v(int bill_v) {
		this.bill_v = bill_v;
	}

	public int getUpdateBill_v() {
		return updateBill_v;
	}

	public void setUpdateBill_v(int updateBill_v) {
		this.updateBill_v = updateBill_v;
	}

	public boolean isValidCode() {
		return validCode;
	}

	public void setValidCode(boolean validCode) {
		this.validCode = validCode;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String[] getManagerAddedItems() {
		// TODO Auto-generated method stub
		return null;
	}

}

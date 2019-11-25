package project.practice.com;

public class simpleTest {
	
	private static int total;
	private static int finalAmount;
	
	public String FirstName;
	public String LastName;
	
	public simpleTest(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		
	}
	
	
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		simpleTest.total = total;
	}
	public static int getFinalAmount() {
		return finalAmount;
	}
	public static void setFinalAmount(int finalAmount) {
		simpleTest.finalAmount = finalAmount;
	}

}

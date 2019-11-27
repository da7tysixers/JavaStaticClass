package project.practice.com;


/**
 * @author Orubele PC
 *
 */
public class JavaStaticClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		simpleTest num1 = new simpleTest("Emmanuel", "Orubele");
		num1.setFinalAmount(49 + 22);
		
		System.out.println(num1.getFinalAmount());
		myStatfunction printResponse = new myStatfunction();
		printResponse.printInput();
		
	}

}



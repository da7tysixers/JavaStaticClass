package project.practice.com;

public class myStatfunction {
	
	private static int instanceCount = 0; //private static integer with a 0 intital value
	
	
	public myStatfunction() {   //Constructor that sets the instanceCount
		this.instanceCount++;
		
	}
	
	/*
	 * simply returns the value of the static instanceCount field.
	 */
	public static int getInstanceCount() { 
		return instanceCount;
	}
	}
	


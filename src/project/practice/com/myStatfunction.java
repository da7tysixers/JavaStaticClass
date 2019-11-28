package project.practice.com;

public class myStatfunction {
	
	private static int instanceCount = 0;
	
	
	public myStatfunction() {
		this.instanceCount++;
		
	}
	
	
	public static int getInstanceCount() {
		return instanceCount;
	}
	}
	


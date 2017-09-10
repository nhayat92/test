package sits1;

public class AddtwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is a method	
		int Number1 = 90;
		int Number2 = 10;
		addtwonumbers(Number1,Number2);
		multiplynumbers(Number1,Number2);
		subtruction(Number1,Number2);
		
	}
	private static void subtruction(int i, int j) {
		// TODO Auto-generated method stub
		int k = i-j;
		System.out.println("Subtruct numbers: " +k);
		
		
	}
	private static void multiplynumbers(int i, int j) {
		// TODO Auto-generated met Numbers 
		System.out.println("Multiply Numbers" +i*j);
		
	}
	private static void addtwonumbers(int x, int y) {
		// TODO Auto-generated method stub
		int Z;
		Z=x+y;
		System.out.println("Adding two Numbers "+Z);;
		
	}
	
	

}

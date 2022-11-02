
//Inheritance
public class basic extends level {
	
	//Encapsulation
	protected String level1;

	public String getlevel1() {
		return level1;
	}

	public void setlevel1(String level1) {
		this.level1 = level1;
	}

	//Constructor
	public basic(int point, int transaction, String level1) {
		super(point, transaction);
		this.level1 = level1;
	}
	
	//Polymorphism
	public int addPoint() {		
		int y = 10000;		
		int division = transaction-(transaction % y);
		int addPoint = (division/y)*point;
		return addPoint;		
	}
	//Polymorphism
	public void print() {
		System.out.println("\nTransaction with Basic level with the amount of "+transaction+" has rewarded you with "+addPoint()+" points");
	}
	
}

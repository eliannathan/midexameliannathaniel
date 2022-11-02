
//Inheritance
public class platinum extends level {

	//Encapsulation
	protected String level4;

	public String getLevel4() {
		return level4;
	}

	public void setLevel4(String level4) {
		this.level4 = level4;
	}
	
	//Constructor
	public platinum(int point, int transaction, String level4) {
		super(point, transaction);
		this.level4 = level4;
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
		System.out.println("\nTransaction with Platinum level with the amount of "+transaction+" has rewarded you with"+addPoint()+" points");
	}
	
	
}

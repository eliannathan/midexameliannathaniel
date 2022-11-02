
//Inheritance
public class golden extends level {
	
	//Encapsulation
	protected String level3;

	public String getLevel3() {
		return level3;
	}

	public void setLevel3(String level3) {
		this.level3 = level3;
	}

	//Constructor
	public golden(int point, int transaction, String level3) {
		super(point, transaction);
		this.level3 = level3;
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
		System.out.println("\nTransaction with Golden level with the amount of "+transaction+" has rewarded you with"+addPoint()+" points");
	}
	
	
}

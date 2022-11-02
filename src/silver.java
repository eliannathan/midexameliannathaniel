
//Inheritance
public class silver extends level {
	
	//Encapsulation
	protected String level2;

	public String getLevel2() {
		return level2;
	}

	public void setLevel2(String level2) {
		this.level2 = level2;
	}

	//Constructor
	public silver(int point, int transaction, String level2) {
		super(point, transaction);
		this.level2 = level2;
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
		System.out.println("\nTransaction with Silver level with the amount of "+transaction+" has rewarded you with"+addPoint()+" points");
	}
	
	
}

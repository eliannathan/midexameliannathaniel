
public abstract class level {
	
	//Encapsulation
	protected int point,transaction;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getTransaction() {
		return transaction;
	}

	public void setTransaction(int transaction) {
		this.transaction = transaction;
	}

	//Constructor
	public level(int point, int transaction) {
		this.point = point;
		this.transaction = transaction;
	}
	
	public abstract int addPoint();
	
	public abstract void print();
}

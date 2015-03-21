package mikeheke.studycode.designpattern.decorator1;

public class HouseCoffee extends Coffee {
	
	private int price = 25;
	
	private String description = "家庭咖啡";
	
	@Override
	public int cost() {
		return this.price;
	}

	@Override
	public String description() {
		return this.description;
	}

}

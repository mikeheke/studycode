package mikeheke.studycode.designpattern.decorator1;

public class BlackCoffee extends Coffee {

	private int price = 30;
	
	private String description = "黑咖啡";
	
	@Override
	public int cost() {
		return this.price;
	}

	@Override
	public String description() {
		return this.description;
	}
}

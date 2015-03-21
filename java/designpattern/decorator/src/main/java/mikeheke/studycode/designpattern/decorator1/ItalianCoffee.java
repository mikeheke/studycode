package mikeheke.studycode.designpattern.decorator1;

public class ItalianCoffee extends Coffee {

	private int price = 35;
	
	private String description = "意大利咖啡";
	
	@Override
	public int cost() {
		return this.price;
	}

	@Override
	public String description() {
		return this.description;
	}

}

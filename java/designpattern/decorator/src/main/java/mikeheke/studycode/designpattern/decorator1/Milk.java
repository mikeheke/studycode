package mikeheke.studycode.designpattern.decorator1;

public class Milk extends Decorator {

	private int price = 8;
	
	private String decription = "牛奶"; 
	
	public Milk(Coffee comp) {
		super(comp);
	}

	@Override
	public int cost() {
		return super.comp.cost() + this.price;
	}

	@Override
	public String description() {
		return this.decription+"-"+super.comp.description();
	}

}

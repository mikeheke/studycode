package mikeheke.studycode.designpattern.decorator1;

public class Tea extends Decorator {

	private int price = 5;
	
	private String decription = "茶"; 
	
	public Tea(Coffee comp) {
		super(comp);
	}

	@Override
	public int cost() {
		return super.comp.cost()+this.price;
	}

	@Override
	public String description() {
		return this.decription+"-"+super.comp.description();
	}

}

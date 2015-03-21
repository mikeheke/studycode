package mikeheke.studycode.designpattern.decorator1;

public class Soya extends Decorator {

	private int price = 6;
	
	private String decription = "豆浆"; 
	
	public Soya(Coffee comp) {
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

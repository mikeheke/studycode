package mikeheke.studycode.designpattern.decorator1;

public abstract class Decorator extends Coffee {
	
	protected Coffee comp;

	public Decorator(Coffee comp) {
		super();
		this.comp = comp;
	}
}

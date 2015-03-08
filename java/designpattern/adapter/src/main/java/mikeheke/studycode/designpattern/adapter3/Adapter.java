package mikeheke.studycode.designpattern.adapter3;

/**
 * 适配器对象
 * 
 * @author mike
 *
 */
public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public void request() {
		this.adaptee.specialRequest();
	}

}

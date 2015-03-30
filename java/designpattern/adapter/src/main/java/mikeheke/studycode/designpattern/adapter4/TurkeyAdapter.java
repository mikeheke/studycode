package mikeheke.studycode.designpattern.adapter4;

public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for (int i=0; i<3; i++) {
			turkey.fly();
		}
	} 

}

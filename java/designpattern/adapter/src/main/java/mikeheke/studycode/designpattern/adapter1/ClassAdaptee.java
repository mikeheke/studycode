package mikeheke.studycode.designpattern.adapter1;


public class ClassAdaptee extends Deer implements ITarget {

	public void fly() {
		System.out.println("deer fly...");
	}

}

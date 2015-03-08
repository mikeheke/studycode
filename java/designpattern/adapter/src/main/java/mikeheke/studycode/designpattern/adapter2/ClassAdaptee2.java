package mikeheke.studycode.designpattern.adapter2;

import mikeheke.studycode.designpattern.adapter1.Deer;
import mikeheke.studycode.designpattern.adapter1.ITarget;

public class ClassAdaptee2 implements ITarget {

	private Deer deer;
	
	public ClassAdaptee2(Deer deer) {
		super();
		this.deer = deer;
	}

	public void run() {
		this.deer.run();
	}

	public void fly() {
		System.out.println("deer fly...");
	}

}

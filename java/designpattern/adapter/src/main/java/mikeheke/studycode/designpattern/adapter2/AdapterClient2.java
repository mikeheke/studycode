package mikeheke.studycode.designpattern.adapter2;

import mikeheke.studycode.designpattern.adapter1.Deer;
import mikeheke.studycode.designpattern.adapter1.ITarget;

public class AdapterClient2 {

	public static void main(String[] args) {
		ITarget target = new ClassAdaptee2(new Deer());
		
		target.run();
		
		target.fly();
	}

}

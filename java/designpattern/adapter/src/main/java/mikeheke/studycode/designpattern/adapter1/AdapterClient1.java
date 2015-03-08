package mikeheke.studycode.designpattern.adapter1;

public class AdapterClient1 {

	public static void main(String[] args) {

		ITarget target = new ClassAdaptee();
		
		target.run();
		
		target.fly();
	}

}

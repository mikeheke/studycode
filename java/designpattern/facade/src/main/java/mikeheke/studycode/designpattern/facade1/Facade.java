package mikeheke.studycode.designpattern.facade1;

public class Facade {
	
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	private ClassC classC = new ClassC();

	public void methodA() {
		this.classA.doSomethingA();
	}
	
	public void methodB() {
		this.classB.doSomethingB();
	}
	
	public void methodC() {
		this.classC.doSomethingC();
	}
}

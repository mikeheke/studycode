package mikeheke.designpattern.studycode.memento1;

public class Originator {

	private String state;
	
	public void method1() {
		System.out.println("call originator method1().");
	}
	
	public Memento createMemento() {
		Memento memento = new Memento();
		memento.setState(this.state);
		return memento;
	}
	
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}

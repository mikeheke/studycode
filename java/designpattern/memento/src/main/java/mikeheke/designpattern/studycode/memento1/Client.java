package mikeheke.designpattern.studycode.memento1;

public class Client {

	public static void main(String[] args) {
		Originator ori = new Originator();
		
		Caretaker caretaker = new Caretaker();
		
		ori.setState("ON");
		
		caretaker.setMemento(ori.createMemento());
		
		System.out.println("ori current state: "+ori.getState());
		
		ori.setState("OFF");
		
		System.out.println("ori current state: "+ori.getState());
		
		ori.restoreMemento(caretaker.getMemento());
		
		System.out.println("ori restore pre state ");
		
		System.out.println("ori current state: "+ori.getState());
	}

}

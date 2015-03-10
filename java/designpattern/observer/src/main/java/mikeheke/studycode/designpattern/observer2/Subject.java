package mikeheke.studycode.designpattern.observer2;

public interface Subject {

	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObserver();
}

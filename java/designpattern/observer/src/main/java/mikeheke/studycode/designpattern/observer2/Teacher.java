package mikeheke.studycode.designpattern.observer2;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject {
	
	private String name;
	
	private String phone;
	
	private List<Observer> observerList;

	public Teacher(String name) {
		super();
		this.name = name;
		
		//
		observerList = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		this.observerList.add(observer);
	}

	public void removeObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	public void notifyObserver() {
		for (Observer o : observerList) {
			o.update(this.phone);
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		//
		this.notifyObserver();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

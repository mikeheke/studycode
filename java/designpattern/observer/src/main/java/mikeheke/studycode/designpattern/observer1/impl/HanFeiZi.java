/**
 * 
 */
package mikeheke.studycode.designpattern.observer1.impl;

import java.util.ArrayList;
import java.util.List;

import mikeheke.studycode.designpattern.observer1.IHanFeiZi;
import mikeheke.studycode.designpattern.observer1.Observable;
import mikeheke.studycode.designpattern.observer1.Observer;

/**
 * @author mike
 *
 */
public class HanFeiZi implements IHanFeiZi ,Observable {

	List<Observer> observerList = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	public void notifyObservers(String context) {
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}

	public void haveBreakfast() {
		String context = "HanFeiZi is having breakfast...";
		//System.out.println(context);
		this.notifyObservers(context);
	}

	public void haveFun() {
		String context = "HanFeizi is having fun...";
		//System.out.println(context);
		this.notifyObservers(context);
	}

}

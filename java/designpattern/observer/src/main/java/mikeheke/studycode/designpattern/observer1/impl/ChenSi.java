package mikeheke.studycode.designpattern.observer1.impl;

import mikeheke.studycode.designpattern.observer1.Observer;

public class ChenSi implements Observer {

	public void update(String context) {
		this.reportToQinShiHuang(context);
	}
	
	private void reportToQinShiHuang(String context) {
		System.out.println("ChenSi report to DaHuang: "+context);
	}

}

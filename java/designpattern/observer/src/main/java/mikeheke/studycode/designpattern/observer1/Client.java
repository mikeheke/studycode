package mikeheke.studycode.designpattern.observer1;

import mikeheke.studycode.designpattern.observer1.impl.ChenSi;
import mikeheke.studycode.designpattern.observer1.impl.HanFeiZi;
import mikeheke.studycode.designpattern.observer1.impl.LiSi;

public class Client {

	public static void main(String[] args) {
		
		Observer lisi = new LiSi();
		Observer chensi = new ChenSi();
		
		HanFeiZi hanfeizi = new HanFeiZi();
		
		hanfeizi.addObserver(lisi);
		hanfeizi.addObserver(chensi);
		
		hanfeizi.haveBreakfast();
		
		hanfeizi.haveFun();
	}

}

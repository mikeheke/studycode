package mikeheke.studycode.designpattern.adapter3;

/**
 * 客户端，接口消费端
 * 
 * @author mike
 *
 */
public class AdapterClient3 {

	public static void main(String[] args) {

		Adaptee adaptee = new Adaptee();
		
		Target adapter = new Adapter(adaptee);
		
		adapter.request();
		
	}

}

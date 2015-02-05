package mikeheke.studycode.designpattern.prototype2;

import java.io.IOException;
import java.io.OptionalDataException;
import java.util.HashMap;
import java.util.Map;

public class Client2 {

	public static void main(String[] args) throws OptionalDataException, ClassNotFoundException, IOException {

		User u1 = new User();
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("aaa", "bbb");
		u1.setName("u1");
		u1.setPros(m1);
		
		User u2 = u1.clone();
		User u3 = u1.deepClone();
		
		u1.getPros().put("aaa", "ccc");
		
		System.out.println(u2.getPros().get("aaa"));
		
		System.out.println(u3.getPros().get("aaa"));
	}

}

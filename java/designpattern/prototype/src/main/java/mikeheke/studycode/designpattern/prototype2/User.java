package mikeheke.studycode.designpattern.prototype2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Cloneable, Serializable {

	private String name;

	private Map<String, String> pros = new HashMap<String, String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getPros() {
		return pros;
	}

	public void setPros(Map<String, String> pros) {
		this.pros = pros;
	}

	@Override
	protected User clone() {
		try {
			return (User) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * deep clone 
	 * @return
	 * @throws IOException
	 * @throws OptionalDataException
	 * @throws ClassNotFoundException
	 */
	public User deepClone() throws IOException, OptionalDataException,
			ClassNotFoundException {

		// 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return (User)ois.readObject();

	}

}

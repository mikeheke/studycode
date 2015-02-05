package mikeheke.studycode.designpattern.prototype1;

public class Apple implements Cloneable {

	private String name;
	
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	protected Apple clone() {
		try {
			return (Apple)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("Apple is not supported to clone!!!");
			return null;
		}
	}
	
}

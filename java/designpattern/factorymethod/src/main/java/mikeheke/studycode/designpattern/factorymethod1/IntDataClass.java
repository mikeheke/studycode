package mikeheke.studycode.designpattern.factorymethod1;

public class IntDataClass implements IDataClass {

	private int value = 100;
	
	public void displayValue() {
		System.out.println(value);
	}

}

package mikeheke.studycode.designpattern.factorymethod1;

public class DoubleDataClass implements IDataClass {

	private double value = 100.001;
	
	public void displayValue() {
		System.out.println(value);
	}

}

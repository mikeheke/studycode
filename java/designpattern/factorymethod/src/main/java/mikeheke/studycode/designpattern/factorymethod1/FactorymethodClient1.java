package mikeheke.studycode.designpattern.factorymethod1;

public class FactorymethodClient1 {

	public static void main(String[] args) {
		IDataClass dataClass = DataClassFactory.getDataClass("int");
		dataClass.displayValue();
		
		dataClass = DataClassFactory.getDataClass("double");
		dataClass.displayValue();
	}

}

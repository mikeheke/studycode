package mikeheke.studycode.designpattern.factorymethod1;

public class DataClassFactory {

	public static IDataClass getDataClass(String dataType) {
		IDataClass dataClass = null;
				
		if ("int".equals(dataType)) {
			dataClass = new IntDataClass();
		} else if ("double".equals(dataType)) {
			dataClass = new DoubleDataClass();
		}
		
		return dataClass;
	}
}

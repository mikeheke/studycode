package mikeheke.studycode.designpattern.templatemethod2;

import java.sql.ResultSet;

public interface ResultSetHandler<T> {

	public T handle(ResultSet rs);
	
}

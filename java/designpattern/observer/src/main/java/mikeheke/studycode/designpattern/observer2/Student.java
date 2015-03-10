package mikeheke.studycode.designpattern.observer2;

public class Student implements Observer {
	
	private String name;
	
	private String teacherPhone;

	public Student(String name) {
		super();
		this.name = name;
	}

	public void update(Object object) {
		this.teacherPhone = (String)object;
	}

	public void show() {
		System.out.println("student: "+this.name+", teacher's phone: "+this.teacherPhone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
}

package mikeheke.studycode.designpattern.singleton1;

public class SingletonClient1 {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton);
		
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton2);
	}

}

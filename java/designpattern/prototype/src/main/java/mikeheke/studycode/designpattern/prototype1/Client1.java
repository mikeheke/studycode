package mikeheke.studycode.designpattern.prototype1;

public class Client1 {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.setName("china apple");
		a.setColor("red");
		
		System.out.println(a.getName()+" , "+a.getColor());
		
		Apple b = a.clone();
		
		System.out.println(b.getName()+" , "+b.getColor());

	}

}

package mikeheke.studycode.designpattern.observer2;

public class ObserverClient2 {

	public static void main(String[] args) {

		Teacher chaoran = new Teacher("He Chao Ran");
		
		Student mike = new Student("Mike He");
		Student darling = new Student("Darling He");
		Student wenyan = new Student("He Wen Yan");
		
		chaoran.registerObserver(mike);
		chaoran.registerObserver(darling);
		chaoran.registerObserver(wenyan);
		
		chaoran.setPhone("13596801235");
		
		mike.show();
		darling.show();
		wenyan.show();
		
		chaoran.setPhone("18909387656");
		
		mike.show();
		darling.show();
		wenyan.show();

	}

}

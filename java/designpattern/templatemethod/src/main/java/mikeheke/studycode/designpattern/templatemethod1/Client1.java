package mikeheke.studycode.designpattern.templatemethod1;

public class Client1 {

	public static void main(String[] args) {
		AbstractHappyPeople passengerByTrain = new PassengerByTrain();
		AbstractHappyPeople passengerByBus = new PassengerByBus();
		AbstractHappyPeople passengerByAir = new PassengerByAir();
		
		System.out.println("Mike is going home for Spring Festival.");
		passengerByBus.celebrateSpringFestival();
		
		System.out.println("Joe is going home for Spring Festival.");
		passengerByAir.celebrateSpringFestival();

		
		System.out.println("John is going home for Spring Festival.");
		passengerByTrain.celebrateSpringFestival();

	}

}

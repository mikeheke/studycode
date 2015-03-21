package mikeheke.studycode.designpattern.decorator1;

public class DecoratorClient1 {

	public static void main(String[] args) {

		Coffee blackCoffee = new BlackCoffee();
		Coffee houseCoffee = new HouseCoffee();
		Coffee italianCoffee = new ItalianCoffee();
	
		
		System.out.println(new Milk(houseCoffee).description());
		System.out.println(new Soya( new Milk(houseCoffee)).description());
		
		Coffee cf1 = new Soya(italianCoffee);
		System.out.println(cf1.description()+", "+cf1.cost()+" 元.");
		
		Coffee cf2 = new Tea(new Milk(blackCoffee));
		System.out.println(cf2.description()+", "+cf2.cost()+" 元.");
		
	}

}

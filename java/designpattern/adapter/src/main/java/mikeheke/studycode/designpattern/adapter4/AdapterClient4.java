package mikeheke.studycode.designpattern.adapter4;

import junit.extensions.TestDecorator;

public class AdapterClient4 {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		testDuck(duck);
		testDuck(turkeyAdapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	public static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}

}

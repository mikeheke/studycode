package mikeheke.studycode.designpattern.mediator1;

public class Client {

	public static void main(String[] args) {

		ConcreteColleague1 colleague1 = new ConcreteColleague1();
		ConcreteColleague2 colleague2 = new ConcreteColleague2();
		ConcreteColleague3 colleague3 = new ConcreteColleague3();
		
		Mediator mediator = new ConcreteMediator();
		
		//
		mediator.setConcreteColleague1(colleague1);
		mediator.setConcreteColleague2(colleague2);
		mediator.setConcreteColleague3(colleague3);
		
		//
		colleague1.setMediator(mediator);
		colleague2.setMediator(mediator);
		colleague3.setMediator(mediator);
		
		//
		colleague2.dependMethod2();
		
	}

}

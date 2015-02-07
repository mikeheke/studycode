package mikeheke.studycode.designpattern.mediator1;

public abstract class Colleague {

	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
}

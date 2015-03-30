package mikeheke.studycode.designpattern.facade2;

public class HomeTheaterFacade {

	private CDPlayer cdplayer;
	private DVDPlayer dvdplayer;
	private Screen screen;
	private Tuner tuner;
	private TV tv;
	
	public HomeTheaterFacade(CDPlayer cdplayer, DVDPlayer dvdplayer,
			Screen screen, Tuner tuner, TV tv) {
		super();
		this.cdplayer = cdplayer;
		this.dvdplayer = dvdplayer;
		this.screen = screen;
		this.tuner = tuner;
		this.tv = tv;
	}

	public void watchMovie() {
		this.tv.on();
		this.tuner.setVolume(5);
		this.dvdplayer.on();
		this.cdplayer.on();
		this.screen.setWideScreen();
	}
	
	public void endMovie() {
		this.cdplayer.off();
		this.dvdplayer.off();
		this.screen.closeScreen();
		this.tuner.setVolume(0);
		this.tv.off();
	}
}

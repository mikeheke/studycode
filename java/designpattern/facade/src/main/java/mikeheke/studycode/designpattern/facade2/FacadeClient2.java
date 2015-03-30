package mikeheke.studycode.designpattern.facade2;

public class FacadeClient2 {

	public static void main(String[] args) {
		CDPlayer cdplayer = new CDPlayer();
		DVDPlayer dvdplayer = new DVDPlayer();
		Screen screen = new Screen();
		Tuner tuner = new Tuner();
		TV tv = new TV();
		
		HomeTheaterFacade facade = new HomeTheaterFacade(cdplayer, dvdplayer, screen, tuner, tv);
	
		facade.watchMovie();
		System.out.println("----------");
		facade.endMovie();
	}

}

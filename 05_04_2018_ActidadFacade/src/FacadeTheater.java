
public class FacadeTheater {
	Projector projector;
	Lights lights;
	DvdPlayer dvd;
	SoundSystem snds;
	
	FacadeTheater(){
		projector = new Projector();
		lights = new Lights();
		dvd = new DvdPlayer();
		snds = new SoundSystem();
	}

	public String watchMovie(){
		String string = "";
		
		string += projector.on();
		string += snds.on();
		string += lights.off();
		string += dvd.putMovie();
		
		return string;
		
	}
	
	public String stopEverything(){
		String string = "";
		
		string += dvd.off();
		string += projector.off();
		string += snds.off();
		string += lights.on();
		
		
		return string;
		
	}
	
	public String pauseMovie(){
		String string = "";
		
		string += dvd.pauseVideo();
		string += lights.on();
		
		return string;
	}
}

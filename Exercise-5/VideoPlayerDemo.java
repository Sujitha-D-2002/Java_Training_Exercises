/*
 * Bridge Pattern
 */
interface VideoPlatform{
	public String playOn();
}
class Netflix implements VideoPlatform{
	@Override
	public String playOn() {
		return "Netflix";
	}
}
class HotStar implements VideoPlatform{
	@Override
	public String playOn() {
		return "Hotstar";
	}	
}


abstract class Video{
	VideoPlatform platform;
	public Video(VideoPlatform plat) {
		platform=plat;
	}
	abstract public void play(); 
}


class Movie extends Video{
	public Movie(VideoPlatform plat){
		super(plat);
	}
	
	public void play() {
		System.out.println("Play video in "+platform.playOn());
	}
}
public class VideoPlayerDemo {
	public static void main(String[] args) {
		Video video=new Movie(new Netflix());
		video.play();

	}
}

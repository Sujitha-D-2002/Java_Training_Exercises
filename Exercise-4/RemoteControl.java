/**
 * Command Pattern is implemented here by using the BedRoomRemoteControl as
 * remoteControl class for that it have electronic devices class as
 * AC,Light,Tv,Dish and it has its own functionalities.
 */
class AC {
	public void acOn() {
		System.out.println("AC On...");
	}

	public void acOff() {
		System.out.println("AC Off...");
	}

}

class Light {
	public void lightOn() {
		System.out.println("Light On...");
	}

	public void lightOff() {
		System.out.println("Light Off...");
	}
}

class Tv {
	public void tvOn() {
		System.out.println("TV On...");
	}

	public void avMode1() {
		System.out.println("AV Mode 1 On...");
	}

	public void avMode2() {
		System.out.println("AV Mode 2 On...");
	}

	public void tvOff() {
		System.out.println("TV Off...");
	}

}

class Dish {
	public void cartoonChannel() {
		System.out.println("Cartoon channel....");
	}

	public void sportsChannel() {
		System.out.println("Sports channel.....");
	}
}

abstract class Command {
	Tv tv;
	Light light;
	AC ac;
	Dish dish;

	abstract public void execute();
}

/**
 * Cartoon Command class executes the cartoon command channel as tv on and
 * change channel to cartoon in dish ..
 *
 */
class CartoonCommand extends Command {
	CartoonCommand(Tv tv, Light light, AC ac, Dish dish) {
		this.tv = tv;
		this.light = light;
		this.ac = ac;
		this.dish = dish;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Cartoon command...!!");
		tv.tvOn();
		tv.avMode1();
		light.lightOn();
		ac.acOn();
		dish.cartoonChannel();
	}

}
/**
 * Sports Command class executes the sport command channel as tv on and
 * change channel to sports in dish ..
 *
 */
class SportsCommand extends Command {
	SportsCommand(Tv tv, Light light, AC ac, Dish dish) {
		this.tv = tv;
		this.light = light;
		this.ac = ac;
		this.dish = dish;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Sports command...!!");
		tv.tvOn();
		tv.avMode1();
		light.lightOn();
		ac.acOn();
		dish.cartoonChannel();

	}

}
/**
 * SleepingTime Command class executes the SleepingTime command as tv off and
 * lights off ..
 *
 */
class SleepingTimeCommand extends Command {
	SleepingTimeCommand(Tv tv, Light light, AC ac, Dish dish) {
		this.tv = tv;
		this.light = light;
		this.ac = ac;
		this.dish = dish;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Sleeptime command...!!");
		tv.tvOff();
		light.lightOff();
		ac.acOn();

	}

}

public class RemoteControl {

	public static void main(String[] args) {
		Tv tv = new Tv();
		AC ac = new AC();
		Light light = new Light();
		Dish dish = new Dish();

		SleepingTimeCommand sleep = new SleepingTimeCommand(tv, light, ac, dish);
		sleep.execute();
	}

}

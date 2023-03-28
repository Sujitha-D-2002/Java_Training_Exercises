/**
 * Builder Pattern used to define complex class into sub classes but letting
 * main object to which class to instantiate
 */
class Motor {
	/**
	 * Sensor, Battery, VaccumCleaner,Motor class is subclass of Robot class
	 */
	Magnet magnet;
	Wire wires;

	Motor(Magnet magnet, Wire wires) {
		this.magnet = magnet;
		this.wires = wires;

		System.out.println("Magnet get created...!");
	}

	/**
	 * To create motor there is need of magnet, wire and so on.. for that here that
	 * classes were set to motors and atlast build the Motor
	 *
	 */
	static class BulidMotor {
		Magnet magnet;
		Wire wires;

		public BulidMotor setMagnet(Magnet magnet) {
			this.magnet = magnet;
			return this;
		}

		public BulidMotor setWires(Wire wires) {
			this.wires = wires;
			return this;
		}

		public Motor build() {
			return new Motor(magnet, wires);
		}
	}

}

/*
 * Magnet, Wire are subclass of Motor.Fan, Suction Pipe, Bag are subclass of
 * Vaccumcleaner Class
 */
class Magnet {

}

class Wire {

}

class Sensor {
	Sensor() {

	}
}

class Battery {
	Battery() {

	}
}

class Fan {

}

class SuctionPipe {

}

class Bag {

}

class VaccumCleaner {
	Fan fan;
	SuctionPipe pipe;
	Bag bag;

	/**
	 * To create vaccum cleaner there is need of fan, suction pipe and so on.. for
	 * that here that classes were set to vaccum cleaner and atlast build the
	 * vaccumcleaner
	 *
	 */
	VaccumCleaner(Fan fan, SuctionPipe pipe, Bag bag) {
		this.fan = fan;
		this.pipe = pipe;
		this.bag = bag;

		System.out.println("Vaccumcleaner get created...!");
	}

	static class BuildVaccumCleaner {
		Fan fan;
		SuctionPipe pipe;
		Bag bag;

		public BuildVaccumCleaner setFan(Fan fan) {
			this.fan = fan;
			return this;
		}

		public BuildVaccumCleaner setPipe(SuctionPipe pipe) {
			this.pipe = pipe;
			return this;
		}

		public BuildVaccumCleaner setBag(Bag bag) {
			this.bag = bag;
			return this;
		}

		public VaccumCleaner build() {
			return new VaccumCleaner(fan, pipe, bag);
		}
	}
}

class Robot {
	/**
	 * To create Robot there is need of DCMotor, sensor, battery and so on.. for
	 * that here that classes were set to Robot and atlast build the Robot
	 *
	 */
	Motor DCMotor;
	Sensor ultrasonicSensor;
	Battery battery;
	VaccumCleaner robotVaccumCleaner;

	Robot(Motor DCMotor, Sensor ultrasonicSensor, Battery battery, VaccumCleaner robotVaccumCleaner) {
		this.DCMotor = DCMotor;
		this.ultrasonicSensor = ultrasonicSensor;
		this.battery = battery;
		this.robotVaccumCleaner = robotVaccumCleaner;

		System.out.println("Robot get created.....");
	}

	static class BuildRobot {
		Motor DCMotor;
		Sensor ultrasonicSensor;
		Battery battery;
		VaccumCleaner robotVaccumCleaner;

		public BuildRobot setMotor(Motor DCMotor) {
			this.DCMotor = DCMotor;
			return this;
		}

		public BuildRobot setSensor(Sensor ultrasonicSensor) {
			this.ultrasonicSensor = ultrasonicSensor;
			return this;
		}

		public BuildRobot setBattery(Battery battery) {
			this.battery = battery;
			return this;
		}

		public BuildRobot setVaccumCleaner(VaccumCleaner robotVaccumCleaner) {
			this.robotVaccumCleaner = robotVaccumCleaner;
			return this;
		}

		public Robot build() {
			return new Robot(DCMotor, ultrasonicSensor, battery, robotVaccumCleaner);
		}
	}
}

public class RobotBuilder {

	public static void main(String[] args) {
		/**
		 * Here the robot components are in separate classes here according to
		 * requirement we are creating the components needed and set with robots and
		 * build.
		 */
		Robot robot = new Robot.BuildRobot()
				.setMotor(new Motor.BulidMotor().setMagnet(new Magnet()).setWires(new Wire()).build())
				.setSensor(new Sensor()).setBattery(new Battery())
				.setVaccumCleaner(new VaccumCleaner.BuildVaccumCleaner().setBag(new Bag()).setFan(new Fan())
						.setPipe(new SuctionPipe()).build())
				.build();

	}

}

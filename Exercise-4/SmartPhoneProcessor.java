/**
 * 
 * @author sujithadhamotharan 
 * Strategy Pattern
 */
interface Processor {
	public void getProcessorNeeded();
}

/**
 * Here Strategy pattern used by having family algorithm as processor all mobile
 * phones need processor and encapsulated by using interface where the
 * functionlity is written in subclass and it can be interchangeble
 *
 */
class QualcommSnapdragon implements Processor {

	@Override
	public void getProcessorNeeded() {
		// TODO Auto-generated method stub
		System.out.println("Qalcomm Snapdragon: The highest performing yet...!!");
	}

}

class AppleA16Bionic implements Processor {
	public void getProcessorNeeded() {
		// TODO Auto-generated method stub
		System.out.println("Apple A16 Bionic: Less powerful than the Snapdragon...");
	}
}

class Dimensity9000 implements Processor {
	public void getProcessorNeeded() {
		// TODO Auto-generated method stub
		System.out.println("Dimensity9000: CPU of the MediaTek Dimensity performs better than the Snapdragon...");

	}
}

class SmartPhone {
	/**
	 * In Smartphone class try to set name and processor for the mobile phones
	 */
	String name;
	Processor processor;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setProccessor(Processor processor) {
		this.processor = processor;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void processorNeeded() {
		processor.getProcessorNeeded();
	}
}

public class SmartPhoneProcessor {
	/*
	 * SmartPhoneProcesssor Class get the information of smartphone and pass it to
	 * smartphone class
	 */
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.setName("	Vivo X80");
		String name = phone.getName();
		System.out.println("Mobile name: " + name);
		phone.setProccessor(new Dimensity9000());
		phone.processorNeeded();

	}

}

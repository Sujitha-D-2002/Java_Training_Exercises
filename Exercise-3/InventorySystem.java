import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventorySystem {
	/**
	 * 
	 * Here InventorySystem class explains about the product comsumer process by
	 * explaining consumer try to purchase product if product is not there then it
	 * wait for the producer to add product it notify the producer thread or else
	 * consumer can able to purchase and vice versa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(2);
		Product choclate = new Product();
		es.execute(() -> {
			Thread.currentThread().setName("producer");
			choclate.addProduct();
		});

		es.execute(() -> {
			Thread.currentThread().setName("consumer");
			choclate.consumeProduct();
		});

		es.shutdown();
	}

}

class Product {
	boolean flag;

	/**
	 * it notifies the product is ready to the consumer thread
	 */
	synchronized public void addProduct() {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Product added..\nNow the Inventory has max of one product ready for consume....");
		flag = true;
		notify();
	}

	/**
	 * it notifies the product is empty to the product thread
	 */
	synchronized public void consumeProduct() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Product purchased...\nNow the Inventory has zero product please add the product....");
		flag = false;
		notify();
	}
}
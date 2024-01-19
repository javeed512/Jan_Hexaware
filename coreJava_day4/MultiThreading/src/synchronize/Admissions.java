package synchronize;

public class Admissions implements Runnable {

	int seats = 1;

	public static void main(String[] args) {

		Runnable admission = new Admissions();

		Thread t1 = new Thread(admission, "Satish");

		Thread t2 = new Thread(admission, "Raju");

		t1.start();

		t2.start();

	}

	@Override
	public synchronized void run() {

		System.out.println("No of seats before : " + seats);

		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } // 1000 ms = 1sec
		 */		
		if (seats > 0) {

			System.out.println("Seat allocated to  " + Thread.currentThread().getName());

			seats = seats - 1;

		}
		else {
			
			System.out.println("Sorry Try Next Year");
			
		}
		

		System.out.println("No of seats left after " + seats);

	}

}

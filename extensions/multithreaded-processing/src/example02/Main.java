package example02;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Main thread started!");

		Thread childThread = new Thread(() -> {
			System.out.println("Child thread started!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child thread ended!");
		});
		
		childThread.start();
		
		System.out.println("Main thread ended!");

    }
    
}

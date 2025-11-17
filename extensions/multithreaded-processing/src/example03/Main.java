package example03;

public class Main {

    public static void main(String[] args) {
        
        /*
         * Main-thread và childThread chạy song song, Main-thread phụ thuộc vào childThread
         */

        // System.out.println("Main thread started!");

		// Thread childThread = new Thread(() -> {
		// 	System.out.println("Child thread started!");
		// 	try {
		// 		Thread.sleep(5000);
		// 	} catch (InterruptedException e) {
		// 		e.printStackTrace();
		// 	}
		// 	System.out.println("Child thread ended!");
		// });
		
		// childThread.start();
		// try {
		// 	childThread.join();
		// } catch (InterruptedException e) {
		// 	e.printStackTrace();
		// }
		
		// System.out.println("Main thread ended!");

        /*
         * Main-thread, childThread1 và childThread2 chạy song song, childThread2 phụ thuộc
         * vào childThread1
         */

        System.out.println("Main thread started!");

		Thread childThread1 = new Thread(() -> {
			System.out.println("Child thread 1 started!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child thread 1 ended!");
		});
		
		Thread childThread2 = new Thread(() -> {
			System.out.println("Child thread 2 started!");
			try {
				childThread1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child thread 2 ended!");
		});
		
		childThread1.start();
		childThread2.start();
		
		System.out.println("Main thread ended!");

    }
    
}

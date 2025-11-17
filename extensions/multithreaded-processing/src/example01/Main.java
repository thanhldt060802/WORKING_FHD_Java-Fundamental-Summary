package example01;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Main thread started!");

		Thread childThread1 = new Thread(() -> {
			System.out.println("Child thread 1 started!");
			System.out.println("Child thread 1 ended!");
		});
		
		Thread childThread2 = new Thread(() -> {
			System.out.println("Child thread 2 started!");
			System.out.println("Child thread 2 ended!");
		});
		
		Thread childThread3 = new Thread(() -> {
			System.out.println("Child thread 3 started!");
			System.out.println("Child thread 3 ended!");
		});
		
		childThread1.start();
		childThread2.start();
		childThread3.start();
		
		System.out.println("Main thread ended!");

    }
    
}

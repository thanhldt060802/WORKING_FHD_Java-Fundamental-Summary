package example04;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Main thread started!");

		Thread childThread = new Thread(() -> {
			System.out.println("Child thread started!");
			System.out.println("Child thread ended!");
		});
		
		childThread.start();
		childThread.start();  // Lỗi!
		
		System.out.println("Main thread ended!");

    }
    
}

package example01;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        Date currentDateTime = new Date();
		System.out.println("Current date time: " + currentDateTime);
		
		System.out.println();
		
		Date customDateTime = new Date(System.currentTimeMillis() - 5 * 60 * 60 * 1000);
		System.out.println("Custom date time: " + customDateTime);

    }
    
}

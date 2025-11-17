package example07;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    
    public static void main(String[] args) {
        
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));
		ZonedDateTime hcmVNTime = ZonedDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));

		System.out.println("UTC date time: " + utcTime);
		System.out.println("Date time in HCM Vietnam: " + hcmVNTime);

    }
    
}

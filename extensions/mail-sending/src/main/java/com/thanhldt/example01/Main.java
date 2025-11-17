package com.thanhldt.example01;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Main {

    public static void main(String[] args) {
        
        String fromEmail = "your-email-to-send";
		String appPassword = "your-app-password";
		String toEmail = "your-email-to-receive";

		// Khởi tạo thông tin cấu hình SMTP server
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// Xác thực tài khoản
		Authenticator auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, appPassword);
			}
		};
		
		// Khởi động một phiên làm việc để xử lý gửi Email
		Session session = Session.getInstance(properties, auth);

		try {
			// Tạo email
			MimeMessage message = new MimeMessage(session);
			message.setFrom(fromEmail);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
			message.setSubject("Test for sending Email");
			message.setText("This Email from Lê Đào Tấn Thành company.\n"
					+ "Welcome to Lê Đào Tấn Thành company!");

			// Gửi email
			Transport.send(message);
			
			System.out.println("Send Email success!");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

    }
    
}

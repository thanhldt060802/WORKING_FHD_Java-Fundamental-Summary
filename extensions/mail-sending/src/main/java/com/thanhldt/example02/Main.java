package com.thanhldt.example02;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Main {

    public static void main(String[] args) {
        
		String fromEmail = "your-email-to-send";
		String appPassword = "your-app-password";
		String toEmail = "your-email-to-receive";

		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		Authenticator auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, appPassword);
			}
		};
		
		Session session = Session.getInstance(properties, auth);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(fromEmail);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
			message.setSubject("Test for sending Email");
			
			Multipart multipart = new MimeMultipart();
			
			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("This Email from Lê Đào Tấn Thành company.");
			multipart.addBodyPart(messageBodyPart1);
			
			BodyPart messageBodyPart2 = new MimeBodyPart();
			String htmlContent = ""
					+ "<html>"
					+ "<body>"
					+ "<p>Welcome to <strong style='color: red;'>Lê Đào Tấn Thành</strong> company.</p>"
					+ "</body>"
					+ "</html>";
			messageBodyPart2.setContent(htmlContent, "text/html; charset=utf-8");
			multipart.addBodyPart(messageBodyPart2);
			
			message.setContent(multipart);
			
			Transport.send(message);
			
			System.out.println("Send Email success!");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

    }
    
}

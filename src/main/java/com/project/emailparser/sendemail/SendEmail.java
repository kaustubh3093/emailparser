package com.project.emailparser.sendemail;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {

   public String sendMail(String toAddress) { 
      // Recipient's email ID needs to be mentioned.
      String to = toAddress;

      // Sender's email ID needs to be mentioned
      String from = "shubhamp489@gmail.com";

      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();
      properties.put("mail.debug", "true");
      properties.put("mail.smtp.socketFactory.port", "465");
      properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", "465");
      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      // Get the default Session object.
      Session session = Session.getInstance(properties, 
  			new javax.mail.Authenticator() {
  				protected PasswordAuthentication getPasswordAuthentication() {
  					return new PasswordAuthentication(from,"abc@12234");
  				}
  			});

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Now set the actual message
         message.setText("This is actual message");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
         return "Sent message successfully....";
      } catch (MessagingException mex) {
         throw new RuntimeException(mex);
      }
   }
}

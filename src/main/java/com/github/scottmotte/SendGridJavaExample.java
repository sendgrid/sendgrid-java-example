package com.github.scottmotte;

import java.lang.*;
import com.github.sendgrid.SendGrid;

public class SendGridJavaExample {
  public static void main(String[] args) {
    String sendgrid_username  = System.getenv("SENDGRID_USERNAME");
    String sendgrid_password  = System.getenv("SENDGRID_PASSWORD");
    String to                 = System.getenv("TO");

    SendGrid sendgrid = new SendGrid(sendgrid_username, sendgrid_password);

    sendgrid.addTo(to);
    sendgrid.addToName("Owl");
    sendgrid.setFrom(to);
    sendgrid.setFromName("Owl");
    sendgrid.setReplyTo("no-reply@owl.com");
    sendgrid.setSubject("[sendgrid-java-example] Owl");
    sendgrid.setHtml("<strong>Owl are you doing?</strong>");
    sendgrid.setText("Owl are you doing?");

    String response = sendgrid.send();
    System.out.println(response);
  }
}

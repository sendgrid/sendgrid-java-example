package com.github.scottmotte;

import java.lang.*;
import java.io.File;
import com.sendgrid.*;

public class SendGridJavaExample {
  public static void main(String[] args) {
    String sendgrid_username  = System.getenv("SENDGRID_USERNAME");
    String sendgrid_password  = System.getenv("SENDGRID_PASSWORD");
    String to                 = System.getenv("TO");
    System.out.println(sendgrid_username);
    SendGrid sendgrid = new SendGrid(sendgrid_username, sendgrid_password);
    SendGrid.Email email = new SendGrid.Email();

    email.addTo(to);
    email.setFrom(to);
    email.setFromName("Owl");
    email.setReplyTo("no-reply@owl.com");
    email.setSubject("[sendgrid-java-example] Owl");
    email.setHtml("<strong>Owl are you doing?</strong>");
    email.setText("Owl are you doing?");

    //File file = new File("./gif.gif");
    //email.addAttachment("owl.gif", file);


    try {
      SendGrid.Response response = sendgrid.send(email);
      System.out.println(response.getMessage());
    } catch (SendGridException e) {
      System.out.println(e);
    }
  }
}

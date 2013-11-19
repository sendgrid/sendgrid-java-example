package com.github.scottmotte;

import java.lang.*;
import com.github.sendgrid.SendGrid;

public class SendGridJavaExample {
  public static void main() {
    String sendgrid_username  = "motte777"; //System.getenv("SENDGRID_USERNAME");
    String sendgrid_password  = "motte777"; //System.getenv("SENDGRID_PASSWORD");
    String to                 = "motte@sendgrid.com"; //System.getenv("TO");

    SendGrid sendgrid = new SendGrid(sendgrid_username, sendgrid_password);

    sendgrid.addTo(to);
    sendgrid.setFrom(to);
    sendgrid.setSubject("[sendgrid-java-example] Owl");
    sendgrid.setHtml("<strong>Owl are you doing?</strong>");
    sendgrid.setText("Owl are you doing?");

    sendgrid.send();
  }
}


package org.ait.firstSeleniumProject.models;

public class Recipient {
   private String recipientName;
    private String recipientEmail;

    public Recipient setRecipientName(String recipientName) {
        this.recipientName = recipientName;
        return this;
    }

    public Recipient setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
        return this;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }


}
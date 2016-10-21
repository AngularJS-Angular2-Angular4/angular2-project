package com.centurylink.pctl.mod.notification.domain;

/**
 * Created by pulapakas on 17-10-2016.
 */
public class NotificationRequest {

    private Notification messageNotification;

    private Notification emailNotification;

    public NotificationRequest() {
    }

    public NotificationRequest(Notification messageNotification, Notification emailNotification) {
        this.emailNotification = messageNotification;
        this.messageNotification = messageNotification;
    }

    public Notification getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Notification emailNotification) {
        this.emailNotification = emailNotification;
    }

    public Notification getMessageNotification() {
        return messageNotification;
    }

    public void setMessageNotification(Notification messageNotification) {
        this.messageNotification = messageNotification;
    }
}

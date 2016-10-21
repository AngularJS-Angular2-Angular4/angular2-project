package com.centurylink.pctl.mod.notification.domain;

import com.centurylink.pctl.mod.common.utils.Response;

import java.util.List;

/**
 * Created by pulapakas on 17-10-2016.
 */
public class NotificationResponse {

    public Response<Notification> messageNotification;
    public Response<Notification> emailNotification;
    List<Notification> response;

    public Response<Notification> getMessageNotification() {
        return messageNotification;
    }

    public void setMessageNotification(Response<Notification> messageNotification) {
        this.messageNotification = messageNotification;
    }

    public Response<Notification> getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Response<Notification> emailNotification) {
        this.emailNotification = emailNotification;
    }

    public List<Notification> getResponse() {
        return response;
    }

    public void setResponse(List<Notification> response) {
        this.response = response;
    }


}

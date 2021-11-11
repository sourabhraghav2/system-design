package com.model.notification;

public class HardTicket extends Notification {
    @Override
    public boolean pushNotification(String nId, String uId, String message) {
        return false;
    }
}

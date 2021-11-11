package com.model.notification;


public abstract class Notification {
    String nId;
    String uId;
    public abstract boolean pushNotification(String nId, String uId,String message);
}

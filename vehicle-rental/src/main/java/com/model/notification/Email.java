package com.model.notification;

import lombok.Data;

@Data
public class Email extends Notification {

    @Override
    public boolean pushNotification(String nId, String uId, String message) {
        return false;
    }
}

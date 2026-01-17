package com.springcore.setterinjection;

public class EmailService implements MessegeService {
    @Override
    public void sendMessege(String str) {
        System.out.println("E-Mail Service : "+ str);
    }
}

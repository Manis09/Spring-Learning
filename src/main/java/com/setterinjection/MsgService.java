package com.setterinjection;

public class MsgService implements MessegeService{
    @Override
    public void sendMessege(String str) {
        System.out.println("SMS Service : "+ str);
    }
}

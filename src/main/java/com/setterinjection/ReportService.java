package com.setterinjection;

public class ReportService {
    private MessegeService messegeService;



    public void setMessegeService(MessegeService messegeService) {
        System.out.println("Setter called ->  Changing service");
        this.messegeService=messegeService;
    }

    public MessegeService getMessegeService() {
        return messegeService;
    }

    public void reportGenrator(){
        System.out.println("Report Generated");
        if(messegeService !=null){
            messegeService.sendMessege("Report is ready");
        }else{
            System.out.println("No message service is ");
        }
    }
}

package com.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("serviceconfig.xml");

        ReportService reportService = context.getBean("reportService", ReportService.class);
        reportService.reportGenrator();


        MessegeService smsService = context.getBean("smsService", MessegeService.class);
        reportService.setMessegeService(smsService);
        reportService.reportGenrator();


    }
}

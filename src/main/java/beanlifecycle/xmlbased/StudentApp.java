package beanlifecycle.xmlbased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("beanlccfg.xml");
        context.registerShutdownHook();
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
    }
}

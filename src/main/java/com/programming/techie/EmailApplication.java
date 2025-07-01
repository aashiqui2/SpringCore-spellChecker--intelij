package com.programming.techie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {

    public static void main(String[] args) {
        //EmailClient emailClient=new EmailClient(new AdvancedSpellChecker());
        //emailClient.sendEmail("Hey, "+" This is my first email message.");
        //emailClient.sendEmail("Hey, "+" This is my second email message.");

        //ApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
        //EmailClient emailClient=container.getBean(EmailClient.class);
        //emailClient.sendEmail("Hey, "+" This is my first email message.");
        //emailClient.sendEmail("Hey, "+" This is my second email message.");

        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient=container.getBean("emailClient",EmailClient.class);
        emailClient.sendEmail("Hey, "+" This is my first email message.");
        emailClient.sendEmail("Hey, "+" This is my second email message.");


        //Bean scope
        BasicSpellChecker basicSpellChecker= container.getBean("basicSpellChecker",BasicSpellChecker.class);
        System.out.println(basicSpellChecker);
        BasicSpellChecker basicSpellChecker1= container.getBean("basicSpellChecker",BasicSpellChecker.class);
        System.out.println(basicSpellChecker1);

        ( (AnnotationConfigApplicationContext) container).registerShutdownHook();


    }
}
package com.programming.techie;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") //same instance is shared  across entire application(by default)
//@Scope("prototype") //A new instance of the bean is created every time.

@PropertySource(value = "classpath:/application.properties")
public class AdvancedSpellChecker implements  SpellChecker, InitializingBean, DisposableBean {
    @Value("${app.database.uri}")

    private String databaseUri;

    public void checkSpelling(String emailMessage)
    {
        if(emailMessage!=null)
        {
            // Determining  the language of the email Message
            // check grammatical errors in the email Message
            // check spellings in the email Message
            System.out.println("Checking Spelling using Advance Spell Checker...");
            System.out.println("Spell Checking Completed!!");

            System.out.println("DB URL: "+databaseUri);
        }else{
            throw new RuntimeException("An exception occured");
        }
    }
    public void destroy() throws Exception {
        System.out.println("Destroyed Properties");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting Properties after Beans is Initialized");
    }
}


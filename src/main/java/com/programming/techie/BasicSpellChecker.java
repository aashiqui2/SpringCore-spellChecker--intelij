package com.programming.techie;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

//@Component
//@Primary //@Qualifier will override @Primary in Spring.
//@Scope("singleton") //same instance is shared  across entire application(by default)
//@Scope("prototype") //A new instance of the bean is created every time.

public class BasicSpellChecker implements SpellChecker {
    public void init() {
        System.out.println("init inside Basic Spell Checker");
    }



    public void checkSpelling(String emailMessage)
    {
        if(emailMessage!=null)
        {
            System.out.println("Checking Spelling using Basic Spell Checker...");
            System.out.println("Spell Checking Completed!!");
        }else{
            throw new RuntimeException("An exception occured");
        }
    }

    public void destroy() {
        System.out.println("destroy inside Basic Spell Checker");
    }

}


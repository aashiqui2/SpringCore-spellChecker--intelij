package com.programming.techie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="com.programming.techie")
public class AppConfig {

    //for JSR-250 Annnotaion for lifeCycle
    @Bean(name="basicSpellChecker", initMethod ="init",destroyMethod = "destroy")
    public BasicSpellChecker createBasicSpellChecker(){
        return new BasicSpellChecker();
    }

    //@Bean(name="basicSpellChecker")
    //public BasicSpellChecker createBasicSpellChecker(){
    //    return new BasicSpellChecker();
    //}

    //@Bean(name="advanceSpellChecker")
    //public AdvancedSpellChecker createAdvanceSpellChecker(){
    //    return new AdvancedSpellChecker();
    //}

    //@Bean(name="emailClient")
    //public EmailClient EmailClient(){
    //    return new EmailClient(createAdvanceSpellChecker());
    //}

    //@Bean(name="emailClient")
    //public EmailClient EmailClient(){
    //    EmailClient client = new EmailClient();
    //    client.setSpellChecker(createAdvanceSpellChecker());
    //    return client;
    //}
}

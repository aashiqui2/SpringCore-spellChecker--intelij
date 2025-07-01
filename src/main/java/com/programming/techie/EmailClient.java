package com.programming.techie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailClient {
    //This is for field Injection not preferable harmfully
    @Autowired
    @Qualifier("advancedSpellChecker")
    private SpellChecker spellChecker;


    //private SpellChecker spellChecker;

    //public EmailClient()
    //{

    //}

    //public SpellChecker getSpellChecker()
    //{
    //    return spellChecker;
    //}

    //public EmailClient(SpellChecker spellChecker) {
    //    System.out.println("Object injected via Constructor");
    //    this.spellChecker = spellChecker;
    //}

    //@Autowired
    //public void setSpellChecker(SpellChecker spellChecker) {
    //    System.out.println("Object injected via setter");
    //    this.spellChecker = spellChecker;
    //}

    //@Autowired //by name
    //public void setSpellChecker(SpellChecker advancedSpellChecker) {
    //    System.out.println("Object injected via setter");
    //    this.spellChecker = advancedSpellChecker;
    //}

    //@Autowired //by type
    //public void setSpellChecker(BasicSpellChecker spellChecker) {
    //    System.out.println("Object injected via setter");
    //    this.spellChecker = spellChecker;
    //}

    //@Autowired //by Qualifier(It overrides the @primary annotation on advanceSpellChecker)
    //public void setSpellChecker(@Qualifier("advancedSpellChecker") SpellChecker spellChecker) {
    //    System.out.println("Object injected via setter");
    //    this.spellChecker = spellChecker;
    //}


    public void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
    }
}
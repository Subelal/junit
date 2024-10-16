package com.junit.bs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class JREAbnnotations {

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    public void helloPrintJre(){
        System.out.println("This is 19 jre");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_19)
    public void disableDelloPrintJre(){
        System.out.println("disabled This is 19 jre");
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_9,max = JRE.JAVA_19)
    public void printJava9to19(){
        System.out.println("Run java 9 to 19");
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_21)
    public void printJavaMin(){
        System.out.println("Run java 9 ");
    }

    @Test
    @EnabledForJreRange(max=JRE.JAVA_21)
    public void printJavaMax(){
        System.out.println("Run java 21 ");
    }

}

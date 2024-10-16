package com.junit.bs;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaOperationsTest {

    JavaOperations javaOperations;

    @BeforeEach
    public void init(){
        javaOperations = new JavaOperations();
        //initialization
        System.out.println("initialization is done");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("clean up done");
    }
    @Test
    public void addTest(){
        System.out.println("First Test....Using java operation class ");
    }

    @Test
    public void multiTest(){
        System.out.println("Second Test....Using java operation class");
    }

}
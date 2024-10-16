package com.junit.bs;


import org.junit.jupiter.api.*;

class BeforeAllAfterAll {

    JavaOperations javaOperations;
    @BeforeAll
    public static void openDatabase(){
        System.out.println("Open database connection ");
    }

    @AfterAll
    public static void closeDatabase(){
        System.out.println("Close database connection ");
    }
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
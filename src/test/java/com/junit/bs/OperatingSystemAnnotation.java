package com.junit.bs;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class OperatingSystemAnnotation {

    @Test
    @EnabledOnOs({OS.MAC,OS.WINDOWS})
    public void printHello(){
        System.out.println("Hello");
    }

    @Test
    @DisabledOnOs({OS.WINDOWS,OS.LINUX})
    public void printPython(){
        System.out.println("Hello Python");
    }

}
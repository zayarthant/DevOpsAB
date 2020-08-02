package com.mdls.calcu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalcu {

    static Calcu calcu;

    @BeforeAll
    static void init(){
        calcu = new Calcu();
    }

    @Test
    void testAdd(){
        assertEquals(calcu.add(2,2),4);
    }

    @Test
    void testSub(){
        assertEquals(calcu.sub(4,2),2);
    }

    @Test
    void testMul(){
        assertEquals(calcu.mul(4,2),8);
    }
}

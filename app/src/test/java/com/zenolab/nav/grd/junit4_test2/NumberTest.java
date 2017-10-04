package com.zenolab.nav.grd.junit4_test2;

import junit.framework.Assert;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Test;

// статический импорт позволяет имортировать методы без использования класса
import static org.junit.Assert.*;

/**
 * Created by grd on 8/22/17.
 */

//tearDown - cсрывать,cносить (здесь это указатель что делать после прохожднния тестов)
public class NumberTest {
    @After
    public void tearDown() throws Exception {

    }


    //@Test(expected = Exception.class) // будет ожидать Exception
    @Test
    public void sum() throws Exception {

        Number number = new Number();
        int actual = number.sum(5);
        int expected = 15;
        // Утверждать равным
        ///assertEquals(expected,actual);
        //or
        org.junit.Assert.assertEquals(expected,actual);

    }

}
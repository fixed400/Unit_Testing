package com.zenolab.nav.grd.junit4_test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by grd on 8/24/17.
 */
public class MessageUtilTest {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Before
    public void setUp() throws Exception {

        System.out.println("@Before method will execute before every JUnit4 test");



        // нету видимости почему-то
        String message = "Robert";
        MessageUtil messageUtil = new MessageUtil(message);

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After method will execute after every JUnit4 test");

    }
    //---------------- тестируемые методы--------------

    @Test(expected = ArithmeticException.class)
    public void printMessage() throws Exception {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
   // @Test(timeout = 500)
    public void salutationMessage() throws Exception {

        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());

    }

}
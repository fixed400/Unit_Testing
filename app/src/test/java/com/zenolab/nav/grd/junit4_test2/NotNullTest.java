package com.zenolab.nav.grd.junit4_test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by grd on 8/24/17.
 */
public class NotNullTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("@Before method will execute before every JUnit4 test");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void mySrt() throws Exception {

        //test data
        String str1 = new String ("abc");
        String str2 = new String ("str");
        //String str3 = new String (null);




        //Check that an object isn't null
        assertNotNull(str2);
        assertNull(str2);

    }

}
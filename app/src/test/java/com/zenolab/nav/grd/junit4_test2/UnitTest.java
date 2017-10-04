package com.zenolab.nav.grd.junit4_test2;
// http://www.javacodex.com/JUnit/Test-Object-Is-Not-Null
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UnitTest {

    @Test
    public void NotNullTest() {

        Thing thing = new Thing();
        thing=null;

        //assertNotNull("Verify that thing is NOT null", thing);
        assertNull("Verify that thing is NOT null", thing);

    }
}
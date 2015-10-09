package com.malsolo.mercurius.boot.configuration.jomo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.malsolo.mercurius.boot.configuration.MercuriusBootConfigurationApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MercuriusBootConfigurationApplication.class)
public class JomoServiceTest {

    @Autowired
    private JomoService service;

    @Test
    public void testMarkerMethod() {
    }

    @Test
    public void testDoStuff() {
        String expected = "JomoConfiguration(name=Joda, host=Time, port=11, master=false)";// "JomoConfiguration(name=José, host=localhost, port=666, master=true)";
        String result = this.service.doStuff();
        System.err.println(result);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertEquals(expected, result);
    }

}

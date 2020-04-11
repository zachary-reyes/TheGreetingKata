package GreetingKata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest {

    private Person p;
    String[] regName = {"Bob"};
    String[] noName = {};
    String[] shoutName = {"JERRY"};
    String[] twoNames = {"Jill", "Jane"};
    String[] arbNames = {"Amy", "Brian", "Charlotte"};
    String[] req6 = {"Amy", "BRIAN", "Charlotte"};
    String[] req7 = {"Bob", "Charlie, Dianne"};
    String[] req8 = {"Bob", "\"Charlie, Dianne\""};

    @Before
    public void setUp() throws Exception {
        p = new Person();
    }

    @Test
    public void canGreet() throws Exception {
        assertEquals("Hello, Bob.",p.greet(regName));
        assertEquals("Hello, my friend.", p.greet(noName));
        assertEquals("HELLO, JERRY!", p.greet(shoutName));
        assertEquals("Hello, Jill and Jane.", p.greet(twoNames));
        assertEquals("Hello, Amy, Brian, and Charlotte.", p.greet(arbNames));
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!", p.greet(req6));
        assertEquals("Hello, Bob, Charlie, and Dianne.", p.greet(req7));
        assertEquals("Hello, Bob and Charlie, Dianne.", p.greet(req8));

    }



}

package dk.cngroup.javacomp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {


    @Test
    public void shouldSayHello(){
        assertEquals("Hello anonymous!", new Greeter().sayHello());
    }

    @Test
    public void shouldGreetTom(){
        assertEquals("Hello Tom!", new Greeter().sayHelloTo("Tom"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException(){
        new Greeter().sayHelloTo("");
    }


}

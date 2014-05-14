import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testName() throws Exception {

        Hello hello = new Hello();
        assertEquals("Hello",hello.sayHello());

    }
}
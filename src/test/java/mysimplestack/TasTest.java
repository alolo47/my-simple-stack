package mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TasTest {

    public Tas test;

    @Before
    public void setUp() throws Exception {
        test =  new Tas();
    }

    @Test
    public void isEmpty() {
        assertEquals("Erreur isEmpty", true, test.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals("Erreur getSize", 0, test.getSize());
    }

    @Test
    public void push() {
        test.push(new Item(4));
        assertEquals("Erreur push", 1, test.getSize());
    }

    @Test
    public void peek() {
        test.push(new Item(4));
        assertEquals("Erreur peek", 4, test.peek().getValeur());
    }

    @Test
    public void pop() {
        test.push(new Item(2));
        assertEquals("Erreur peek", 2, test.pop().getValeur());
    }
}
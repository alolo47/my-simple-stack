package mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item test;

    @Before
    public void setUp() throws Exception {
        test = new Item(1);
    }

    @Test
    public void getValeur() {
        assertEquals("Erreur getValeur", 1, test.getValeur());
    }

    @Test
    public void setValeur() {
        test.setValeur(4);
        assertEquals("Erreur setValeur", 4, test.getValeur());
    }
}
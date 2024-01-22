package errekurtxibitatea;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ariketakTest implements ariketakTest {

    @Override
    @Test
    public void testAgertzenDaA() {
        assertTrue(ariketak.agertzenDaA("Aa"));
        assertTrue(ariketak.agertzenDaA("abracadabra"));
        assertFalse(ariketak.agertzenDaA("xyz"));
    }

    @Override
    @Test
    public void testAlderantziz() {
        assertEquals("tset", ariketak.alderantziz("test"));
        assertEquals("", ariketak.alderantziz(""));
    }

    @Override
    @Test
    public void testAgertzenDaAA() {
        assertFalse(ariketak.agertzenDaAA("aabb"));
        assertFalse(ariketak.agertzenDaAA("aacdefg"));
        assertFalse(ariketak.agertzenDaAA("xyz"));
    }

    @Override
    @Test
    public void testAgerpenKopuruaA() {
        assertEquals(5, ariketak.agerpenKopuruaA("abracadabra"));
        assertEquals(0, ariketak.agerpenKopuruaA("xyz"));
    }

    @Override
    @Test
    public void testBerredura() {
        assertEquals(1, ariketak.berredura(0));
        assertEquals(2, ariketak.berredura(1));
        assertEquals(4, ariketak.berredura(2));
    }
}

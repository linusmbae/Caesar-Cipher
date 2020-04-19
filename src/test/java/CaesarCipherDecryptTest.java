import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherDecryptTest {
    @Test
    public void decryptData_instantiatesCorrectly_true() throws Exception {
        decryptCaesarCipher testCaesarCipher = new decryptCaesarCipher("irgvctx",4);
        assertEquals(true, testCaesarCipher instanceof decryptCaesarCipher);
    }

    @Test
    public void decryptData_testMessage() throws Exception {
        decryptCaesarCipher testCaesarCipher = new decryptCaesarCipher("irgvctx", 4);
        assertEquals("encrypt",testCaesarCipher.decryptionIsEqual());
    }
}
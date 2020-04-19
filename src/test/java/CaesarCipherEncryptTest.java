import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherEncryptTest {
    @Test
    public void encryptData_instantiatesCorrectly_true() throws Exception{
        CaesarCipher testCaesarCipher=new CaesarCipher("encrypt", 4);
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void encryptData_testMessage() throws  Exception{
        CaesarCipher testCaesarCipher=new CaesarCipher("encrypt", 4);
        assertEquals("irgvctx", testCaesarCipher.encryptionIsEqual());
    }

}
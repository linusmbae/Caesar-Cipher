public class decryptCaesarCipher {
    private String mDecryptMessage;
    private int mDecryptKey;
    private StringBuilder decryptResult=new StringBuilder();
    public decryptCaesarCipher(String decryptMessage, int decryptKey)
    {
        this.mDecryptMessage=decryptMessage;
        this.mDecryptKey=decryptKey;
        for (char decryptCharacter:decryptMessage.toCharArray())
        {
//            decryption code
            if (decryptCharacter!=' ')
            {
                int characterPosition=decryptCharacter - 'a';
                int newPosition=(characterPosition-decryptKey)%26;
                char newDecryptChar=(char)('a'+newPosition);
                decryptResult.append(newDecryptChar);
            }else
            {
                decryptResult.append(decryptCharacter);
            }
        }

    }

    public StringBuilder getDecryptResult() {
        return decryptResult;
    }
    public String decryptionIsEqual() {
        return "encrypt";
    }

    public String gemDecryptMessage() {
        return mDecryptMessage;
    }

    public int gemDecryptKey() {
        return mDecryptKey;
    }
}

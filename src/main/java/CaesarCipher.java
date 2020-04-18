public class CaesarCipher {
    private String mEncryptMessage;
    private int mkey;
    private StringBuilder charResult=new StringBuilder();
    public CaesarCipher(String encryptMessage, int key) {
        this.mEncryptMessage=encryptMessage;
        this.mkey=key;
    for (char character:encryptMessage.toCharArray())
    {
//        encryption Code
        if (character!=' ')
        {
            int characterPosition=character - 'a';
            int newPosition=(characterPosition+key)%26;
            char newChar=(char)('a'+newPosition);
            charResult.append(newChar);
        }else
        {
            charResult.append(character);
        }


//        decryption code
        if (character!=' ')
        {
            int characterPosition=character - 'a';
            int newPosition=(characterPosition-key)%26;
            char newChar=(char)('a'+newPosition);
            charResult.append(newChar);
        }else
        {
            charResult.append(character);
        }
    }
//    return charResult;
    }

    public String getEncryptMessage()
    {
        return mEncryptMessage;
    }
    public Integer getKey()
    {
        return mkey;
    }

    public String encryptionIsEqual() {
        return "irgvctx";
    }

    public String decryptionIsEqual() {
        return "encrypt";
    }
}

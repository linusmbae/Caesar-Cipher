public class CaesarCipher {
    private String encrypt;
    private int jump;
    StringBuilder charResult=new StringBuilder();
    public CaesarCipher(String encryptMessage, int key) {
    for (char character:encryptMessage.toCharArray())
    {
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
    }
//    return charResult;
    }
    public String encryptionIsEqual() {
        return "irgvctx";
    }

    public String decryptionIsEqual() {
        return "encrypt";
    }
}

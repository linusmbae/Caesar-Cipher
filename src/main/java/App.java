import java.io.Console;
import java.io.IOException;

public class App {
    public static void main(String[] args)
    {
        boolean programRunning = true;

        String [] select={"Encrypt","Decrypt","Exit"};
        Console console= System.console();
        System.out.println("Welcome to CaesarCipher App");
        System.out.println("Actions");
        System.out.println("........................");
        for (String selected:select)
        {
            System.out.println(selected);
        }

        while (programRunning){
        try
        {
            String navigator=console.readLine();

            if (navigator.equals("Encrypt"))
            {
                System.out.println("........................");
                System.out.println("You Chose CaesarCipher Encryption");
                System.out.println("Enter Message to Encrypt");
                String message=console.readLine();
                System.out.println("Encryption key (0-25)");
                Integer key=Integer.parseInt(console.readLine()) ;

                if (key>=1&&key<=25)
                {
                    CaesarCipher caesar=new CaesarCipher(message,key);
                    System.out.println("..........................");
                    System.out.println("Message:" + caesar.getmEncryptMessage());
                    System.out.println("Key:" + caesar.getmKey());
                    System.out.println("Encrypted message:" +caesar.getCharResult());
                }

            }else if(navigator.equals("Decrypt"))
            {
                System.out.println("........................");
                System.out.println("You Chose CaesarCipher Decryption");
                System.out.println("Enter Message to Decrypt");
                String message=console.readLine();
                System.out.println("Decryption key (0-25)");
                Integer key=Integer.parseInt(console.readLine()) ;

                if (key>=1&&key<=25)
                {
                    decryptCaesarCipher decrypt =new decryptCaesarCipher(message,key);
                    System.out.println("..........................");
                    System.out.println("Message:" + decrypt.getmDecryptMessage());
                    System.out.println("Key:" + decrypt.getmDecryptKey());
                    System.out.println("Decrypted message:" + decrypt.getDecryptResult());
                }
            }else if (navigator.equals("Exit"))
            {
                programRunning = false;
            }
            else
            {
                System.out.println("invalid Input");
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        }
    }
}

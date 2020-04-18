import java.io.Console;
public class App {
    public static void main(String[] args)
    {
        String [] select={"Encrypt","Decrypt","Exit"};
        Console console= System.console();
        System.out.println("Welcome to CaesarCipher App");
        System.out.println("Actions");
        for (String selected:select)
        {
            System.out.println(selected);
        }
    }
}

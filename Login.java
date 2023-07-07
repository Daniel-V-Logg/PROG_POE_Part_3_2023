import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.ArrayList;

public class Login
{
    public static boolean checkUserName()
    {

        String username = JOptionPane.showInputDialog("Please enter your username:");

        if(username.length() <=5 && username.contains("_"))
        {
            System.out.println(true);
            return true;
        }
            else
        {
            System.out.println(false);
            return false;
        }
    }

    public static boolean checkPasswordComplexity()
    {
        String password = JOptionPane.showInputDialog("Please enter your password:");

        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()_/].*"))
        {
            System.out.println(true + " Password Successfully Captured");
            return true;
        }
        else
        {
            System.out.println(false + " Password is not correctly formatted, please \n" +
                    "ensure that the password contains at least 8 \n" +
                    "characters, a capital letter, a number and a \n" +
                    "special character");
            return false;
        }
    }

    public static void registerUser()
    {
        String str;
        if(checkPasswordComplexity()){
              str = "Password Successfully Captured";
        } else {
            str = "Password is not correctly formatted, please \n" +
                    "ensure that the password contains at least 8 \n" +
                    "characters, a capital letter, a number and a \n" +
                    "special character";
        }
        System.out.println(str);
    }

    public static boolean loginUser()
    {
        if(checkUserName() && checkPasswordComplexity()){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }

    public static void loginStatus()
    {
        String str;
        if(loginUser()){
            str = "Login Success";
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            Options options = new Options();
            String[] args = new String[0];
            Options.selectOption(args);
        } else {
            str = "Login False";
        }
        System.out.println(str);
            }

    public static void main(String[] args)
    {
        loginStatus();
    }


}



// End of Part 1




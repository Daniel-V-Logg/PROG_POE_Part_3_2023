import javax.swing.*;

public class CreateUser
{
    public static void main(String[] args)
    {
        int i = -1;
        while(i<0)
        {
            String firstName = JOptionPane.showInputDialog("Please enter your first name:");
            String lastName = JOptionPane.showInputDialog("Please enter your last name:");
            String username = JOptionPane.showInputDialog("Please enter your username:");
            String password = JOptionPane.showInputDialog("Please enter your password:");
            if(username.length() <= 5 && username.contains("_"))
            {
                i++;
                JOptionPane.showMessageDialog(null, "username successful");


                if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()_/].*"))
                {
                    i++;
                    JOptionPane.showMessageDialog(null, "Password successful");
                    JOptionPane.showMessageDialog(null, "Welcome" +" "+  firstName  +" " + lastName  +" " + "i t's great to see you");
                } else {
                    JOptionPane.showMessageDialog(null, "The password is invalid!");
                }
            }    else
            {
                JOptionPane.showMessageDialog(null, "The username is invalid");
            }

        }

    }
}
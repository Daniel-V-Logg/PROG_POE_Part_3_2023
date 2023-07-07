import javax.swing.*;
import javax.swing.JLabel;

public class Options {

        public static void selectOption(String[] args) {
                Object[] options = {"Create Tasks", "View Report", "Quit"};
                Object selectStatus = JOptionPane.showInputDialog(null, "Choose an Option", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                if(selectStatus == "View Report"){
                        Report report = new Report();
                        Report.errorMessage(args);
                } else if(selectStatus == "Create Tasks"){
                        Tasks tasks = new Tasks();
                        Tasks.createTask(args);
                }
        }
}
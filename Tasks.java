import javax.swing.*;

public class Tasks {
    public static void createTask( String[] args) {
        //request user to input amount of tasks
        String stringInput = JOptionPane.showInputDialog("Enter number of Tasks.");
        int num = Integer.parseInt(stringInput);

        //setting todo status3
        Object[] status = {"Todo", "Doing", "Done"};

        //array of textfieldsto input tasks using loop
        JTextField[] fields = new JTextField[num];
        for (int i = 0; i < num; i++) {
            Object selectStatus = JOptionPane.showInputDialog(null, "Choose a status of the task", "Menu", JOptionPane.PLAIN_MESSAGE, null, status, status[0]);

            //assign variables
            JTextField taskName = new JTextField();
            int taskNumber = i;
            JTextField taskDescription = new JTextField();
            JTextField developerDetails = new JTextField();

            //autogenerate ID
            String taskID = null;
            taskID = "test" + ":" + taskNumber + ":" + "test";

            //user can input tasks
            fields[i] = new JTextField("");
            //you can add any listener for JTextField here
            Object[] message = {
                    "Task Name:", taskName,
                    "Task Number:", taskNumber,
                    "Task Description:", taskDescription,
                    "Developer Details:", developerDetails,
                    "Task Status:", selectStatus,
                    "Task ID:", taskID
            };


            int option = JOptionPane.showConfirmDialog(null, message, "Enter all your Tasks below", JOptionPane.OK_CANCEL_OPTION);
            //confirm tasks and display them after
            if (option == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, message, "Tasks are:", 0);
            }
        }
    }
}

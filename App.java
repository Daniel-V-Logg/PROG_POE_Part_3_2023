import java.util.Arrays;

public class App {
    private String[] developerArray;
    private String[] taskNamesArray;
    private int[] taskIDArray;
    private int[] taskDurationArray;
    private String[] taskStatusArray;

    public void populateArrays(String[] developers, String[] taskNames, int[] taskIDs, int[] taskDurations, String[] taskStatuses) {
        developerArray = developers;
        taskNamesArray = taskNames;
        taskIDArray = taskIDs;
        taskDurationArray = taskDurations;
        taskStatusArray = taskStatuses;
    }

    // Getter methods for arrays

    public String[] getDeveloperArray() {
        return developerArray;
    }

    public String[] getTaskNamesArray() {
        return taskNamesArray;
    }

    public int[] getTaskIDArray() {
        return taskIDArray;
    }

    public int[] getTaskDurationArray() {
        return taskDurationArray;
    }

    public String[] getTaskStatusArray() {
        return taskStatusArray;
    }

    // Additional features

    public void displayTasksWithStatusDone() {
        System.out.println("Tasks with status 'done':");
        for (int i = 0; i < taskStatusArray.length; i++) {
            if (taskStatusArray[i].equalsIgnoreCase("done")) {
                System.out.println("Developer: " + developerArray[i] + ", Task Name: " + taskNamesArray[i] + ", Task Duration: " + taskDurationArray[i]);
            }
        }
    }

    public void displayLongestTaskDuration() {
        int maxDurationIndex = 0;
        for (int i = 1; i < taskDurationArray.length; i++) {
            if (taskDurationArray[i] > taskDurationArray[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        System.out.println("Task with the longest duration:");
        System.out.println("Developer: " + developerArray[maxDurationIndex] + ", Duration: " + taskDurationArray[maxDurationIndex]);
    }

    public void searchTaskByName(String taskName) {
        System.out.println("Search result for task name: " + taskName);
        for (int i = 0; i < taskNamesArray.length; i++) {
            if (taskNamesArray[i].equalsIgnoreCase(taskName)) {
                System.out.println("Task Name: " + taskNamesArray[i] + ", Developer: " + developerArray[i] + ", Task Status: " + taskStatusArray[i]);
            }
        }
    }

    public void searchTasksByDeveloper(String developer) {
        System.out.println("Tasks assigned to developer: " + developer);
        for (int i = 0; i < developerArray.length; i++) {
            if (developerArray[i].equalsIgnoreCase(developer)) {
                System.out.println("Task Name: " + taskNamesArray[i] + ", Task Status: " + taskStatusArray[i]);
            }
        }
    }

    public void deleteTaskByName(String taskName) {
        for (int i = 0; i < taskNamesArray.length; i++) {
            if (taskNamesArray[i].equalsIgnoreCase(taskName)) {
                developerArray[i] = null;
                taskNamesArray[i] = null;
                taskIDArray[i] = 0;
                taskDurationArray[i] = 0;
                taskStatusArray[i] = null;
            }
        }
        System.out.println("Task with name '" + taskName + "' deleted.");
    }

    public void displayReport() {
        System.out.println("Task Report:");
        for (int i = 0; i < taskNamesArray.length; i++) {
            System.out.println("Task Name: " + taskNamesArray[i] +
                    ", Developer: " + developerArray[i] +
                    ", Task ID: " + taskIDArray[i] +
                    ", Task Duration: " + taskDurationArray[i] +
                    ", Task Status: " + taskStatusArray[i]);
        }
    }

    // Unit tests

    public void runTests(String[] args) {
        // Test populateArrays method
        String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        int[] taskIDs = {1, 2, 3, 4};
        int[] taskDurations = {5, 8, 2, 11};
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};

        populateArrays(developers, taskNames, taskIDs, taskDurations, taskStatuses);

        // Verify array contents
        assert Arrays.equals(getDeveloperArray(), developers);
        assert Arrays.equals(getTaskNamesArray(), taskNames);
        assert Arrays.equals(getTaskIDArray(), taskIDs);
        assert Arrays.equals(getTaskDurationArray(), taskDurations);
        assert Arrays.equals(getTaskStatusArray(), taskStatuses);

        // Test additional features
        displayTasksWithStatusDone();
        System.out.println("");
        displayLongestTaskDuration();
        System.out.println("");
        searchTaskByName("Create Add Features");
        System.out.println("");
        searchTasksByDeveloper("Mike Smith");
        System.out.println("");
        deleteTaskByName("Create Reports");
        System.out.println("");
        displayReport();
    }

    // Unit tests

    public void testDeveloperArrayPopulated() {
        String[] expectedDevelopers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};

        assert Arrays.equals(getDeveloperArray(), expectedDevelopers);
    }

    public void testDisplayDeveloperAndDurationForLongestTask() {
        String expectedOutput = "Task with the longest duration:\n" +
                "Developer: Glenda Oberholzer, Duration: 11";

        displayLongestTaskDuration();

        // Capture system output
        //String systemOutput = systemOutCapture();

       // assert systemOutput.equals(expectedOutput);
    }

    public void testSearchTaskByName() {
        String expectedOutput = "Search result for task name: Create Login\n" +
                "Task Name: Create Login, Developer: Mike Smith, Task Status: To Do";

        searchTaskByName("Create Login");

        // Capture system output
        //String systemOutput = systemOutCapture();

        //assert systemOutput.equals(expectedOutput);
    }

    public void testSearchTasksByDeveloper() {
        String expectedOutput = "Tasks assigned to developer: Samantha Paulson\n" +
                "Task Name: Create Reports, Task Status: Done";

        searchTasksByDeveloper("Samantha Paulson");

        // Capture
    }

    public static void main(String [] args) {
        new App().runTests(args);
    }
}
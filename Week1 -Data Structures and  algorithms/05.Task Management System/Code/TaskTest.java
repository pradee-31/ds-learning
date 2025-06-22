public class TaskTest {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design Module", "Pending"));
        taskList.addTask(new Task(2, "Implement Feature", "In Progress"));
        taskList.addTask(new Task(3, "Test Application", "Pending"));

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("\nDeleting Task ID 2:");
        taskList.deleteTask(2);

        System.out.println("\nAll Tasks after deletion:");
        taskList.displayTasks();
    }
}

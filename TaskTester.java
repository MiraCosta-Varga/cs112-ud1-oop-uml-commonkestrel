import java.time.LocalDate;

public class TaskTester {
    public static void main(String[] args) {
        Task javaProject = new Task("Finish Java Project", "2024-10-20", Task.PriorityLevel.HIGH);
        Task groceries = new Task("Buy groceries", "2024-10-25", Task.PriorityLevel.MEDIUM);

        System.out.println("javaProject title: " + javaProject.getTitle());
        System.out.println("groceries title: " + groceries.getTitle());
        System.out.println();

        System.out.println("javaProject:");
        javaProject.display();
        System.out.println();

        System.out.println("groceries:");
        groceries.display();
    }
}


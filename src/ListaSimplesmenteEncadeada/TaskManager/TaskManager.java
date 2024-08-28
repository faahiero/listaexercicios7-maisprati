package ListaSimplesmenteEncadeada.TaskManager;

// Classe TaskManager
public class TaskManager {
    private Task head;

    public TaskManager() {
        this.head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
    }

    public void removeTask(String description) {
        if (head == null) return;

        if (head.getDescription().equals(description)) {
            head = head.getNext();
            return;
        }

        Task current = head;
        while (current.getNext() != null && !current.getNext().getDescription().equals(description)) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    public void markTaskAsCompleted(String description) {
        Task current = head;
        while (current != null) {
            if (current.getDescription().equals(description)) {
                current.setCompleted(true);
                return;
            }
            current = current.getNext();
        }
    }

    public void markTaskAsPending(String description) {
        Task current = head;
        while (current != null) {
            if (current.getDescription().equals(description)) {
                current.setCompleted(false);
                return;
            }
            current = current.getNext();
        }
    }

    public void printTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current.getDescription() + " - " + (current.isCompleted() ? "Concluída" : "Pendente"));
            current = current.getNext();
        }
    }
}
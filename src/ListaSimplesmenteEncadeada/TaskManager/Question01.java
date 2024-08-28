package ListaSimplesmenteEncadeada.TaskManager;

public class Question01 {
    public static void Execute() {
        System.out.println("Questão 1");

        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Estudar Estrutura de Dados");
        taskManager.addTask("Estudar Java");
        taskManager.addTask("Estudar Python");

        taskManager.printTasks();
        System.out.println("======================================");
        System.out.println("======================================");

        taskManager.markTaskAsCompleted("Estudar Java");
        taskManager.markTaskAsCompleted("Estudar Python");

        taskManager.printTasks();

        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("Removendo a tarefa 'Estudar Java'");
        taskManager.removeTask("Estudar Java");

        taskManager.printTasks();

        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("Marcando a tarefa 'Estudar Python' como pendente");

        taskManager.markTaskAsPending("Estudar Python");

        taskManager.printTasks();
        System.out.println();
        System.out.println();

    }
}

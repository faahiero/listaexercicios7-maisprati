package ListaDuplamenteEncadeada.ReversionControlSystem;

public class Question04 {
    public static void Execute() {
        System.out.println("Questão 4");

        UndoRedoManager manager = new UndoRedoManager();
        manager.addAction("Escreveu 'Olá Mundo'");
        manager.addAction("Apagou 'Mundo'");
        manager.addAction("Escreveu 'Java'");

        System.out.println("Ações realizadas:");
        manager.printActions();

        System.out.println("======================================");

        manager.undo();
        System.out.println("Ações após desfazer a última ação:");
        manager.printActions();

        System.out.println("======================================");

        manager.redo();
        System.out.println("Ações após refazer a última ação:");
        manager.printActions();
        System.out.println();
        System.out.println();
    }

}

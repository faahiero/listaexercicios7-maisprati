package ListaSimplesmenteEncadeada.ReversionControlSystem;

public class Question03 {
    public static void Execute(){
        System.out.println("Questão 3");

        UndoManager undoManager = new UndoManager();
        undoManager.addAction("Escreveu 'Olá Mundo'");
        undoManager.addAction("Apagou 'Mundo'");
        undoManager.addAction("Escreveu 'Java'");

        System.out.println("Ações realizadas:");
        undoManager.printActions();

        System.out.println("======================================");

        undoManager.undo();
        System.out.println("Ações após desfazer a última ação:");
        undoManager.printActions();
        System.out.println();
        System.out.println();
    }
}

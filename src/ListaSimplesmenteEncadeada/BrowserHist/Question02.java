package ListaSimplesmenteEncadeada.BrowserHist;

public class Question02 {
    public static void Execute() {
        System.out.println("Questão 2");

        BrowserHistory history = new BrowserHistory(3);
        history.addURL("https://example.com");
        history.addURL("https://example.org");
        history.addURL("https://example.net");
        history.printHistory();

        System.out.println("======================================");

        history.addURL("https://example.edu");
        history.printHistory();
        System.out.println();
        System.out.println();
    }
}

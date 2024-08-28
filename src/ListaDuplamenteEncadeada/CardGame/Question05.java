package ListaDuplamenteEncadeada.CardGame;

public class Question05 {
    public static void Execute() {
        System.out.println("Questão 5");

        Hand hand = new Hand();
        hand.addCard("Ás de Espadas");
        hand.addCard("Rei de Copas");
        hand.addCard("Dama de Ouros");
        hand.addCard("Valete de Paus");

        System.out.println("Mão inicial:");
        hand.printHand();

        System.out.println("======================================");

        hand.removeCard("Rei de Copas");
        System.out.println("Mão após remover 'Rei de Copas':");
        hand.printHand();

        System.out.println("======================================");

        hand.moveCard("Dama de Ouros", 1);
        System.out.println("Mão após mover 'Dama de Ouros' para a posição 1:");
        hand.printHand();
        System.out.println();
        System.out.println();
    }
}

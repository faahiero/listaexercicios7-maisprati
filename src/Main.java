import Filas.Bank.Question06;
import Filas.PrintManagementSystem.Question07;
import Filas.ReadyProcessQueue.Question08;
import ListaDuplamenteEncadeada.CardGame.Question05;
import ListaDuplamenteEncadeada.ReversionControlSystem.Question04;
import ListaSimplesmenteEncadeada.BrowserHist.Question02;
import ListaSimplesmenteEncadeada.ReversionControlSystem.Question03;
import ListaSimplesmenteEncadeada.TaskManager.Question01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.ShowMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Question01.Execute();
                    break;
                case 2:
                    Question02.Execute();
                    break;
                case 3:
                    Question03.Execute();
                    break;
                case 4:
                    Question04.Execute();
                    break;
                case 5:
                    Question05.Execute();
                    break;
                case 6:
                    Question06.Execute();
                    break;
                case 7:
                    Question07.Execute();
                    break;
                case 8:
                    Question08.Execute();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
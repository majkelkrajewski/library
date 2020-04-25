import java.util.Scanner;

public class Main {
    private static Scanner SCANNER;
    public static void main(String[] args) {
        SCANNER = new Scanner(System.in);
        System.out.println("Robimy biblioteke");

        System.out.println("Witaj w bibliotece! Co mogę dla Ciebie zrobić??");

        while(true) {
            menu();
            int choose = SCANNER.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Not implemented yet");
                    break;
                case 2:
                    System.out.println("Not implemented yet");
                    break;
                case 3:
                    System.out.println("Not implemented yet");
                    break;
                default:
                    System.out.println("Zła komenda, podaj liczbę jeszcze raz");
            }
        }
    }

    private static void menu() {
        System.out.println("1) Wyświetl wszystkie książki");
        System.out.println("2) Dodaj książkę");
        System.out.println("3) Usuń książkę");
        System.out.println("Wybieram: ");
    }
}

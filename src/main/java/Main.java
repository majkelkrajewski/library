import model.Book;
import model.Library;

import java.util.Scanner;

public class Main {
    private static Scanner SCANNER;
    public static void main(String[] args) {
        SCANNER = new Scanner(System.in);
        System.out.println("Robimy biblioteke");
        Library library = createLibraryWithBooks();

        System.out.println("Witaj w bibliotece! Co mogę dla Ciebie zrobić??");

        while(true) {
            menu();
            int choose = SCANNER.nextInt();
            switch (choose) {
                case 1:
                    library.printAllBooks();
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

    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }
}

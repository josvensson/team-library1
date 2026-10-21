import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;
    String choice;


    public void startMenu(){
        //LibraryService.addBooks();

        {
        while (isRunning){
            System.out.println("=== Team Library ===");
            System.out.println("1. Add book");
            System.out.println("2. List book");
            System.out.println("3. Search book");
            System.out.println("4. Borrow book");
            System.out.println("5. Return book");
            System.out.println("0. Exit");
            choice = scanner.nextLine();
            switch (choice){
                case "1" -> "Addbook"
                case "2" -> "List book"
                case "3" -> "Search book"
                case "4" -> "borrow book"
                case "5" -> "Return book"
                case "6" -> {
                    isRunning = false;
                System.out.println("Programmet avslutas");
                }
                default -> System.out.println("Ogiltigt val");

            }

        }
    }
    }



}

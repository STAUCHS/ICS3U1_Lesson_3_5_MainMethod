import java.util.Scanner;

public class UserInputDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String book1, book2, book3;

    System.out.println("Name your favourite book: ");
    book1 = scan.nextLine();

    System.out.println("Name your 2nd favourite book: ");
    book2 = scan.nextLine();

    System.out.println("Name your 3rd favourite book: ");
    book3 = scan.nextLine();

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
  }
}
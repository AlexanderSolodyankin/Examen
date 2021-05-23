package TaskC;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random ran = new Random();
        Books[] books = new Books[ran.nextInt(50 - 5 + 1) + 5]; // создаем случайное количесьво книг
        for(int i = 0; i < books.length;i++){ // задаем значение каждой книге
            books[i] = new Books();
        }
        Library library = new Library(books);
        System.out.println(library);
        System.out.println("___------------------------------------------------------------------------------------------------");
        System.out.println(library.getFiction().outAllInformationsTheDeportament());
        System.out.println("___------------------------------------------------------------------------------------------------");
        System.out.println((library.getLegalDepartamentl().outAllInformationsTheDeportament()));
        System.out.println("___------------------------------------------------------------------------------------------------");
        System.out.println(library.getTexhnicDepartament().outAllInformationsTheDeportament());
        System.out.println();
        System.out.println("Введите автора книги для поиска: ");
        library.getTexhnicDepartament().searchBookByAutor(sc.nextLine());

    }


}

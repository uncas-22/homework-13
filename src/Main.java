import hw_13_1.Author;
import hw_13_1.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 13 Объекты и классы");
        Author firstAuthor = new Author("Виктор", " Пелевин");
        Book firstBook = new Book(1998, "Конструктор", firstAuthor);
        Author secondAuthor = new Author("Чан Мин", " До");
        Book secondBook = new Book(1990, "Цветы сливы в золотой вазе", secondAuthor);

        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        firstBook.setYear(1998);
        System.out.println("firstBook.getYear() = " + firstBook.getYear());

        System.out.println("secondBook = " + secondBook);
        System.out.println("secondAuthor = " + secondAuthor);
        System.out.println("secondBook.equals(firstBook) = " + secondBook.equals(firstBook));
        System.out.println("secondBook.equals(secondBook) = " + secondBook.equals(secondBook));
        System.out.println("secondBook.getTitle().equals(firstBook.getTitle()) = " + secondBook.getTitle().equals(firstBook.getTitle()));
        System.out.println("secondBook.getAuthor().equals(secondBook.getAuthor()) = " + secondBook.getAuthor().equals(secondBook.getAuthor()));
        System.out.println("secondBook.getAuthor().equals(firstBook.getAuthor()) = " + secondBook.getAuthor().equals(firstBook.getAuthor()));


        Book[] arrayBook = new Book[7];
        arrayBook[0] = firstBook;
        arrayBook[1] = secondBook;

        Author thirdAuthor = new Author("Гарри", " Гаррисон");
        Book thirdBook = new Book(1995, "Неукротимая планета", thirdAuthor);

        int freeIndex = checkingFreeIndex(arrayBook);
        if (freeIndex == 999) {
            System.out.println("В массиве нет места для новых книг");
        } else {
            arrayBook[freeIndex] = thirdBook;
        }

        for (int i = 0; i <= freeIndex; i++) {
            System.out.println(arrayBook[i].getAuthor().getFirstName() +
                    arrayBook[i].getAuthor().getLastName() + ": " +
                    arrayBook[i].getTitle() + ": " + arrayBook[i].getYear());
        }
    }

    public static int checkingFreeIndex(Book[] ar) {
        int i = 0;
        while (i < ar.length) {
            if (ar[i] == null) {
                return i;
            } else {
                i++;
                continue;
            }}
        return 999;
    }
}

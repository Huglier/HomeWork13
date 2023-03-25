public class Main {
    public static void main(String[] args) {
        Book book = new Book("Headless horseman", 1865);
        System.out.println("book.name = " + book.getName());
        Author man = new Author("Thomas", "Mayne");
        System.out.println("man.name = " + man.getName());
        System.out.println("man.lastName = " + man.getLastName());
        System.out.println("book.year = " + book.getYear());

        Book book1 = new Book("Brave New World", 1932);
        System.out.println("book1.name = " + book1.getName());
        Author man1 = new Author("Aldous", "Huxley");
        System.out.println("man1.name = " + man1.getName());
        System.out.println("man1.lastName = " + man1.getLastName());
        System.out.println("book1.year = " + book1.getYear());
        book1.setYear(1931);
        System.out.println("book1.getYear() = " + book1.getYear());

        Book book2 = new Book("Twenty Thousand Leagues Under the Sea", 1870);
        System.out.println("book2.name = " + book2.getName());
        Author man2 = new Author("Jules", "Verne");
        System.out.println("man2.name = " + man2.getName());
        System.out.println("man2.lastName = " + man2.getLastName());
        System.out.println("book2.year = " + book2.getYear());
    }
}
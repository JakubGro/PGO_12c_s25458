package CW2.ZAD5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book {
    private static long ID_COUNTER = 0;

    private long id = ID_COUNTER++;
    private int borrowCount = 0;

    private String name;
    private Genre genre;
    private Language lang;
    private LocalDate publishDate;
    private Person borrowedBy;
    private ArrayList<Person> authors;

    public Book(String name, Genre genre, Language lang, LocalDate publishDate, ArrayList<Person> authors) throws Exception {
        this.validateAuthors(authors);

        this.name = name;
        this.genre = genre;
        this.lang = lang;
        this.authors = authors;
        this.publishDate = publishDate;
    }

    public Book(String name, Genre genre, Language lang, ArrayList<Person> authors) throws Exception {
        this.validateAuthors(authors);

        this.name = name;
        this.genre = genre;
        this.lang = lang;
        this.authors = authors;
    }

    private void validateAuthors(ArrayList<Person> authors) throws Exception {
        if(authors == null || authors.size() == 0){
            throw new Exception("Autor nie został podany");
        }
    }

    public void borrowBook(Person person){
        if(!this.isAvailable()){
            System.out.println("Ksiazka "+this.name+" jest już wypozyczona.");
            return;
        }

        if(person.getBorrowedBook() != null){
            System.out.println(person.getName() + " posiada już wypozyczona ksiazke.");
            return;
        }

        person.setBorrowedBook(this);
        this.borrowedBy = person;
        this.borrowCount++;
    }

    public void placeBack(){
        if(this.isAvailable()){
            System.out.println("Ksiazka nie była wypozyczona.");
            return;
        }

        this.borrowedBy.setBorrowedBook(null);
        this.borrowedBy = null;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return LocalDate.now().getYear() - this.publishDate.getYear();
    }

    public boolean isAvailable(){
        return this.borrowedBy == null;
    }

    public void printBookInfo(){
        System.out.println("Info: name=" + this.name + ", genre=" + this.genre + ", lang=" + this.lang + ", publish date=" + this.publishDate + ", borrow count=" + this.borrowCount);
        System.out.print("Autorzy: ");
        for (Person author : this.authors) {
            System.out.print(author.getName() + " " + author.getSurnameName());
        }

        System.out.println("\nWypozyczona przez: " + (this.borrowedBy==null ? "" : this.borrowedBy.getName() + " " + this.borrowedBy.getSurnameName()));
    }

}

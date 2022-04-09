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

    public Book(String name, Genre genre, Language lang, LocalDate publishDate, ArrayList<Person> authors){
        this.setName(name);
        this.setGenre(genre);
        this.setLang(lang);
        this.setAuthors(authors);
        this.setPublishDate(publishDate);
    }

    public Book(String name, Genre genre, Language lang, ArrayList<Person> authors) {
        this.setName(name);
        this.setGenre(genre);
        this.setLang(lang);
        this.setAuthors(authors);
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


    public int getAge(){
        return LocalDate.now().getYear() - this.publishDate.getYear();
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        if(name.isBlank()){ throw new RuntimeException("Imię jest wymagane"); }
        this.name = name;
    }

    public void setGenre(Genre genre) {
        if(genre == null){ throw new RuntimeException("Gatunek jest wymagany"); }
        this.genre = genre;
    }

    public void setLang(Language lang) {
        if(lang == null){ throw new RuntimeException("Język jest wymagany"); }
        this.lang = lang;
    }

    public void setAuthors(ArrayList<Person> authors) {
        if(authors == null || authors.isEmpty()){throw new RuntimeException("Autor jest wymagany");}
        this.authors = authors;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

}

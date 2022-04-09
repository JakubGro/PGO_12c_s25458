package CW2.ZAD5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surnameName;
    private LocalDate dateOfBirth;
    private Address address;
    private Book borrowedBook;
    private ArrayList<Book> wroteBooks = new ArrayList<>();

    public Person(String name, String surnameName, LocalDate dateOfBirth, Address address) {
        this.setName(name);
        this.setSurnameName(surnameName);
        this.setAddress(address);
        this.setDateOfBirth(dateOfBirth);
    }

    public Book publishBook(String title, Genre genre, Language lang, LocalDate publishDate) {
        try{
            Book publishedBook = new Book(title, genre, lang, publishDate, new ArrayList<>(List.of(this)));
            this.wroteBooks.add(publishedBook);
            return publishedBook;
        } catch (Exception exception){
            return null;
        }
    }

    public Book publishBook(String title, Genre genre, Language lang) {
        return publishBook(title, genre, lang, null);
    }

    public int getAge(){
        return LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }

    public String getSurnameName() {
        return surnameName;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book book){
        this.borrowedBook = book;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){ throw new RuntimeException("Imię jest wymagane"); }
        this.name = name;
    }

    public void setSurnameName(String surnameName) {
        if(surnameName == null || surnameName.isBlank()){ throw new RuntimeException("Nazwisko jest wymagane"); }
        this.surnameName = surnameName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth == null){ throw new RuntimeException("Data urodzenia jest wymagane"); }
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        if(address == null){ throw new RuntimeException("Adres jest wymagane"); }
        this.address = address;
    }

    public void introduceYourself(){
        System.out.println("Info: " +this.name + " " + this.surnameName + " " + this.dateOfBirth);
        System.out.print("Napisane ksiazki: ");
        for (Book wroteBook : wroteBooks) {
            System.out.print(wroteBook.getName());
        }

        System.out.println("\nWypozyczona ksiazka: " + (this.borrowedBook == null ? "" : this.borrowedBook.getName()));
    }

}


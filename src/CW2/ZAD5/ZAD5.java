package CW2.ZAD5;

import java.time.LocalDate;

public class ZAD5 {

    public static void start(){
        Address address = new Address("Polska", "Warszawa", "Diamentowa",6 , 10);
        System.out.println("=========Addres==========");
        address.printFullAddress();
        System.out.println("=========Addres==========\n");

        System.out.println("=========MICKIEWICZ==========");
        Person adamMickiewicz = new Person("Adam", "Mickiewicz", LocalDate.of(1798,12,24), address);
        adamMickiewicz.introduceYourself();
        System.out.println("=========MICKIEWICZ==========\n");

        System.out.println("=========JAKUB==========");
        Person kuba = new Person("Jakub", "Gronostajski",  LocalDate.of(2002,4,8), address);
        kuba.introduceYourself();
        System.out.println("=========JAKUB==========\n");

        System.out.println("=========NEW BOOK==========");
        Book panTadeusz = adamMickiewicz.publishBook("Pan Tadeusz", Genre.Adventure, Language.Polish, LocalDate.of(1834,6, 28));
        panTadeusz.printBookInfo();
        System.out.println("=========NEW BOOK==========\n");

        System.out.println("=========BOORROWED BOOK==========");
        panTadeusz.borrowBook(kuba);
        panTadeusz.printBookInfo();
        System.out.println("=========BOORROWED BOOK==========\n");

        System.out.println("=========PALCED BACK BOOK==========");
        panTadeusz.placeBack();
        panTadeusz.printBookInfo();
        System.out.println("=========PALCED BACK BOOK==========");
    }

}

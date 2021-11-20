package hu.progmatic;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*Film filmek = new Film("S123", "Elfújta a szél", "1992.12.02.", null, 7200, 100_000_000);
    HorrorFilm filmek2 = new HorrorFilm("S123", "Elfújta a szél", 1992, "", 7200, 100_000_000);
    filmek2.setVoltBenneSzellem(true);
    System.out.println(filmek2.toString());

    Film film1 = new RomantikusFilm("S123", "Elfújta a szél", 1992, null, 7200, 100_000_000);
    Film film2 = new WesternFilm("S124", "Egy marék dollárért", 1985, "Western", 7300, 20_000_000);
    Film[] filmek = new Film[]{film1, film2}; */

    Videoteka videoteka = new Videoteka(10);
    fillWithDatas(videoteka);
    Menu(videoteka);
  }

  public static void fillWithDatas(Videoteka videoteka){
    Film film2 = new RomantikusFilm("S125R", "Elfújta a szél", 1939, "Romantikus", 7200, 100_000_000);
    ((RomantikusFilm) film2).setNumberOfMarriages(2);
    Film film6 = new HorrorFilm("S129H","Az",2017,"Horror",8200,35_000_000);
    ((HorrorFilm) film6).setItHadAGhost(true);

    videoteka.addFilm(new Film("S123","Bosszuállók",2012,"Akció",7300,148_000_000));
    videoteka.addFilm(film2);
    videoteka.addFilm(new Film("S124","Pokember",2003,"Akció",9000,250_000));
    videoteka.addFilm(new WesternFilm("S127W","Egy marék dollárért",1970,"Western",7300,2_000_000));
    videoteka.addFilm(new Film("S126","Harry Potter 2",2002,"Kaland",9600,100_000_000));
    videoteka.addFilm(film6);
    videoteka.addFilm(new RomantikusFilm("S128R","Titanic",1997,"Romantikus",11_800,200_000_000));
    videoteka.addFilm(new Film("S130","Avatar",2009,"Sci-fi",11_900,237_000_000));
    videoteka.addFilm(new Film("S131","300",2006,"Akció",8900,100_000));
    videoteka.addFilm(new WesternFilm("S132W","Nevem Senki",1973,"Western",7900,300_000));
  }

  public static void Menu(Videoteka videoteka) {
    Scanner scanner = new Scanner(System.in);
    int command;
    do {
      System.out.println("****************Mit szeretne tenni?*****************");
      System.out.println("0. Kilépés");
      System.out.println("1. Az összes film listázása");
      System.out.println("2. Filmek listázása műfaj szerint");
      System.out.println("3. Filmek listázása megjelenési év szerint");
      System.out.println("4. Filmek listázása értékelés szerint");
      System.out.println("5. Filmek listázása, amelyekben vannak szellemek");
      System.out.println("6. Összesen ennyi házasságot kötöttek a filmjeidben:");
      System.out.println("****************************************************");
      command = scanner.nextInt();
      switch (command){
        case 1:
          System.out.println();
          videoteka.listaz();
          break;
        case 2:
          System.out.println();
          System.out.println("Kérem a keresett műfajt: (pl. Akció, Western)");
          videoteka.lekerdezFilmekMufajSzerint(scanner.next());
          System.out.println("***********************END**************************\n");
          break;
        case 3:
          System.out.println();
          System.out.println("Kérem a keresett évet: (pl. 1995)");
          videoteka.lekerdezFilmekEvszamSzerint(scanner.nextInt());
          System.out.println("***********************END**************************\n");
          break;
        case 4:
          System.out.println();
          System.out.println("Kérem a minimum értékelést:");
          videoteka.lekerdezFilmekErtekelesSzerint(scanner.nextInt());
          System.out.println("***********************END**************************\n");
          break;
        case 5:
          System.out.println();
          videoteka.lekerdezSzellemesFilmek();
          break;
        case 6:
          System.out.println();
          videoteka.lekerdezHazassagokSzam();
          break;
        case 0:
          break;
      }
    } while(command != 0);
  }

}

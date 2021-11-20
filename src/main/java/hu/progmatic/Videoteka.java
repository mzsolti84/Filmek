package hu.progmatic;

public class Videoteka {
  private Film[] filmek;
  //private final int size;

  public Videoteka(int size) {
    filmek = new Film[size];
    //this.size = size;
  }

  public void addFilm(Film film) {
    Integer index = null;
    for (int i = 0; i < filmek.length; i++) {
      if (filmek[i] == null) {
        if (index == null) { index = i; /* első szabad helyet keressük */ }
      }
    }

    if (index != null) { filmek[index] = film;
    } else { throw new RuntimeException("Nincs üres hely"); }

  }

  public void listaz () {
    for (Film film : filmek) {
      if (film != null) System.out.println(film.toString());
    }
  }
  public void lekerdezFilmekMufajSzerint(String genre) {
    for (Film film : filmek) {
      if (film != null && genre.equals(film.getGenre())) System.out.println(film.toString());
    }
  }
  public void lekerdezFilmekEvszamSzerint(int date) {
    for (Film film : filmek) {
      if (film != null && date == film.getDate()) System.out.println(film.toString());
    }
  }
  public void lekerdezFilmekErtekelesSzerint(int minRating) {
    for (Film film : filmek) {
      if (film != null && minRating <= film.getErtekeles()) System.out.println(film.toString());
    }
  }

  public void lekerdezSzellemesFilmek() {
    for (Film film : filmek) {
      if (film != null) {
        if ((film instanceof HorrorFilm) && ((HorrorFilm) film).isItHadAGhost()) { System.out.println(film.toString()); }
      }
    }
  }

  public void lekerdezHazassagokSzam() {
    int numberOfMarriages = 0;
    for (Film film : filmek) {
      if (film != null) {
        if ((film instanceof RomantikusFilm)) { numberOfMarriages += ((RomantikusFilm) film).getNumberOfMarriages(); }
      }
    }
    System.out.println("Házasságok száma a filmekben összesen: " + numberOfMarriages);
  }

  public String[] Serialize() {
    String[] s = new String[filmek.length];
    for (int i = 0; i < filmek.length; i++) {
      s[i] = filmek[i].getFILM_ID() + "," + filmek[i].getTitle() + "," + filmek[i].getDate() + ","
          + filmek[i].getGenre() + "," + filmek[i].getRunTime() + "," + filmek[i].getBudget();
    }
    return s;
  }

  public void DeSerialize(String[] adat) {
    //String[] reszek = new String[filmek.length];
    for (int i = 0; i < filmek.length; i++) {
      String[] reszek  = adat[i].split(",");
      filmek[i].setFILM_ID(reszek[0]);
      filmek[i].setTitle(reszek[1]);
    }
  }
}

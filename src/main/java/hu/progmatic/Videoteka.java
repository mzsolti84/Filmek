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
  public void lekerdezFilmekErtekelesSzerint(int minErtekeles) {
    for (Film film : filmek) {
      if (film != null && minErtekeles <= film.getErtekeles()) System.out.println(film.toString());
    }
  }

  public void lekerdezSzellemesFilmek() {
    for (Film film : filmek) {
      if (film != null) {
        if ((film instanceof HorrorFilm) && ((HorrorFilm) film).isVoltBenneSzellem()) {
          System.out.println(film.toString());
        }
      }
    }
  }
  public void lekerdezHazassagokSzam() {
    int hazassagokSzama = 0;
    for (Film film : filmek) {
      if (film != null) {
        if ((film instanceof RomantikusFilm)) {
          hazassagokSzama += ((RomantikusFilm) film).getHazassagokSzama();
        }
      }
    }
    System.out.println("Házasságok száma a filmekben összesen: " + hazassagokSzama);
  }
}

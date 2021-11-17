package hu.progmatic;

public final class RomantikusFilm extends Film{
  private int hazassagokSzama;

  public RomantikusFilm(String FILM_ID, String title, String date, String genre, int runTime, int budget) {
    super(FILM_ID, title, date, genre, runTime, budget);
  }

  public RomantikusFilm(String FILM_ID, String title, String date, int runTime, int budget) {
    super(FILM_ID, title, date, runTime, budget);
  }

  public int getHazassagokSzama() {
    return hazassagokSzama;
  }

  public void setHazassagokSzama(int hazassagokSzama) {
    if (hazassagokSzama >= 0) this.hazassagokSzama = hazassagokSzama;
    else this.hazassagokSzama = 0;
  }

  @Override
  public int getMufajErtekeles() {
    if (this.hazassagokSzama <= 5) return this.hazassagokSzama;
    else return 5;
  }

  @Override
  public String toString () {
    return super.toString() + "Házasságok száma: "
        + this.hazassagokSzama
        + "\n";
  }
}

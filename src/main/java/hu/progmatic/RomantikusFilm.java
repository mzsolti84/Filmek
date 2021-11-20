package hu.progmatic;

public final class RomantikusFilm extends Film{
  private int numberOfMarriages;

  public RomantikusFilm(String FILM_ID, String title, int date, String genre, int runTime, int budget) {
    super(FILM_ID, title, date, genre, runTime, budget);
  }

  public RomantikusFilm(String FILM_ID, String title, int date, int runTime, int budget) {
    super(FILM_ID, title, date, runTime, budget);
  }

  public int getNumberOfMarriages() {
    return numberOfMarriages;
  }

  public void setNumberOfMarriages(int numberOfMarriages) {
    if (numberOfMarriages >= 0) this.numberOfMarriages = numberOfMarriages;
    else this.numberOfMarriages = 0;
  }

  @Override
  public int getMufajErtekeles() {
    if (this.numberOfMarriages <= 5) return this.numberOfMarriages;
    else return 5;
  }

  @Override
  public String toString () {
    return super.toString() + "Házasságok száma: "
        + this.numberOfMarriages
        + "\n";
  }
}

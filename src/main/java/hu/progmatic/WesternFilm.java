package hu.progmatic;

public final class WesternFilm extends Film{
  private boolean ItHadIndiansInIt;

  public WesternFilm(String FILM_ID, String title, int date, String genre, int runTime, int budget) {
    super(FILM_ID, title, date, genre, runTime, budget);
  }

  public WesternFilm(String FILM_ID, String title, int date, int runTime, int budget) {
    super(FILM_ID, title, date, runTime, budget);
  }

  public boolean isItHadIndiansInIt() {
    return ItHadIndiansInIt;
  }

  public void setItHadIndiansInIt(boolean itHadIndiansInIt) {
    this.ItHadIndiansInIt = itHadIndiansInIt;
  }

  @Override
  public int getMufajErtekeles() {
    if (ItHadIndiansInIt) return 5;
    else return 0;
  }

  @Override
  public String toString () {
    String message = super.toString();
    if (ItHadIndiansInIt) {
      message += "+ Szerepeltek benne indiánok\n";
    }
    return message;
  }
}

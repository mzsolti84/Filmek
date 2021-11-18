package hu.progmatic;

public final class WesternFilm extends Film{
  private boolean voltakBenneIndianak;

  public WesternFilm(String FILM_ID, String title, int date, String genre, int runTime, int budget) {
    super(FILM_ID, title, date, genre, runTime, budget);
  }

  public WesternFilm(String FILM_ID, String title, int date, int runTime, int budget) {
    super(FILM_ID, title, date, runTime, budget);
  }

  public boolean isVoltakBenneIndianak() {
    return voltakBenneIndianak;
  }

  public void setVoltakBenneIndianak(boolean voltakBenneIndianak) {
    this.voltakBenneIndianak = voltakBenneIndianak;
  }

  @Override
  public int getMufajErtekeles() {
    if (voltakBenneIndianak) return 5;
    else return 0;
  }

  @Override
  public String toString () {
    String uzenet = super.toString();
    if (voltakBenneIndianak) {
      uzenet += "+ Szerepeltek benne indiánok\n";
    }
    return uzenet;
  }
}

package hu.progmatic;

public final class HorrorFilm extends Film {
  private boolean itHadAGhost;
  private boolean itHadAMonster;

  public HorrorFilm(String FILM_ID, String title, int date, String genre, int runTime, int budget) {
    super(FILM_ID, title, date, genre, runTime, budget);
  }

  public HorrorFilm(String FILM_ID, String title, int date, int runTime, int budget) {
    super(FILM_ID, title, date, runTime, budget);
  }

  public boolean isItHadAGhost() {
    return itHadAGhost;
  }

  public void setItHadAGhost(boolean itHadAGhost) {
    this.itHadAGhost = itHadAGhost;
  }

  public boolean isItHadAMonster() {
    return itHadAMonster;
  }

  public void setItHadAMonster(boolean itHadAMonster) {
    this.itHadAMonster = itHadAMonster;
  }

  @Override
  public int getMufajErtekeles() {
    int osszesen = 0;
    if (itHadAGhost) osszesen += 2;
    if (itHadAMonster) osszesen += 3;
    return osszesen;
  }

  @Override
  public String toString () {
    String message = super.toString();
    if (itHadAGhost) {
      message += "+ Volt benne szellem\n";
    }
    if (itHadAMonster) {
      message += "+ Volt benne szörnyeteg\n";
    }
    return message;
  }
}

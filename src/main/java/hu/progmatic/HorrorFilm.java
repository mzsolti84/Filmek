package hu.progmatic;

public final class HorrorFilm extends Film {
  private boolean voltBenneSzellem;
  private boolean voltBenneSzornyeteg;

  public HorrorFilm(String FILM_ID, String title, String date, String genre, int runTime, int budget) {
    super(FILM_ID, title, date, genre, runTime, budget);
  }

  public HorrorFilm(String FILM_ID, String title, String date, int runTime, int budget) {
    super(FILM_ID, title, date, runTime, budget);
  }

  public boolean isVoltBenneSzellem() {
    return voltBenneSzellem;
  }

  public void setVoltBenneSzellem(boolean voltBenneSzellem) {
    this.voltBenneSzellem = voltBenneSzellem;
  }

  public boolean isVoltBenneSzornyeteg() {
    return voltBenneSzornyeteg;
  }

  public void setVoltBenneSzornyeteg(boolean voltBenneSzornyeteg) {
    this.voltBenneSzornyeteg = voltBenneSzornyeteg;
  }

  @Override
  public int getMufajErtekeles() {
    int osszesen = 0;
    if (voltBenneSzellem) osszesen += 2;
    if (voltBenneSzornyeteg) osszesen += 3;
    return osszesen;
  }

  @Override
  public String toString () {
    String uzenet = super.toString();
    if (voltBenneSzellem) {
      uzenet += "+ Volt benne szellem\n";
    }
    if (voltBenneSzornyeteg) {
      uzenet += "+ Volt benne szörnyeteg\n";
    }
    return uzenet;
  }
}

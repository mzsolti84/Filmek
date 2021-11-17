package hu.progmatic;

public class Film {
  final private String[] GENRE_DB = {"Horror", "Romantikus", "Western", "Idk."};
  final private String FILM_ID;
  private String title; //magyarul
  private String date;
  private String genre;
  private int runTime; //mp
  private int budget; //egész dollár

  /**Lehetséges műfajok (genre):
   * 0 = Horror;
   * 1 = Romantikus;
   * 2 = Western;
   * 3 = Idk.
   */
  public Film(String FILM_ID, String title, String date, String genre, int runTime, int budget) {
    this.FILM_ID = FILM_ID;
    this.title = title;
    this.date = date;
    this.runTime = runTime;
    this.budget = budget;
    if (genre == null || genre.equals("")) {
      this.genre = "Idk.";
    } else {
      this.genre = genre;
    }
  }

  public Film(String FILM_ID, String title, String date, int runTime, int budget) {
    this.FILM_ID = FILM_ID;
    this.title = title;
    this.date = date;
    this.genre = "Idk.";
    this.runTime = runTime;
    this.budget = budget;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    if (!genre.equals("") || genre != null) this.genre = genre;
    else this.genre = "Idk.";
  }

  final public String getFILM_ID() {
    return FILM_ID;
  }

  final public String getTitle() {
    return title;
  }

  final public void setTitle(String title) {
    this.title = title;
  }

  final public String getDate() {
    return date;
  }

  final public void setDate(String date) {
    this.date = date;
  }


  final public int getRunTime() {
    return runTime;
  }

  final public void setRunTime(int runTime) {
    this.runTime = runTime;
  }

  final public int getBudget() {
    return budget;
  }

  final public void setBudget(int budget) {
    this.budget = budget;
  }

  final public int getFilmkockak() {
    return this.runTime * 24;
  }
  final public int getKategoria() {
    if (this.budget <= 1000) return 0;
    else if (this.budget > 1000 && this.budget <= 10_000) return 1;
    else if (this.budget > 10_000 && this.budget <= 100_000) return 2;
    else if (this.budget > 100_000 && this.budget <= 1_000_000) return 3;
    else if (this.budget > 1_000_000 && this.budget <= 10_000_000) return 4;
    else return 5;
  }

  public int getMufajErtekeles() {
    return 0;
  }

  public final int getErtekeles() {
    return getKategoria() + getMufajErtekeles();
  }

  @Override
  public String toString () {
    return "" +
        "Film címe: " + this.title + "\n" +
        "ID: " + this.FILM_ID + "\n" +
        "Bemutatás éve: " +this.date + "\n" +
        "Műfaj: " + this.genre + "\n" +
        "Játékidő (p): " + (this.runTime / 60) + "\n" +
        "Költségvetés: " + String.format("%,d", this.budget) + " $\n" +
        "Értékelés: " + getErtekeles() + "\n";
  }
}

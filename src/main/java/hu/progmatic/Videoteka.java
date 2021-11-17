package hu.progmatic;

public class Videoteka {
  private Film[] filmek;
  private int filmDb;
  private final int size;

  public Videoteka (int size) {
    Film [] filmek = new Film[size];
    this.size = size;
  }

  public void addFilm(Film film) {
    if (this.filmDb > this.size) { throw new RuntimeException(); }
    if (film != null) filmek[filmDb++] = film;
  }
}

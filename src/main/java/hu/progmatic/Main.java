package hu.progmatic;

public class Main {
  public static void main(String[] args) {
    Film filmek = new Film("S123", "Elfújta a szél", "1992.12.02.", null, 7200, 100_000_000);
    HorrorFilm filmek2 = new HorrorFilm("S123", "Elfújta a szél", "1992.12.02.", "", 7200, 100_000_000);
    filmek2.setVoltBenneSzellem(true);
    System.out.println(""+filmek.getGenre());
    System.out.println(filmek.getKategoria());
    System.out.println(filmek2.toString());
  }
}

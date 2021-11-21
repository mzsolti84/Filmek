package hu.progmatic;

import java.io.*;

public class VideotekaFile extends Videoteka{
  private int filmSize = 0;
  private final int maxSize;

  public VideotekaFile(int maxSize) {
    super(maxSize);
    this.maxSize = maxSize;
  }

  public String[] Serialize() {
    String[] s = new String[filmek.length];
    for (int i = 0; i < filmek.length; i++) {
      s[i] = filmek[i].getFILM_ID() + "," + filmek[i].getTitle() + "," + filmek[i].getDate() + ","
          + filmek[i].getGenre() + "," + filmek[i].getRunTime() + "," + filmek[i].getBudget();
    }
    return s;
  }

  public void DeSerialize(String[] adat) {
    //String[] reszek = new String[filmek.length];
    for (int i = 0; i < filmSize; i++) {
      String[] reszek  = adat[i].split(",");
      filmek[i] = new Film(reszek[0], reszek[1], Integer.parseInt(reszek[2]), reszek[3],
          Integer.parseInt(reszek[4]), Integer.parseInt(reszek[5]));
    }
  }

  public boolean save(String fileName){
    String[] datas = Serialize();
    try (Writer writer = new OutputStreamWriter(new FileOutputStream(fileName))) {
      for (String data : datas) {
        writer.write(data + "\n");
      }
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

  protected void load(String fileName) {
    String[] strLines = new String[maxSize + 1];
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
      while ((strLines[filmSize] = reader.readLine()) != null) {
        filmSize++;
      }
      DeSerialize(strLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

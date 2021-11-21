package hu.progmatic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class VideotekaFile extends Videoteka{
  private int filmSize;

  public VideotekaFile(int size) {
    super(size);
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
      filmek[i].setFILM_ID(reszek[0]);
      filmek[i].setTitle(reszek[1]);
      filmek[i].setDate(Integer.parseInt(reszek[2]));
      filmek[i].setGenre(reszek[3]);
      filmek[i].setRunTime(Integer.parseInt(reszek[4]));
      filmek[i].setBudget(Integer.parseInt(reszek[5]));
    }
  }

  public boolean save(String fileName){
    String[] datas = Serialize();
    try (Writer writer = new OutputStreamWriter(new FileOutputStream(fileName))) {
        for (int i = 0; i < datas.length; i++) {
          writer.write(datas[i] + "\n");
        }
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

}

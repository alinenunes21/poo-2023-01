package program;

import java.util.ArrayList;

public class Religiao {
  private ArrayList devotos;
  public void novoFiel(Devoto d) {
	  devotos.add(d)
  }
}
public class  Devoto{
	public  void Devoto(Religiao r) {
		r.novoFiel(this);
	}
}
package program;

public class Permuta {
  public static void Permutacao(String p,String S) {
	  if (S.length()==1) {
		  System.out.println(p+S);
	  }else {
		  String SLinha; //copia de S sem o caracter ci
		  String pLinha; //prefixo + o caracter ci
		  
		  for(int i=0;i<S.length();i++) {
			SLinha = S.substring(0,1)+S.substring(i+1);
			pLinha= p+S.charAt(i);
			Permutacao(pLinha,SLinha);
			
		  }
	  }
  }
  
  public  static void main(String[]args) {
	  Permutacao(new String(args[0]));
  }

private static void Permutacao(String string) {
	// TODO Auto-generated method stub
	
}
}

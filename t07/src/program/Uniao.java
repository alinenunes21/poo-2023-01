package program;

import java.util.ArrayList;

public class Uniao {
    private ArrayList filhos;
    private Pessoa parceiros[];
    
    private  void novoFilho(Pessoa p) {
    	filhos.add(p);
    }
    public Uniao(Pessoa a,Pessoa b, Pessoa[] parceiro) {
    	parceiro[0]=a;
    	parceiro[1]=b;
    }
}

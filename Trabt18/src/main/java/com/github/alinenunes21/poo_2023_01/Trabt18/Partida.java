package com.github.alinenunes21.poo_2023_01.Trabt18;
import java.util.ArrayList;
import java.util.List;
public class Partida {

        private List<Lance> historicoLances;
        private Jogador jogador1;
        private Jogador jogador2;

        public Partida(Jogador jogador1, Jogador jogador2) {
            this.jogador1 = jogador1;
            this.jogador2 = jogador2;
            this.historicoLances = new ArrayList<>();
        }
}

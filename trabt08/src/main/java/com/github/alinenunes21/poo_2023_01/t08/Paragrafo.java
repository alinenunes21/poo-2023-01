package com.github.alinenunes21.poo_2023_01.t08;
import java.util.List;
import java.util.ArrayList;
public class Paragrafo {

        private List<Sentenca> sentencas;

        public Paragrafo() {
            sentencas = new ArrayList<>();
        }

        public void adicionarSentenca(Sentenca sentenca) {
            sentencas.add(sentenca);
        }

        public List<Sentenca> getSentencas() {
            return sentencas;
        }
    }


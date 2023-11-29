package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Voos {
    private List<Companhia> Voos;

    public Voos() {
        Voos = new ArrayList<Companhia>();
    }

    public void adicionarVoo(Companhia voo) {
        Voos.add(voo);
    }

    public void removerVoo(Companhia voo) {
        Voos.remove(voo);
    }

    public void consultarVoos() {
        for (Companhia voo : Voos) {
            voo.Exibirinformacoes();
        }

    }
}
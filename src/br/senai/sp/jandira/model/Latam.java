package br.senai.sp.jandira.model;

public class Latam extends Companhia{
    public Latam (String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo){
        super("Orlando - FL", "Latam","Guarulhos - SP","9h35","17/11/2024","05h30","23h30",85,112);
    }

    @Override
    public void Exibirinformacoes() {
        super.Exibirinformacoes();
    }
}

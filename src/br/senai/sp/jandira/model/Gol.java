package br.senai.sp.jandira.model;

public class Gol extends Companhia{

    public Gol(String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo) {
        super("Paris - FR","Gol", "Guarulhos - SP", "11h10", "15/01/2024", "10h00","21h45", 70, 323);
    }

    @Override
    public void Exibirinformacoes() {
        super.Exibirinformacoes();
    }
}

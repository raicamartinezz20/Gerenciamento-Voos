package br.senai.sp.jandira.model;

public class Azul extends Companhia{
    public Azul (String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo){
        super("Maldivas - ML", "Azul","Guarulhos - SP","22h15min +","02/05/2025","00h15","00H30",50,543);
    }

    @Override
    public void Exibirinformacoes() {
        super.Exibirinformacoes();
    }
}

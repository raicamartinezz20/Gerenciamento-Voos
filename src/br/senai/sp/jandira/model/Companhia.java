package br.senai.sp.jandira.model;

public abstract class Companhia {
    private int passageiros, numeroVoo;
    private String destino, companhia, lugarOrigem, duracaoVoo, partidaDate, idaVoo, saidaVoo;

    public Companhia (String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo ){
        this.companhia = companhia;
        this.destino = destino;
        this.partidaDate = partidaDate;
        this.lugarOrigem = lugarOrigem;
        this.duracaoVoo = duracaoVoo;
        this.idaVoo = idaVoo;
        this.saidaVoo = saidaVoo;
        this.passageiros = passageiros;
        this.numeroVoo = numeroVoo;

    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public String getLugarOrigem() {
        return lugarOrigem;
    }

    public void setLugarOrigem(String lugarOrigem) {
        this.lugarOrigem = lugarOrigem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDuracaoVoo() {
        return duracaoVoo;
    }

    public void setDuracaoVoo(String duracaoVoo) {
        this.duracaoVoo = duracaoVoo;
    }

    public String getPartidaDate() {
        return partidaDate;
    }

    public void setPartidaDate(String partidaDate) {
        this.partidaDate = partidaDate;
    }

    public String getIdaVoo() {
        return idaVoo;
    }

    public void setIdaVoo(String idaVoo) {
        this.idaVoo = idaVoo;
    }

    public String getSaidaVoo() {
        return saidaVoo;
    }

    public void setSaidaVoo(String saidaVoo) {
        this.saidaVoo = saidaVoo;
    }

    public void Exibirinformacoes(){
        System.out.println("Companhia Aérea: " +companhia);
        System.out.println("Número do voo: " +numeroVoo);
        System.out.println("Destino: " +destino);
        System.out.println("Local de Origem: " +lugarOrigem);
        System.out.println("Duração de voo: " +duracaoVoo);
        System.out.println("Partida: "+idaVoo);
        System.out.println("Chegada: "+saidaVoo);
        System.out.println("Quantidade: "+passageiros + " passageiros");


    }
}

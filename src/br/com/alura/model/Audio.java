package br.com.alura.model;

public class Audio {
    private String nome;
    private String tituloAlbum;

    private int totalDeCurtidas;

    private int classificacao;

    private int totalReproducao;
    private double seguidores;
    private double duracaoEmMinutos;

    private double totalSeguidores;

    private int anoDeLancamento;


    private boolean plano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public double getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(double seguidores) {
        this.seguidores = seguidores;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isPlano() {
        return plano;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

     public double getTotalSeguidores() {
        return totalSeguidores;
    }


    public double getClassificacao() {
        return classificacao;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void seguidores(double somaSeguidores) {
        totalSeguidores += somaSeguidores;

    }

    public void curti(){
        this.totalDeCurtidas ++;

    }
    public void reproduz(){
        this.totalReproducao++;
    }

    public void seguidor(){
        this.totalSeguidores++;
    }

    public void exibeFaixatecnica(){


        System.out.println("Nome: " + nome);
        System.out.println("Titulo do Album: " + tituloAlbum);
        System.out.println("Total de Seguidores: " + totalSeguidores +"k");
        System.out.println("Duração em minutos: " + duracaoEmMinutos);


    }


}

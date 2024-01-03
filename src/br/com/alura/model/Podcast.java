package br.com.alura.model;


public class Podcast extends Audio{


    private String sobreDescricao;


    private int anoCriacaoPodcast;

    private int totalDeAvaliacoes;

    private int somaAvaliacoes;


    private int TotalCurtidas;

    public String getSobreDescricao() {
        return sobreDescricao;
    }

    public void setSobreDescricao(String sobreDescricao) {
        this.sobreDescricao = sobreDescricao;
    }

    public int getAnoCriacaoPodcast() {
        return anoCriacaoPodcast;
    }

    public void setAnoCriacaoPodcast(int anoCriacaoPodcast) {
        this.anoCriacaoPodcast = anoCriacaoPodcast;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(int somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalCurtidas() {
        return TotalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        TotalCurtidas = totalCurtidas;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        }else{
            return 5;
        }
    }

    @Override
    public double getSeguidores() {
        double result;
        if (this.getTotalSeguidores() > 10.000) {
            result = 10;
        } else {
            result = 5;
        }
        return result;
    }
}

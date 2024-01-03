package br.com.alura.model;

public class Musicas extends Audio{


    private String musica;

    private String genero;

    private double quantidadeAcesso;

    private double ouvintesMensais;


    private int totalDeMusicasAlbum;

    public int getTotalDeMusicasAlbum() {
        return totalDeMusicasAlbum;
    }

    public void setTotalDeMusicasAlbum(int totalDeMusicasAlbum) {
        this.totalDeMusicasAlbum = totalDeMusicasAlbum;
    }

    public void setQuantidadeAcesso(double quantidadeAcesso) {
        this.quantidadeAcesso = quantidadeAcesso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getMusica() {
        return musica;
    }



    public double getQuantidadeAcesso() {
        return quantidadeAcesso;
    }





    public void setMusica(String musica) {
        this.musica = musica;
    }



    public double getOuvintesMensais() {
        return ouvintesMensais;
    }

    public void setOuvintesMensais(double ouvintesMensais) {
        this.ouvintesMensais = ouvintesMensais;
    }

    @Override
    public double getClassificacao() {
        if(this.getTotalReproducao() > 2000){
            return 10;
        }else{
            return 3;
        }
    }

    @Override
    public double getSeguidores() {
        if(this.getTotalSeguidores() > 10000){
            return 10;
        }else{
            return 5;
        }
    }
}

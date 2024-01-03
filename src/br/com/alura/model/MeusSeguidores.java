package br.com.alura.model;

public class MeusSeguidores {

    public void seguir(Audio audio){
        if(audio.getSeguidores() > 2.000){
            System.out.println(audio.getNome() + " contém muitos seguidores");
        }else{
            System.out.println(audio.getNome() + " está com uma crescente em seguidores");
        }
    }
}

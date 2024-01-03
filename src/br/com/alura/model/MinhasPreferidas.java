package br.com.alura.model;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9){
            System.out.println(audio.getNome() +
                    " é considerado sucesso absoluto e preferido por todos");

        }else{
            System.out.println(audio.getNome() +
                    " também é um dos que todo mundo está curtindo");
        }
    }

}

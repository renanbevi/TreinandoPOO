import br.com.alura.model.MeusSeguidores;
import br.com.alura.model.MinhasPreferidas;
import br.com.alura.model.Musicas;
import br.com.alura.model.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musicas rosadesaron = new Musicas();
        rosadesaron.setNome("Rosa de Saron");
        rosadesaron.setGenero("Rock Cristão");
        rosadesaron.setTituloAlbum("In Concert");
        rosadesaron.setMusica("Do alto da pedra");
        rosadesaron.setAnoDeLancamento(2023);
        rosadesaron.setQuantidadeAcesso(300.000);
        rosadesaron.setOuvintesMensais(630.000);
        rosadesaron.setTotalDeMusicasAlbum(5);
        rosadesaron.setDuracaoEmMinutos(4.54);
        rosadesaron.seguidores(140.000);
        rosadesaron.setTotalDeMusicasAlbum(13);
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        MeusSeguidores meusSeguidores = new MeusSeguidores();



        rosadesaron.exibeFaixatecnica();

        for (int i = 0; i < 4000; i++){
            rosadesaron.reproduz();
        }
        for (int i = 0; i < 50; i++){
            rosadesaron.curti();
        }
        for(int i = 0; i< 500; i++){
            rosadesaron.seguidor();
        }


        minhasPreferidas.inclui(rosadesaron);
        meusSeguidores.seguir(rosadesaron);


        Podcast financeiro = new Podcast();
        financeiro.setNome("FinanceiroZero");
        financeiro.setTituloAlbum("financeiroZero");
        financeiro.setAnoDeLancamento(2023);
        financeiro.seguidores(8.000);
        financeiro.setTotalDeAvaliacoes(140);
        financeiro.setDuracaoEmMinutos(4.45);


        financeiro.exibeFaixatecnica();

        for(int i = 0; i< 2000; i++){
            financeiro.reproduz();
        }
        for(int i = 0; i< 500; i++){
            financeiro.curti();
        }
        for(int i = 0; i< 500; i++){
            financeiro.seguidor();
        }

        minhasPreferidas.inclui(financeiro);
        meusSeguidores.seguir(financeiro);

    }


}
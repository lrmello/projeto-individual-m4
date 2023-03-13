package sonataRecords.src;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ator[] elenco = new Ator[5];
        elenco[0] = new Ator("Jubileu","280519","3 Oscar","Masculino","Cinema");


        Artista novoMusico1 = new Musico("Leonardo","280895","Grammy","Masculino","Rock");

        /*Inserindo novas midias a partir de um array montando uma playlist*/
        Midia[] midias = new Midia[2];
        /*Instanciando uma classe midia para adicionar uma musica */
        midias[0] = new Musica("Musica",2023,"Rock",novoMusico1);

        /*Instanciando uma nova playlist, criando uma nova*/
        Playlist playlist;
        playlist = new Playlist("Nova playlist",
                midias,
                new String[]{"Musica nova"},
                1);
        String[] ordemAtual = playlist.getOrdem();

        playlist.iteracao_playlist();

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.tocar_playlist();

        Filme filme1 = new Filme(120,"Longa",elenco,"Zé timba","Cachorro Extends","A busca pelo pica-pau",2023,"Drama");
        filme1.exibir_filmes();
     }

}
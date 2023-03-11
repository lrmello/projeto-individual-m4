package sonataRecords.src;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ator artista1 = new Ator("Leonardo", "Cinema");

        Ator ator1 = new Ator("Jubileu","Cinema");


        /*Inserindo novas midias a partir de um array montando uma playlist*/
        Midia[] midias = {
                new Musica(120, 5,
                new Artista("nome", "280519", "Oscar", "Masculino"), "Funk", 2023, "Funk")};


        Playlist playlist = new Playlist("Playlist", midias);

        System.out.println("Nome da Playlist: " + playlist.getNome());
        System.out.println("Midias na playList: ");
        for (int j = 0; j < midias.length; j++) {
            System.out.println((j + 1) + "." + playlist.get_midia_atual().getTitulo());
            playlist.proxima_midia();
        }

        Filme filme1 = new Filme(120,"Longa",new String[]{"João"},"Zé timba","Cachorro Extends","A busca pelo pica-pau",2023,"Drama");
        System.out.println("Titulo: "+filme1.getTitulo());
        System.out.println("Ano: "+filme1.getAno());
        System.out.println("Genêro: "+filme1.getGenero());
        System.out.println("Duração: "+filme1.getDuracao()+"minutos");
        System.out.println("Tipo: "+filme1.getTipo());
        System.out.println("Diretor: "+filme1.getDiretor());
        System.out.println("Produtor: "+filme1.getProdutor());
        System.out.println("Elenco: ");
        for (Ator ator: filme1.getElenco()){
            System.out.println("-" + ator.getNome() + "("+ ator.getFormacao() +")");
        }
     }

    }
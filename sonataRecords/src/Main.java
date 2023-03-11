package sonataRecords.src;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Rockeiros");
        Artista artista = new Artista("Leonardo","28/05/1995","1 Grammy","M");
        Artista artista1 = new Artista("Beyoncé", "04/09/1981","28 Grammys","F");
        Artista artista2 = new Artista("Ed Sheeran", "17/02/1991","4 Grammys","Pop");
        Artista artista3 = new Artista("The Beatles", "25/06/1942","7 Grammys","Rock");
        Artista artista4 = new Artista("Ariana Grande", "26/06/1993","2 Grammys","Pop");
        Artista artista5 = new Artista("Taylor Swift", "13/12/1989","11 Grammys","Country/Pop");
        Artista artista6 = new Artista("Michael Jackson", "29/08/1958","28 Grammys","Pop");
        Artista artista7 = new Artista("Post Malone", "04/07/1995","3 American Music Awards","Hip-Hop");
        Artista artista8 = new Artista("Justin Bieber", "01/03/1994","1 Grammy","Pop");
        Artista artista9 = new Artista("Adele", "04/09/81","15 Grammys","Pop/Rock");

        Musica[] ordem = new Musica[10];

        ordem[0] = new Musica(4,5,artista,"Minha musica",2023,"Rock");
        ordem[1] = new Musica(3.45,2,artista1,"Halo",2008,"Pop");
        ordem[2] = new Musica(5.32,5,artista2,"Shape of You",2017,"Pop");
        ordem[3] = new Musica(3.15,2,artista3,"Hey Jude",1968,"Rock");
        ordem[4] = new Musica(4.50,3,artista4,"7 Rings",2019,"Rock");
        ordem[5] = new Musica(3.55,3,artista5,"Love Story",2008,"Rock");
        ordem[6] = new Musica(2.58,1,artista6,"Billie Jean",1993,"Rock");
        ordem[7] = new Musica(4.02,2,artista7,"Circles",2019,"Rock");
        ordem[8] = new Musica(3.35,2,artista8,"Yummy",2020,"Rock");
        ordem[9] = new Musica(2.22,4,artista9,"Rolling in the Deep",2010,"Rock");

        playlist.getOrdem();


        System.out.println();
     }
}
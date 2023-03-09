package sonataRecords.src;

import java.util.Arrays;
public class Musica extends Midia {
    private int duracao;

    private int notaMusica;

    public Musica(String titulo, int ano,String genero,Artista artista, int nota, int duracao, int notaMusica){
        super(titulo,ano,genero,artista,nota);
        this.duracao = duracao;
        this.notaMusica =notaMusica;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setDuracao(int duracao){
        this.duracao =duracao;
    }

    public int getNotaMusica() {
        return notaMusica;
    }

    public void setNotaMusica(int notaMusica){
        this.notaMusica = notaMusica;
    }




}

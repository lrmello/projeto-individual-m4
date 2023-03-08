package sonataRecords.src;
//A classe midia será responsável por armazenar todos os dados do artista
public class Midia {
    private String titulo;
    private int ano;
    private String genero;
    /*Artista é uma classe pai de músico e ator */
    private Artista artista;
    private int nota;

    public void midia(String titulo, int ano, String genero,Artista artista,int nota){
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.artista = artista;
        this.nota = nota;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }


    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista){
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }
    public boolean isMusica() {
        return artista instanceof Musico;
    }

    public boolean isFilme() {
        return artista instanceof Ator;
    }

}



package sonataRecords.src;
//A classe midia será responsável por armazenar todos os dados do artista
public class Midia {
    private String titulo;
    private int ano;
    private String genero;
    private Artista artista;

    public void midia(String titulo, int duracao, String genero){
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.artista = artista;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAno(){
        return ano;
    }

    public String getGenero(){
        return genero;
    }

    public Artista getArtista() {
        return artista;
    }
}

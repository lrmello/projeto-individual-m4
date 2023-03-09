package sonataRecords.src;

public class Artista {
    private String nome;
    private int dataNascimento;
    private String premiacoes;
    private String genero;

   //Construtor padrão
    public Artista(){

    }

    public Artista(String nome,int dataNascimento, String premiacoes,String genero){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public int getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getPremiacoes(){
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes){
        this.premiacoes = premiacoes;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
}

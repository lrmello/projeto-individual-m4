package sonataRecords.src;

public class Ator extends Artista {
    String formacao;

    //Construtor do ator

    public Ator(String nome,int dataNascimento,String premiacoes,String genero,String formacao){
        super(nome,dataNascimento,premiacoes,genero);
        this.formacao = formacao;
    }

    public Ator(String nomeArtista) {
    }

    public String getFormacao(){
        return formacao;
    }

    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

}

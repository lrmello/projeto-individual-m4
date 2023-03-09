package sonataRecords.src;

public class Filme extends Midia{
    private int duracao;
    private String tipo;
    private Ator[] elenco;
    private String diretor;
    private String produtor;

    public Filme(String titulo, int ano, String genero, Artista artista, int nota, int duracao,String tipo,Ator[] elenco,String diretor,String produtor) {
        super(titulo, ano, genero, artista, nota);
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public String getTipo(){
        return tipo;
    }

    public Ator[] getElenco(){
        return elenco;
    }

    public void setElenco(Ator[] elenco){
        this.elenco = elenco;
    }

    public String getDiretor(){
        return diretor;
    }

    public void setProdutor(){
        this.produtor = produtor;
    }

    public void setProdutor(String produtor){
        this.produtor = produtor;
    }

    public boolean isFilme(){
        return true;
    }
}

package sonataRecords.src;

class Filme extends Midia{
    private int duracao;
    private String tipo;
    private Ator[] elenco = new Ator[10];
    private String diretor;
    private String produtor;


    /*Construtor com parametro*/
    public Filme(int duracao,String tipo,Ator[] elenco,String diretor,String produtor,String titulo,int ano, String genero) {
        super(titulo, ano, genero);
        this.setDuracao(duracao);
        this.setTipo(tipo);
        this.setElenco(elenco);
        this.setDiretor(diretor);
        this.setProdutor(produtor);
    }

    public int getDuracao(){
        return duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
        if (duracao <= 30){
            this.setTipo("Curta");
        }else {
            this.setTipo("Longa");
        }
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo) {
       this.tipo = tipo;
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


    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    public String getProdutor() {
        return produtor;
    }


    public void setProdutor(String produtor){
        this.produtor = produtor;
    }



}

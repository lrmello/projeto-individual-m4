package sonataRecords.src;

class Artista {
    private String nome;
    private String dataNascimento;
    private String premiacoes;
    private String genero;


    public Artista(String nome,String dataNascimento,String premiacoes,String genero){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }

    /*Os getters e setters getNome, setNome, getDataNascimento, setDataNascimento,
    * getPremiacoes,setPremiacoes, getGenero e setGenero estão sendo encapsuladas apenas
    * para manipulação de forma indireta  */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }


    public void setDataNascimento(String dataNascimento){
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

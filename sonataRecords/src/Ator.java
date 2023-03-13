package sonataRecords.src;

class Ator extends Artista {
    private String formacao;

    //Construtor do ator
    public Ator(String nome, String dataNascimento, String premiacoes, String genero, String formacao) {
        super(nome, dataNascimento, premiacoes, genero);
        this.formacao = formacao;
    }

    public String getFormacao(){
        return formacao;
    }

    public void setFormacao(String formacao){
        /*Aqui ele filtrar se o ator ele atua no teatro ou no cinema ou em outros */
        if (formacao.equalsIgnoreCase("teatro")||formacao.equalsIgnoreCase("cinema")||formacao.equalsIgnoreCase("outros")){
            this.formacao = formacao;
        }else{
            System.out.println("Tipo inválido");
        }
    }

}

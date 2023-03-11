package sonataRecords.src;

class Ator extends Artista {
    private String formacao;

    //Construtor do ator
    public Ator(String nome,String formacao){
        super(nome);
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

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    /*toString ex*/
    @Override
    public String toString(){
        return "Ator: "+this.getNome() +", formação"+this.formacao;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Ator)){
            return false;
        }

        Ator other = (Ator) obj;
        return this.getNome().equals(other.getNome()) && this.formacao.equals(other.formacao);
    }

}

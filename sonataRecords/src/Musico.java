package sonataRecords.src;

/*A classe músico puxa todas as propriedades de artista como herança*/
class Musico extends Artista{

    private String estiloMusical;

    public Musico(String nome, String dataNascimento, String premiacoes, String genero, String estiloMusical) {
        super(nome, dataNascimento, premiacoes, genero);
        this.estiloMusical = estiloMusical;
    }

    public String getEstiloMusical(){
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public void escolher_estilo_musical() {
        /*Aqui ele filtrar se o músico atua com instrumento ou vocal ou os dois */
        if(estiloMusical.equalsIgnoreCase("instrumental")||estiloMusical.equalsIgnoreCase("vocal")||estiloMusical.equalsIgnoreCase("instrumental e vocal")){
            this.estiloMusical = estiloMusical;
        }else{
            throw new IllegalArgumentException("Tipo de música inválido");
        }
    }



}

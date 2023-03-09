package sonataRecords.src;

public class Musico extends Artista{
    private String instrumento;
    private String estiloMusical;



    public Musico(String nome,int dataNascimento, String premiacoes, String genero,String instrumento, String estiloMusical){
        super(nome,dataNascimento,premiacoes,genero);
        this.instrumento = instrumento;
        this.estiloMusical = estiloMusical;
    }

    public Musico(String nomeArtista) {
    }

    public String getInstrumento(){
        return instrumento;
    }

    public void setInstrumento(String instrumento){
        this.instrumento = instrumento;
    }

    public String getEstiloMusical(){
        return estiloMusical;
    }

    public void setEstiloMusical(){
        if(estiloMusical.equals("instrumental")||estiloMusical.equals("vocal")||estiloMusical.equals("instrumental e vocal")){
            this.estiloMusical = estiloMusical;
        }else{
            throw new IllegalArgumentException("Tipo de música inválido");
        }
    }



}

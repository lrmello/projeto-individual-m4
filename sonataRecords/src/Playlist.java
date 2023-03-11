package sonataRecords.src;

/*A classe playlist irá ser reponsável por toda a playlist das músicas*/
class Playlist {
    private String nome;
    private Midia midia;
    private String[] ordem = new String[10];

    public Playlist(String nome) {
        this.nome = nome;
        this.midia = midia;
        this.ordem = ordem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Midia getMidias() {
        return midia;
    }

    public void setMidias(String[] midias) {
        this.midia = midia;
    }

    public String[] getOrdem() {
        return ordem;
    }

    public void setOrdem(String[] ordem) {
        this.ordem = ordem;
    }

   /*Próxima midia como metódo*/
    public void proxima_midia(){

    }

    /*Midia anterior como método*/
    public void midia_anterior(){
        /*ordem[1];*/
    }

}

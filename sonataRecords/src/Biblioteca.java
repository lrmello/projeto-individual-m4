package sonataRecords.src;
/*A classe biblioteca aplica a composição midia como aplicação de método*/
class Biblioteca {
    private Midia midia;
    private String[] usuarios;
    private String[] playlists;

    public Biblioteca(){
        this.midia = midia;
        this.usuarios = usuarios;
        this.playlists = playlists;
    }

    public Midia getMidia() {
        return midia;
    }
    public void setMidias(Midia midias) {
        this.midia = midia;
    }

    public String[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String[] usuarios) {
        this.usuarios = usuarios;
    }

    public String[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(String[] playlists) {
        this.playlists = playlists;
    }

    public void tocar_playlist(){

    }
}

package sonataRecords.src;
/*A classe biblioteca aplica a composição midia como aplicação de método*/
class Biblioteca {
    private Midia midia;
    private String[] usuarios;
    private Playlist[] playlists;

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

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlists = playlists;
    }


    /*Aqui ela irá tocar as playlists no estado atual */
    public void tocar_playlist(String nome_playlist){
        for (Playlist playlist : playlists){
            if (playlist.getNome().equals(nome_playlist)){
                String[] ordem = playlist.getOrdem();
                for (String midiaNome : ordem){
                    Midia midia = playlist.get_midia_atual();
                }

                return;
            }
        }
        System.out.println("Playlist não encontrada");
    }


}



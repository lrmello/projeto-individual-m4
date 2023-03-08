package sonataRecords.src;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Midia> midias;
    private List<Usuario> usuarios;
    private List<Playlist> playlists;

    public Biblioteca(){
        midias = new ArrayList<>();
        usuarios = new ArrayList<>();
        playlists = new ArrayList<>();
    }

    public List<Midia> getMidias(){
        return midias;
    }

    public void setMidias(List<Midia> midias){
        this.midias= midias;
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }

    public List<Playlist> getPlaylists(){
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists){
        this.playlists=playlists;
    }
}

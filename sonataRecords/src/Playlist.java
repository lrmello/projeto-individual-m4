package sonataRecords.src;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Midia> midias;
    private List<Midia> ordem;

    public Playlist(String nome){
        this.nome = nome;
        this.midias = new ArrayList<>();
        this.ordem = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Midia> getMidias(){
        return midias;
    }

    public void setMidias(List<Midia> midias){
        this.midias = midias;
    }

    public List<Midia> getOrdem(){
        return ordem;
    }

    public void setOrdem(List<Midia> ordem){
        this.ordem = ordem;
    }

    public void adicionarMidia(Midia midia){
        midias.add(midia);
        ordem.add(midia);
    }

    public void removerMidia(Midia midia){
        midias.remove(midia);
        ordem.remove(midia);
    }
}

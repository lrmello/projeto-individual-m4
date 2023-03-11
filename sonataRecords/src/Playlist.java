package sonataRecords.src;

import java.util.Arrays;
import java.util.Collections;

/*A classe playlist irá ser reponsável por toda a playlist das músicas*/
class Playlist {
    private String nome;
    private Midia[] midias = new Midia[10];
    private String[] ordem = new String[10];
    /*Varíavel para definir posição atual da mídia*/
    private int posicaoAtual;

    public Playlist(String nome, Midia[] midias) {
        this.nome = nome;
        this.midias = midias;
        this.setOrdem(ordem);
        for (int j = 0; j <ordem.length;j++){
            ordem[j] = Integer.toString(j);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMidias(Midia[] midias) {
        this.midias = midias;
    }

    public Midia get_midia_atual(){
        return midias[posicaoAtual];
    }

    public String[] getOrdem() {
        return ordem;
    }

    public void setOrdem(String[] ordem) {
        this.ordem = ordem;
    }

   /*Próxima midia como metódo*/
    public void proxima_midia(){
        if (posicaoAtual < midias.length - 1) {
            posicaoAtual++;
        }


    }

    /*Midia anterior como método*/
    public void midia_anterior(){
        if(posicaoAtual > 0){
            posicaoAtual--;}
    }

    public void misturar_midias(){
        Collections.shuffle(Arrays.asList(ordem));
    }

}

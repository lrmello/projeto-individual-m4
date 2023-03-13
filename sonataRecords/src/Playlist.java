package sonataRecords.src;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*A classe playlist irá ser reponsável por toda a playlist das músicas*/
class Playlist {
    private String nome;
    private Midia[] midias;
    private String[] ordem;
    /*Varíavel para definir posição atual da mídia*/
    private int posicaoAtual;

    public Playlist(String nome, Midia[] midias, String[] ordem, int posicaoAtual) {
        this.nome = nome;
        this.midias = midias;
        this.ordem = ordem;
        this.posicaoAtual = posicaoAtual;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Midia[] getMidias() {
        return midias;
    }

    public void setMidias(Midia[] midias) {
        this.midias = midias;
    }

    public int getPosicaoAtual() {
        return posicaoAtual;
    }

    public void setPosicaoAtual(int posicaoAtual) {
        this.posicaoAtual = posicaoAtual;
    }

    public Midia get_midia_atual() {
        return midias[posicaoAtual];
    }

    public String[] getOrdem() {
        return ordem;
    }

    public void setOrdem(String[] ordem) {
        this.ordem = ordem;
    }

    /*Próxima midia como metódo*/
    public void proxima_midia() {
        if (posicaoAtual == 0) {
            posicaoAtual = 0;
        } else {
            posicaoAtual++;
        }
    }

    /*Midia anterior como método*/
    public void midia_anterior() {
        if (posicaoAtual == 0) {
            posicaoAtual = midias.length -1;
        }else{
            posicaoAtual--;
        }
    }

    /*Misturar playlist*/
    public void misturar_midias(){
        Collections.shuffle(Arrays.asList(ordem));
    }


    /*O metodo iteracao_playlist será responsável pela iteração do usuário de forma que a midia será */
    public String iteracao_playlist() {
        Scanner insert = new Scanner(System.in);
        String respostaUsuario = "";

        if (!respostaUsuario.equalsIgnoreCase("Saindo")) {
            Midia midiaAtual = midias[posicaoAtual];
            System.out.println("Tocando agora: " + midiaAtual.getTitulo());

            System.out.println("Digite 'Musica' para ir para a próxima música,'Anterior' para ir a música anterior ou 'Sair 'para finalizar");
            respostaUsuario = insert.nextLine();

            if (respostaUsuario.equalsIgnoreCase("Musica")) {
                proxima_midia();
            } else if (respostaUsuario.equalsIgnoreCase("Anterior")) {
                midia_anterior();
            }
        }
        return respostaUsuario;
    }

}

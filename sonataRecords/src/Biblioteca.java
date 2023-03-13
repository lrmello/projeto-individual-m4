package sonataRecords.src;

import java.util.Scanner;

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



    /*Aqui ela irá tocar as playlists no estado atual
    * Um metodo pode ou não passar parametro ou não dependendo do que será passado
    *
    * Nesse caso, o metodo tocar_playlist irá executar uma ação para que possa tocar a música da playlist
    *
    *  */
    public String tocar_playlist(){
        Scanner input = new Scanner(System.in);

        System.out.println("Você quer que inicie a sua playlist?");

        String retorno = input.nextLine();

        if (retorno.equalsIgnoreCase("Sim")){
            System.out.println("Iniciando playlist");
        }else if(retorno.equalsIgnoreCase("Não")){
            System.out.println("Encerrando playlist");
            tocar_playlist();
        }else{
            System.out.println("Não entendi o que você escreveu");
        }
        
        return playlists.toString();

    }


}



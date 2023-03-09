package sonataRecords.src;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Playlist playlist = new Playlist("Minha Playlist");

        //Foi criado um loop para opção do usuário escolher
        while (true){
            System.out.println("---===MENU DE OPÇÕES===---");
            System.out.println("1.Adicionar mídia");
            System.out.println("2.Remover mídia");
            System.out.println("3.Exibir playlist");
            System.out.println("4.Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    /*Adicionando midia*/
                    System.out.println("Digite o titulo da midia: ");
                    String titulo = input.nextLine();

                    System.out.println("Digite o ano de lançamento da midia: ");
                    int ano = input.nextInt();

                    input.nextLine();

                    System.out.println("Digite o genero da midia: ");
                    String genero = input.nextLine();

                    System.out.println("Digite a nota da midia (1 a 5): ");
                    int nota = input.nextInt();

                        Artista artista;
                        Midia midia1 = new Midia(titulo,ano,genero, artista,nota);

                    playlist.adicionarMidia(midia1);
                    break;

                case 2:
                    /*Remover midia*/
                    System.out.println("Digite o titulo da midia que deseja remover: ");
                    String tituloRemover = input.nextLine();
                    /*Procurando midia na playlist*/
                    for(Midia midia : playlist.getMidias()){
                        if(midia.getTitulo().equals(tituloRemover)){
                            /*Removendo midia da playlist*/
                            playlist.removerMidia(midia);
                            System.out.println("Midia removida com sucesso!");
                            break;
                        }
                    }
                    break;

                case 3:
                    /*Exibir playlist*/
                    System.out.println("===PLAYLIST===");
                    for(Midia midia:playlist.getOrdem()){
                        System.out.println(midia.getTitulo());
                    }
                    break;

                case 4:
                    /*Sair*/
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        }

    }

}

package sonataRecords.src;

/*A classe música está herando os dados da classe midia*/
class Musica extends Midia {

    private double duracao;
    private int notaMusica;
    /*artista é componente de classe Artista*/
    private Artista artistaComposto;

    public Musica(double duracao, int notaMusica, Artista artistaComposto,String titulo,int ano,String genero){
        super(titulo,ano,genero);
        this.artistaComposto = artistaComposto;
        this.duracao = duracao;
        this.notaMusica= notaMusica;
    }


    /*Os getters e setters getDuracao e setDuracao estão sendo encapulsadas sendo manipuladas de forma indireta */
    public double getDuracao(){
        return duracao;
    }

    public void setDuracao(double duracao){
        this.duracao = duracao;
    }

    public int getNotaMusica(){
        return notaMusica;
    }

    public void setNotaMusica(int notaMusica) {
        if (notaMusica <=5){
            this.notaMusica = notaMusica;
        }else{
            System.out.println("Nota inválida! Insira uma nota de 1 a 5");
        }
    }

}

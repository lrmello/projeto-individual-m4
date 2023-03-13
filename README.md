<center>##projeto-individual-m4</center>
<br>
<center>Projeto para desenvolvimento em Java para o bootcamp Resilia</center>

***Nome do projeto: Sonata Records***

**Desenvolvimento** 

Foi aplicado o desenvolvimento da aplicação **Java** para uma empresa de midias

Estrutura da aplicação

Classes principais 
```java
Artista.java
Biblioteca.java
Midia.java
Playlist.java
Main.java(Exibição dos arquivos)
```
Classes herdadas
```
Ator.java(Herdada pela classe Artista)
Musico.java(Herdada da classe Artista)
Filme.java(Herdada da classe Midia)
Musica(Herdada da classe Midia)
```

Exemplo de inserção de um novo Artista a partir de uma instância:


````Java
/* Estrutura da instância
 * Ator ator = new ator(Nome do artista, Formação)
 */
Ator artista1 = new Ator("Leonardo", "Cinema");
Ator ator1 = new Ator("Jubileu","Cinema");
````

Foi usado encapsulamento com getters e setters:

````java
public String getDataNascimento(){
        return dataNascimento;
    }


 public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
````

Foi aplicado composição de uma classe instanciando de uma outra classe sendo uma classe privada:

````java
private Artista artistaComposto;
````

Houve herança de uma classe, tendo uma classe pai e filha:

```java
class Musica extends Midia

```

É utilizado vários metódos para passar uma nova mídia, porém elas não terão paramêtros para o usuário
````java

  /* Para iteração com o usuário para a playlist */

  public String iteracao_playlist()

  /* Para seguir para a próxima midia */

  public void proxima_midia()

  /* Para seguir para a mídia anterior */

  public void midia_anterior() 

  /* Para misturar as mídias pela posição atual*/

  public void misturar_midias()

````
Para instanciar a playlist, criando uma playlist:

````java

       Playlist playlist;
        playlist = new Playlist("Nova playlist",
                midias,
                new String[]{"Musica nova"},
                1);

````
Para iniciar a playlist:

````java
biblioteca.tocar_playlist();
````

Linguagem feita:

<center><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="100" height="100"/></center>


Criador do código:

Leonardo Reis

><a href="https://www.linkedin.com/in/leonardo-reis-95228893/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>
  
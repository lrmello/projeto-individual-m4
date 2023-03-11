<center>##projeto-individual-m4</center>
Projeto para desenvolvimento em Java para o bootcamp Resilia

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

Linguagem feita:

<center><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="100" height="100"/></center>


Criador do código:

Leonardo Reis

><a href="https://www.linkedin.com/in/leonardo-reis-95228893/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>
  
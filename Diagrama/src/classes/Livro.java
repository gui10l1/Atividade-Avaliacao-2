/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Livro {
    private String titulo;
    private Autor autor;

    public Livro(String titulo, Autor autor) {
      this.titulo = titulo;
      this.autor = autor;
    }

    public String getTitulo() {
      return titulo;
    }

    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }

    public Autor getAutor() {
      return autor;
    }

    public void setAutor(Autor autor) {
      this.autor = autor;
    }
}

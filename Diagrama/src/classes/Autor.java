/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Autor extends Pessoa {
    private String bibliografia;

    public Autor(String nome, String bibliografia) {
      super(nome);
      this.bibliografia = bibliografia;
    }

    public String getBibliografia() {
      return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
      this.bibliografia = bibliografia;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, int codigo) {
      super(nome);
      this.codigo = codigo;
    }

    public int getCodigo() {
      return codigo;
    }

    public void setCodigo(int codigo) {
      this.codigo = codigo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Funcionario extends Pessoa {
    private int matricula;

    public Funcionario(String nome, int matricula) {
      super(nome);
      this.matricula = matricula;
    }

    public int getMatricula() {
      return matricula;
    }

    public void setMatricula(int matricula) {
      this.matricula = matricula;
    }
}

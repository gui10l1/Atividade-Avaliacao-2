/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
      super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
      this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getters e Setters
    public double getAjudaDeCusto() {
      return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
      this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinição do método calcularSalario()
    @Override
    public double calcularSalario() {
      double salarioLiquido = super.calcularSalario() + ajudaDeCusto;
      return salarioLiquido;
    }
}

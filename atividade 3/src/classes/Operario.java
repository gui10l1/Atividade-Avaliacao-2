/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtor
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
      super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
      this.valorProducao = valorProducao;
      this.comissao = comissao;
    }

    // Getters e Setters
    public double getValorProducao() {
      return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
      this.valorProducao = valorProducao;
    }

    public double getComissao() {
      return comissao;
    }

    public void setComissao(double comissao) {
      this.comissao = comissao;
    }

    // Redefinição do método calcularSalario()
    @Override
    public double calcularSalario() {
      double salarioLiquido = super.calcularSalario() + (valorProducao * (comissao / 100));
      return salarioLiquido;
    }
}

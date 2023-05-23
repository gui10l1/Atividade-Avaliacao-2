/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    // Construtor
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
      super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
      this.valorVendas = valorVendas;
      this.comissao = comissao;
    }

    // Getters e Setters
    public double getValorVendas() {
      return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
      this.valorVendas = valorVendas;
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
      double salarioLiquido = super.calcularSalario() + (valorVendas * (comissao / 100));
      return salarioLiquido;
    }
}

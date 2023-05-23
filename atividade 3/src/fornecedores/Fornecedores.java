/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fornecedores;

import classes.Administrador;
import classes.Empregado;
import classes.Fornecedor;
import classes.Operario;
import classes.Vendedor;

/**
 *
 * @author Gui
 */
public class Fornecedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("* * * * * * * * * *");
        System.out.println("Dados do fornecedor");
        System.out.println("* * * * * * * * * *");
        Fornecedor fornecedor = new Fornecedor("João", "Rua A", "123456789", 5000.0, 2000.0);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.obterSaldo());

        System.out.println();

        System.out.println("* * * * * * * * * ");
        System.out.println("Dados do empregado");
        System.out.println("* * * * * * * * * ");
        Empregado empregado = new Empregado("Maria", "Rua B", "987654321", 1, 3000.0, 10.0);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Salário: " + empregado.calcularSalario());

        System.out.println();

        System.out.println("* * * * * * * * * * * ");
        System.out.println("Dados do administrador");
        System.out.println("* * * * * * * * * * * ");
        Administrador administrador = new Administrador("Carlos", "Rua C", "456789123", 2, 4000.0, 15.0, 1000.0);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Salário: " + administrador.calcularSalario());

        System.out.println();

        System.out.println("* * * * * * * * *");
        System.out.println("Dados do operario");
        System.out.println("* * * * * * * * *");
        Operario operario = new Operario("Pedro", "Rua D", "654789123", 3, 2500.0, 8.0, 10000.0, 5.0);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Salário: " + operario.calcularSalario());

        System.out.println();

        System.out.println("* * * * * * * * *");
        System.out.println("Dados do vendedor");
        System.out.println("* * * * * * * * *");
        Vendedor vendedor = new Vendedor("Ana", "Rua E", "987123654", 4, 2000.0, 5.0, 5000.0, 3.0);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salário: " + vendedor.calcularSalario());
    }
    
}

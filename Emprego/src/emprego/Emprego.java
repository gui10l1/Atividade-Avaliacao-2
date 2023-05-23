/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emprego;

import classes.Cliente;
import classes.Empregado;
import classes.Gerente;
import classes.Vendedor;

/**
 *
 * @author Aluno da UCB
 */
public class Emprego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente manager = new Gerente();
        Vendedor seller = new Vendedor();
        Cliente client = new Cliente();
        
        manager.setNome("Guilherme Ribeiro");
        manager.setIdade(21);
        manager.setNomeGerencia("Neytec");
        manager.setMatricula("UC21200089");
        manager.setSalario(10000);
        double inssManager = manager.valorINSS();
        
        seller.setNome("Davi Gomes");
        seller.setValorVendas(15000);
        seller.setQuantVendas(30);
        
        client.setNome("Lucas Felix");
        client.setIdade(21);
        client.setValorDivida(5000);
        client.setAnoNascimento(2001);
        client.setSexo("masculino");
        
        System.out.println("* * * * * * * * ");
        System.out.println("Dados do gerente");
        System.out.println("* * * * * * * * ");
        System.out.println("Nome: "+manager.getNome());
        System.out.println("Idade: "+manager.getIdade());
        System.out.println("Nome da gerencia: "+manager.getNomeGerencia());
        System.out.println("Marticula: "+manager.getMatricula());
        System.out.println("Salario: "+manager.getSalario());
        System.out.println("Valor do INSS: "+inssManager);
        
        System.out.println();
        
        System.out.println("* * * * * * * * *");
        System.out.println("Dados do vendedor");
        System.out.println("* * * * * * * * *");
        System.out.println("Nome: "+seller.getNome());
        System.out.println("Valor das vendas: "+seller.getValorVendas());
        System.out.println("Quantidade de vendas: "+seller.getQuantVendas());
        
        System.out.println();
        
        System.out.println("* * * * * * * * ");
        System.out.println("Dados do cliente");
        System.out.println("* * * * * * * * ");
        System.out.println("Nome: "+client.getNome());
        System.out.println("Idade: "+client.getIdade());
        System.out.println("Sexo: "+client.getSexo());
        System.out.println("Valor da divida: "+client.getValorDivida());
        System.out.println("Ano nascimento: "+client.getAnoNascimento());
    }
    
}

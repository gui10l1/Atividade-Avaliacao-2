/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama;

import classes.Autor;
import classes.Cliente;
import classes.Funcionario;
import classes.Livro;

/**
 *
 * @author Gui
 */
public class Diagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor = new Autor("João", "Bibliografia do Autor");
        Livro livro = new Livro("Título do Livro", autor);
        Cliente cliente = new Cliente("Maria", 123);
        Funcionario funcionario = new Funcionario("Pedro", 456);

        System.out.println("Informações do Livro:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Bibliografia do Autor: " + livro.getAutor().getBibliografia());

        System.out.println();

        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Código: " + cliente.getCodigo());

        System.out.println();

        System.out.println("Informações do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
    }
    
}

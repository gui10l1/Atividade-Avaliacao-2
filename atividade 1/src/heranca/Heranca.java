/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

import classes.Cachorro;
import classes.Peixe;

/**
 *
 * @author Aluno da UCB
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peixe fishOne = new Peixe();
        Peixe fishTwo = new Peixe();
        Peixe fishThree = new Peixe();
        
        Cachorro dog = new Cachorro();
        
        fishOne.setNome("Peixe Dourado");
        fishOne.setTipoHabitat("Agua doce");
        fishOne.setPeso(1.2);
        
        fishTwo.setNome("Peixe Palhaco");
        fishTwo.setTipoHabitat("Agua salgada");
        fishTwo.setPeso(0.8);
        
        fishThree.setNome("Peixe Zebra");
        fishThree.setTipoHabitat("Agua ornamental");
        fishThree.setPeso(1.5);
        
        dog.setNome("Bidu");
        dog.setPeso(12.5);
        dog.setRaca("Rusk Siberiano");
        
        System.out.println("* * * * * * * * ");
        System.out.println("Dados dos peixes");
        System.out.println("* * * * * * * * ");
        System.out.println("Peixe 1:");
        System.out.println("Nome -> "+fishOne.getNome());
        System.out.println("Tipo de habitat -> "+fishOne.getTipoHabitat());
        System.out.println("Peso -> "+fishOne.getPeso());
        
        System.out.println("Peixe 2:");
        System.out.println("Nome -> "+fishTwo.getNome());
        System.out.println("Tipo de habitat -> "+fishTwo.getTipoHabitat());
        System.out.println("Peso -> "+fishTwo.getPeso());
        
        System.out.println("Peixe 3:");
        System.out.println("Nome -> "+fishThree.getNome());
        System.out.println("Tipo de habitat -> "+fishThree.getTipoHabitat());
        System.out.println("Peso -> "+fishThree.getPeso());
        
        System.out.println("* * * * * * * * *");
        System.out.println("Dados do cachorro");
        System.out.println("* * * * * * * * *");
        
        System.out.println("Cachorro 1:");
        System.out.println("Nome -> "+dog.getNome());
        System.out.println("Peso -> "+dog.getPeso());
        System.out.println("Raca -> "+dog.getRaca());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bimestre1;
 
import java.util.Scanner;

public class Banco {
    private Cliente[] clientes = new Cliente[250];
    
    public Cliente novoClienteFisico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Id: ");
        int id = sc.nextInt();
        System.out.println("Informe o nome: ");
        String nome = sc.next();
        System.out.println("Informe o CPF: ");
        String documento = sc.next();
        Cliente c = new Cliente(id, "Fisico", nome, documento);
        return c;
    }
}

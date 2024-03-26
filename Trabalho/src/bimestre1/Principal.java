/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bimestre1;

public class Principal {
    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente c = b.novoClienteFisico();
        
        System.out.println(c);
        
        
        Cliente cj = b.novoClienteJuridico();
        
        System.out.println(cj);
    }
}

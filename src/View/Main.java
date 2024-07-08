/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Models.Cliente;
import Models.Servico;
import Models.Usuario;


/**
 *
 * @author filho
 */
public class Main {
    public static void main(String[] args){

        Cliente c1 = new Cliente("Anderon", 15, "Afonso", "41");
        System.out.println(c1.getEndereço());
        
        Usuario u1 = new Usuario("Cata",12,"1234","2");
        System.out.println(u1);
    }
}

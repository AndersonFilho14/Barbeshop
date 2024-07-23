/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;


/**
 *
 * @author filho
 */
public class Main {
    public static void main(String[] args){

        Cliente c1 = new Cliente("Anderon", 15, "Afonso", "41");
        
        Usuario u1 = new Usuario("Cata",12,"1234","2");
        
        Servico s1 = new Servico(1,"barba", 20);
        
        Agendamento a1 = new Agendamento(c1.getId(),c1,s1,s1.getValor(),"15/07/2024 09:00");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Login;

/**
 *
 * @author filho
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema(){
        //Pegar o usuario
        //`Pesquisar o usuario no banco
        ///Se o user da view, tiver o mesmo user do banco,redirecione para o menu principal
        ///Se não mostrar q o user esta invalido
    }
    
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibiMensagem("Executei o fiz tarefa");
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;


/**
 *
 * @author filho
 */
public class Usuario extends Pessoa{
  
    protected String senha;
    protected String nivelAcesso;

    public Usuario(String Nome, int Id,String senha, String nivelAcesso) {
        super(Nome, Id);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String Nome, int Id, String Sexo, String dataNascimento, int telefone, String email, int rg,String senha, String nivelAcesso) {
        super(Nome, Id, Sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    
    
}

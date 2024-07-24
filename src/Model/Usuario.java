/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


/**
 *
 * @author filho
 */
public class Usuario extends Pessoa{
  
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int Id,String Nome, String senha, String nivelAcesso) {
        super(Nome, Id);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario( int Id,String Nome, String Sexo, String dataNascimento, String telefone, String email, String rg,String senha, String nivelAcesso) {
        super(Nome, Id, Sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }
    
    
    
}

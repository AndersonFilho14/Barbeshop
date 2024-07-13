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
public class Cliente extends Pessoa {
    private String endereço;
    private String cep;

    public Cliente( String Nome, int Id, String Sexo, String dataNascimento, int telefone, String email, int rg,String endereço, String cep) {
        super(Nome, Id, Sexo, dataNascimento, telefone, email, rg);
        this.endereço = endereço;
        this.cep = cep;
    }

    public Cliente(String Nome, int Id,String endereço, String cep) {
        super(Nome, Id);
        this.endereço = endereço;
        this.cep = cep;
    }
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
}

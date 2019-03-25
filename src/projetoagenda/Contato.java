
package projetoagenda;

import java.io.Serializable;

public class Contato implements Serializable {
    
    // atributos
    private String nome;
    private String celular;
    private String telefone;
    private String endereco;
    private String email;

    public Contato(String nome, String celular, String telefone, String endereco, String email) {
        this.nome = nome;
        this.celular = celular;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

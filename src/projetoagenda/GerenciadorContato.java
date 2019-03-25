package projetoagenda;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContato {
    
    // atributo
    static List<Contato> listaContatos = new ArrayList<>();
    static List<Contato> listaContatosExcluidos = new ArrayList<>();
    static List<Contato> listaParametro = new ArrayList<>();

    static Contato pesquisarContatoNome(String nome) {
        for (int i = 0; i < listaContatos.size(); i++) {
            if (listaContatos.get(i).getNome().equals(nome)) {
                return listaContatos.get(i);
            }
        }
        return null;
    }

    static Contato pesquisarContatoCelular(String celular) {
        for (int i = 0; i < listaContatos.size(); i++) {
            if (listaContatos.get(i).getCelular().equals(celular)) {
                return listaContatos.get(i);
            }
        }
        return null;
    }

    static Contato pesquisarContatoTelefone(String telefone) {
        for (int i = 0; i < listaContatos.size(); i++) {
            if (listaContatos.get(i).getTelefone().equals(telefone)) {
                return listaContatos.get(i);
            }
        }
        return null;
    }
    
    static Contato pesquisarContatoExcluidoNome(String nome) {
        for (int i = 0; i < listaContatosExcluidos.size(); i++) {
            if (listaContatosExcluidos.get(i).getNome().equals(nome)) {
                return listaContatosExcluidos.get(i);
            }
        }
        return null;
    }
    
    static Contato pesquisarContatoExcluidoCelular(String celular) {
        for (int i = 0; i < listaContatosExcluidos.size(); i++) {
            if (listaContatosExcluidos.get(i).getCelular().equals(celular)) {
                return listaContatosExcluidos.get(i);
            }
        }
        return null;
    }
    
    static Contato pesquisarContatoExcluidoTelefone(String telefone) {
        for (int i = 0; i < listaContatosExcluidos.size(); i++) {
            if (listaContatosExcluidos.get(i).getTelefone().equals(telefone)) {
                return listaContatosExcluidos.get(i);
            }
        }
        return null;
    }
    
}

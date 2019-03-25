package projetoagenda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class BancoDeDados {
    
    static final String caminhoContatos = "arquivoContatos.txt";
    static final String caminhoContatosExcluidos = "arquivoContatosExcluidos.txt";
    static final String caminhoParametro = "arquivoParametro.txt";
    
    public static void salvarContatos(List<Contato> contatos) {
        try (ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream(caminhoContatos))) {
            streamOut.writeObject(contatos);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public static List<Contato> lerArquivoContatos() {
        if (new File(caminhoContatos).canRead()) {
            try (ObjectInputStream streamIn = new ObjectInputStream(new FileInputStream(caminhoContatos))) {
                List<Contato> contatos = (List<Contato>) streamIn.readObject();
                return contatos;
            } catch (FileNotFoundException ex) {

            } catch (ClassNotFoundException | IOException ex) {

            }
        }
        return null;
    }
    
    public static void salvarContatosExcluidos(List<Contato> contatosExcluidos) {
        try (ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream(caminhoContatosExcluidos))) {
            streamOut.writeObject(contatosExcluidos);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public static List<Contato> lerArquivoContatosExcluidos() {
        if (new File(caminhoContatosExcluidos).canRead()) {
            try (ObjectInputStream streamIn = new ObjectInputStream(new FileInputStream(caminhoContatosExcluidos))) {
                List<Contato> contatosExcluidos = (List<Contato>) streamIn.readObject();
                return contatosExcluidos;
            } catch (FileNotFoundException ex) {

            } catch (ClassNotFoundException | IOException ex) {

            }
        }
        return null;
    }
    
    public static void salvarContatosParametro(List<Contato> contatosParametro) {
        try (ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream(caminhoParametro))) {
            streamOut.writeObject(contatosParametro);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public static List<Contato> lerArquivoContatosParametro() {
        if (new File(caminhoParametro).canRead()) {
            try (ObjectInputStream streamIn = new ObjectInputStream(new FileInputStream(caminhoParametro))) {
                List<Contato> contatosParametro = (List<Contato>) streamIn.readObject();
                return contatosParametro;
            } catch (FileNotFoundException ex) {

            } catch (ClassNotFoundException | IOException ex) {

            }
        }
        return null;
    }
    
}

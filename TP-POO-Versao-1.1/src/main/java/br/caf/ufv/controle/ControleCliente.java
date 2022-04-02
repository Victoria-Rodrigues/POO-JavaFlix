
package br.caf.ufv.controle;
import br.caf.ufv.modelo.entidade.Cliente;
import java.util.ArrayList;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoJaCadastrado;
import br.caf.ufv.modelo.persistencia.ClienteDAO;
import java.sql.SQLException;


public class ControleCliente{
    ClienteDAO dao;
    public ControleCliente() throws SQLException{
        dao = new ClienteDAO();
    }
    
    public void inserirCliente(String cpf, String nome, String senha) throws ExcecaoJaCadastrado{
        Cliente cliente = new Cliente(cpf,nome,senha);
        Cliente p = pesquisa(cpf);
        if( p== null){
            dao.inserir(cliente);
        }else{
            throw new ExcecaoJaCadastrado();
        }  
    }
    
    public Cliente pesquisa(String idnum){
        
        return dao.pesquisa(idnum);
    }
    
    public ArrayList<Cliente>listar(){
        return dao.listarClientes();
    }

    public Cliente procurarCliente(String idnum, String senha){
        Cliente p = pesquisa(idnum);
        if(p == null){
            System.out.println("Cliente não cadastrado");
        }else{
            System.out.println("Cliente encontrado");
            System.out.println(p.toString());
        }
        return p;
    }
    
    public void deletar(Cliente cliente){
        if(pesquisa(cliente.getCpf())!= null){
            dao.remove(cliente.getCpf());
        }else{
            System.out.println("Falha:Conta inexistente!");
        }
    }
    
    public void updateNome(Cliente c, String nome){
        dao.updateNome(c, nome);
    }
    
    public void updateSenha(Cliente c, String senhaNova, String senhaAntiga){
        dao.updateSenha(c, senhaNova, senhaAntiga);
    } 
    
}

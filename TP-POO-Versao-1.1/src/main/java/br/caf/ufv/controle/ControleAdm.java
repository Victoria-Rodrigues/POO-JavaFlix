package br.caf.ufv.controle;

import br.caf.ufv.modelo.entidade.Administrador;
import br.caf.ufv.modelo.entidade.EntidadeBase;
import br.caf.ufv.modelo.entidade.excecao.ExcecaoJaCadastrado;
import br.caf.ufv.modelo.persistencia.AdmDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControleAdm {
    AdmDAO dao;
    public ControleAdm() throws SQLException{
        dao = new AdmDAO();
    }
    
    public void inserirCliente(String cpf, String nome, String senha) throws ExcecaoJaCadastrado{
        Administrador adm = new Administrador(cpf,nome,senha);
        Administrador p = pesquisa(cpf);
        if( p== null){
            dao.inserir(adm);
        }else{
            throw new ExcecaoJaCadastrado();
        }  
    }
    
    public Administrador pesquisa(String idnum){
        
        return dao.pesquisa(idnum);
    }
    
    public ArrayList<String> listar(){
        return dao.listarAdministrador();
    }

    public Administrador procurarCliente(String idnum, String senha){
        Administrador p = pesquisa(idnum);
        if(p == null){
            System.out.println("Administrador não cadastrado");
        }else{
            System.out.println("Administrador encontrado");
            System.out.println(p.toString());
        }
        return p;
    }
    
    public void deletar(Administrador adm){
        if(pesquisa(adm.getCpf())!= null){
            dao.remove(adm.getCpf());
        }else{
            System.out.println("Falha:Conta inexistente!");
        }
    }
}

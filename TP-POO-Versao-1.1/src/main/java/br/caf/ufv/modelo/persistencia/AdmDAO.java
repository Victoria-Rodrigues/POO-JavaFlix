
package br.caf.ufv.modelo.persistencia;

import br.caf.ufv.Conexao.Conexao;
import br.caf.ufv.modelo.entidade.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdmDAO{
    Connection conexao;
     PreparedStatement pst = null;
     ResultSet rs = null;
    
    public AdmDAO() throws SQLException{
        this.conexao = Conexao.getConnection();       
    }

    public void inserir(Administrador cliente){
        String sql = "INSERT INTO administrador(cpf, nome,senha) VALUES (?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getCpf());
            pst.setString(2, cliente.getNome());
            pst.setString(3, cliente.getSenha());
            int adicionado = pst.executeUpdate();
            
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Administrador adicionado com sucesso");
            }         
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha na inserção");
        }
    }

    public Administrador pesquisa(String cpf){
        
        String sql = "select * from administrador where cpf =?";
        String nome = null;
        String idnum = null ;
        String idsenha = null ;
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cpf);
            rs =pst.executeQuery();
             if(rs.next()){
                 nome = rs.getNString("nome");
                 idnum = rs.getNString("cpf");
                 idsenha = rs.getNString("senha");   
             }  
             if(idnum == null){
                 return null;
             }
            Administrador cliente = new Administrador(idnum, nome, idsenha);           
            return cliente;

        } catch (Exception e){
            return null;
        }
    }
     
    public void remove(String cpf){
        int confirma = JOptionPane.showConfirmDialog(null, "Confima a exclusão desta conta?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from administrador where cpf=?";
            try{
                
                pst = conexao.prepareStatement(sql);
                pst.setString(1, cpf);
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Conta deletada com sucesso");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Falha na exclusão da conta");
            }
        }
    }
     
    public ArrayList<String> listarAdministrador() {
        String idnome = null;
        String idnum = null ;
        String idsenha = null ;
        try {
            String sql = "select * from administrador";
            pst = conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();         
            ArrayList<String> listagem = new ArrayList<String>();
            while(rs.next()){
                idnum = rs.getNString("cpf");
                idnome = rs.getNString("nome");
                idsenha = rs.getNString("senha");
                 
                String resposta = "Nome:"+idnome+" CPF:"+idnum+" Senha:"+idsenha;
                listagem.add(resposta);
            }
            return listagem;
        } catch (SQLException e) {
            System.out.println("Erro listar");
        }
        return null;
    }

}

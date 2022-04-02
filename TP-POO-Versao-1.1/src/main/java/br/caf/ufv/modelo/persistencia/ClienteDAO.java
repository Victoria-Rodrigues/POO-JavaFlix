
package br.caf.ufv.modelo.persistencia;

import br.caf.ufv.Conexao.Conexao;
import br.caf.ufv.modelo.entidade.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO{
     Connection conexao;
     PreparedStatement pst = null;
     ResultSet rs = null;
    
    public ClienteDAO() throws SQLException{
        this.conexao = Conexao.getConnection();       
    }

    public void inserir(Cliente cliente){
        String sql = "INSERT INTO cliente(cpf, nome,senha) VALUES (?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getCpf());
            pst.setString(2, cliente.getNome());
            pst.setString(3, cliente.getSenha());
            int adicionado = pst.executeUpdate();
            
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso");
            }         
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha na inserção");
        }
    }

    public Cliente pesquisa(String cpf){
        
        String sql = "select * from cliente where cpf =?";
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
            Cliente cliente = new Cliente(idnum, nome, idsenha);           
            return cliente;

        } catch (Exception e){
            return null;
        }
    }
     
    public void remove(String cpf){
        int confirma = JOptionPane.showConfirmDialog(null, "Confima a exclusão desta conta?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from cliente where cpf=?";
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
     
    public ArrayList<Cliente> listarClientes() {
        String idnome = null;
        String idnum = null ;
        String idsenha = null ;
        try {
            String sql = "select * from cliente";
            pst = conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();         
            ArrayList<Cliente> listagem = new ArrayList<Cliente>();
            while(rs.next()){
                idnum = rs.getNString("cpf");
                idnome = rs.getNString("nome");
                idsenha = rs.getNString("senha");
                 
                //String resposta = "Nome:"+idnome+" CPF:"+idnum+" Senha:"+idsenha;
                Cliente c = new Cliente(idnum,idnome,idsenha);
                listagem.add(c);
            }
            return listagem;
        } catch (SQLException e) {
            System.out.println("Erro listar");
        }
        return null;
    }

    public void updateNome(Cliente c,String nome) {
        try{
            String sql = "UPDATE cliente SET nome = ? WHERE cpf = ?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1,nome );
            pst.setString(2,c.getId());
            int apagado = pst.executeUpdate();
            System.out.println(apagado);
            if (apagado > 0) {
                JOptionPane.showMessageDialog(null, "Nome alterado com sucesso");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possível alterar o nome");
            }
    }

    public void updateSenha(Cliente c, String novaSenha, String senhaAntiga) {
        try{
            String sql = "UPDATE cliente SET senha = ? WHERE cpf = ? and senha = ?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1,novaSenha );
            pst.setString(2,c.getCpf());
            pst.setString(3, senhaAntiga);
            int apagado = pst.executeUpdate();
            if(apagado == 0){
               JOptionPane.showMessageDialog(null, "Senha antiga incorreta.");

            }
            else if(apagado > 0){
                JOptionPane.showMessageDialog(null, "Senha alterado com sucesso");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha na alteraçao");
        }
    }
}

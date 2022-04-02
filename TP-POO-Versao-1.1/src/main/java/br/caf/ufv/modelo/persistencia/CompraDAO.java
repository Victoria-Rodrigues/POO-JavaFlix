package br.caf.ufv.modelo.persistencia;

import br.caf.ufv.Conexao.Conexao;
import br.caf.ufv.modelo.entidade.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CompraDAO {
    Connection conexao;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public CompraDAO() throws SQLException{
        this.conexao = Conexao.getConnection();
    }

    public void inserir(String cpf, int idProduto, int quantidade, float total) {
        
        String sql = "INSERT INTO listaCompra(cpf,idProduto,quantidade,total) VALUES (?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.setInt(2, idProduto);
            pst.setInt(3, quantidade);
            pst.setFloat(4, total);
            int adicionado = pst.executeUpdate();             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha na inserção lista de compras");
        }
    }
    
    public Compra pesquisa(String cpf,int idProduto){
        String sql = "select * from listaCompra where cpf=? and idproduto =? ";
        
        String num = null;
        int numIdenticador = 0,  quantidade=0;    
        float total=0;
       
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.setInt(2, idProduto);
            rs =pst.executeQuery();
             if(rs.next()){
                 num = rs.getString("cpf");
                 numIdenticador = rs.getInt("idProduto");
                 quantidade = rs.getInt("quantidade");
                 total = rs.getFloat("total");
             }  
             if(num == null){
                 return null;
             }
            Compra compra = new Compra(num,numIdenticador,quantidade,total);           
            return compra;

        } catch (Exception e){
            return null;
        }
    }
    
    public void update(int idProduto, int quant, float totalCompra){
                
        try{
            String sql = "UPDATE listaCompra SET quantidade = ?,total =?  WHERE idProduto = ?";
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, quant);
            pst.setFloat(2, totalCompra);
            pst.setInt(3,idProduto);
            int apagado = pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha na alteraçao");
        }
        
    }
    
   
     public ArrayList<Compra> listar(String cpf){       
        try {
            ArrayList<Compra> listagem = new ArrayList<Compra>();
            String sql = "select * from listaCompra";
            pst = conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();  
             while(rs.next()){
                String idcpf = rs.getString(1);
                if(idcpf.equals(cpf)){
                    int identificador = rs.getInt(2);
                    int quant = rs.getInt(3);
                    float preco = rs.getFloat(4);
                    Compra compra = new Compra(idcpf,identificador,quant,preco);
                    listagem.add(compra);
                }  
             }
            return listagem;
        } catch (SQLException e) {
            System.out.println("Erro no retorna da lista de compras");
        }
        return null;
    }
     
}

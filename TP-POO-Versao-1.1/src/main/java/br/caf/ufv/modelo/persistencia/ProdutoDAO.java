package br.caf.ufv.modelo.persistencia;

import br.caf.ufv.Conexao.Conexao;
import br.caf.ufv.modelo.entidade.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    Connection conexao;
     PreparedStatement pst = null;
     ResultSet rs = null;
    
    public ProdutoDAO() throws SQLException{
        this.conexao = Conexao.getConnection();  
    }

    public void inserir(Produto produto) {
         String sql = "INSERT INTO produto(idProduto,identificador,titulo,duracao,preco, descricao, tipoLegenda, quantidade)"
                 + " VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, produto.getIdProduto());
            pst.setInt(2, produto.getIdentificador());
            pst.setString(3, produto.getTitulo());
            pst.setFloat(4, produto.getDuracao());
            pst.setFloat(5, produto.getPreco());
            pst.setString(6, produto.getDescricao());
            pst.setInt(7, produto.getTipoLegenda());
            pst.setInt(8, produto.getQuantidade());
            int adicionado = pst.executeUpdate();
            
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso");
            }         
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha na inserção");
        }
    }

     public Produto pesquisa(int idProduto){
        String sql = "select * from produto where idproduto =?";
        
        String numProduto = null;
        int numIdenticador = 0,legenda = 0,quant=0;
        float numDuracao = 0,numPreco=0;
        String tit = null, desc = null;
        String flag = null;
       
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idProduto);
            rs =pst.executeQuery();
             if(rs.next()){
                 numProduto = rs.getString("idproduto");
                 numIdenticador = rs.getInt("identificador");
                 tit = rs.getString("titulo"); 
                 numDuracao = rs.getFloat("duracao");   
                 numPreco = rs.getFloat("preco");
                 desc = rs.getNString("descricao");
                 legenda = rs.getInt("tipoLegenda");
                 quant = rs.getInt("quantidade");
             }  
             if(numProduto == null){
                 return null;
             }
            Produto produto = new Produto(idProduto,numIdenticador,tit,numDuracao,numPreco, desc, legenda, quant);           
            return produto;

        } catch (Exception e){
            return null;
        }
    }
     
    public void remover(Produto produto){
        int confirma = JOptionPane.showConfirmDialog(null, "Confima a exclusão deste produto?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from produto where idProduto=?";
            try{
                
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, produto.getIdProduto());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Falha na exclusão");
            }
        }
    }
    
    public void removerAux(Produto produto){
        
        String sql = "delete from produto where idProduto=?";
            try{ 
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, produto.getIdProduto());
                int apagado = pst.executeUpdate();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Falha na exclusão");
            }
        
    }
     
    public ArrayList<Produto> listarProdutos() {
        String tipoProduto = null;
        String tipoL = null;
        
        try {
            String sql = "select * from produto";
            pst = conexao.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();         
            ArrayList<Produto> listagem = new ArrayList<Produto>();
            while(rs.next()){
                int idProduto = rs.getInt("idProduto");
                int identificador = rs.getInt("identificador");
                String titulo = rs.getNString("titulo");
                float duracao = rs.getFloat("duracao");
                float preco = rs.getFloat("preco");
                String descricao = rs.getNString("descricao");
                int tipoLegenda = rs.getInt("tipoLegenda");
                int quantidade = rs.getInt("quantidade");
                Produto produto = new Produto(idProduto,identificador,titulo,duracao,preco, descricao, tipoLegenda, quantidade);              
                listagem.add(produto);
            }
            return listagem;
        } catch (SQLException e) {
            System.out.println("Erro listar");
        }
        return null;
        
    }
    
    public void update(int idProduto, int quant){
                
        try{
            String sql = "UPDATE produto SET quantidade = ? WHERE idProduto = ?";
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, quant);
            pst.setInt(2,idProduto);
            int apagado = pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha na alteraçao");
        }
        
    }
     
}

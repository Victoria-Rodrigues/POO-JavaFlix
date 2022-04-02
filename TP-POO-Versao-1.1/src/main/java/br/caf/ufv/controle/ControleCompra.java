package br.caf.ufv.controle;

import br.caf.ufv.modelo.entidade.Compra;
import br.caf.ufv.modelo.persistencia.CompraDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ControleCompra {
    private static final Logger LOGGER = Logger.getLogger("br.ufv.caf.locadora");
    private CompraDAO dao;
    
    public ControleCompra() throws SQLException {
        dao = new CompraDAO();
        
    }
    
    public void inserirProduto(String cpf,int idProduto, int quantidade, float total){
        Compra compra = dao.pesquisa(cpf, idProduto);
        if(compra ==null){
            dao.inserir(cpf, idProduto, quantidade, total);
        }else{
            dao.update(idProduto, quantidade + compra.getQuantidade(), total+compra.getTotal());
        }            
    }
    
    
    public ArrayList<Compra>  listar(String cpf){
        ArrayList<Compra> p = dao.listar(cpf);
        for(int i=0; i<p.size();i++){
            System.out.println(p.get(i).getDataAquisicaoProduto());
            System.out.println("Cod:"+p.get(i).getCodProduto()+" - Quant:"+p.get(i).getQuantidade()+" - Total R$ "+p.get(i).getTotal());
            System.out.println("--------------------------------------------------------");
        }
        return p;
    }
    
}

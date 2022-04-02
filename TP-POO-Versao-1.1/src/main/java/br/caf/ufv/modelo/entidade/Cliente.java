package br.caf.ufv.modelo.entidade;

import br.caf.ufv.controle.ControleProduto;
import br.caf.ufv.modelo.entidade.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente extends Pessoa implements Comparator<Cliente>, EntidadeBase{
    
    ArrayList<Compra> listadeCompra;

    public Cliente(String cpf, String nome, String senha) {
        super(cpf, nome,senha);
        listadeCompra = new ArrayList();
    }
    
    @Override
    public String toString(){
        return "Dados do Cliente: "+ super.toString();
    }
    
    
    public void inserirListaCompra(Cliente cliente,int idProduto, int quantidade){     
        ControleProduto controleProduto;
        try {
            controleProduto = new ControleProduto();
            Produto p = controleProduto.pesquisa(idProduto);

            if( p != null){
                if(p.getQuantidade()>= quantidade){
                    Compra compra = new Compra(cliente.getCpf(),p.getIdProduto(),quantidade, quantidade*p.getPreco());
                    listadeCompra.add(compra);
                    JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");
                }else{
                    
                    JOptionPane.showMessageDialog(null, "Quantidade inválida!Tente novamente.");
                }      
            }else{
                 JOptionPane.showMessageDialog(null, "Produto não existe no sistema!Digite o código correto do produto da compra.!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public ArrayList<Compra> listar() {
        return listadeCompra;
    }

    public boolean removerItem(int idProduto) {
        for(int i=0; i<listadeCompra.size();i++){
            if(listadeCompra.get(i).getCodProduto() == idProduto){
                listadeCompra.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Compra pesquisa(int idProduto){
        for(int i=0; i<listadeCompra.size();i++){
            if(listadeCompra.get(i).getCodProduto() == idProduto){
                return listadeCompra.get(i);
            }
        }
        return null;
    }

    @Override
    public int compare(Cliente c1, Cliente c2) {
        String nomec1 = c1.getNome();
        String nomec2 = c2.getNome();
        return nomec1.compareTo(nomec2);
    }

   
    public void clearCarrinho(){
        listadeCompra.clear();
    }
    
    @Override
    public String getId() {
        return getCpf();
    }
      
}

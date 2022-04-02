
package br.caf.ufv.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    private static Connection connection;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String servidor = "127.0.0.1";
    private static final String porta = "3306";
    private static final String banco = "javaflix";
    private static final String url = "jdbc:mysql://"+ servidor+":"+porta+"/"+banco;
    private static final String usuario = "root";
    private static final String senha = "123456";

    private Conexao() {
    }
    
    
    public static synchronized Connection getConnection() throws SQLException {
            if (connection == null) {
                    try {
                            Class.forName(driver);
                            connection = DriverManager.getConnection(url, usuario, senha);
                            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
                    } catch (ClassNotFoundException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver de conexão\n" + e);
                    } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "Não foi possível estabalecer conexão com o banco de dados\n" + e);
                    }
            }
            return connection;
    }

    
    
}

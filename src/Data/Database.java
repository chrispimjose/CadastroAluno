package Data;

// Importando os pacotes SQL
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;

// Classe de conexão com banco e operação de CRUD
public class Database {
    //Constantes de configuração do banco de dados
    static final String JDBC_DRIVE = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/cadalunobase";
    static final String USER = "root";
    static final String PASS = "Java2@24";    

    // Propriedades de conexão com o banco de dados
    static Connection dbconn = null;
    static Statement sqlmgr = null;
    static ResultSet rs = null;
    
    public static void connection() {
        // Teste de conexão com o banco de dados
        try {
            // Conectando ao banco de dados
            dbconn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado ao banco de dados com sucesso em: "+URL);
            // Cria objeto de manipulação de SQL
            sqlmgr=dbconn.createStatement(); 
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    //Finaliza o banco de dados e a conexão
    public void CloseDatabase() throws SQLException{
        try {
            // Fechando a conexão com o banco de dados
            sqlmgr.close();
            dbconn.close();            
            System.out.println("Conexão com o banco de dados fechada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }

    //Insere dados no banco de dados recebe via sql
    public String InsertData(String sql) {
        try {
            // Inserindo dados no banco de dados            
            sqlmgr.executeUpdate(sql);  
            //Trata as excessões          
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados no banco de dados: " + e.getMessage());
        }
        System.out.println("Dados inseridos com sucesso! - "+sql);
        return "Dados inseridos com sucesso!";
    }

    //Atualiza os dados no banco de dados via sql
    public String UpdateData(String sql) {
        try {
            // Atualizando dados no banco de dados            
            sqlmgr.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados no banco de dados: " + e.getMessage());
        }
        return "Dados atualizados com sucesso!";
    }

    // Deleta dados no banco de dados via sql
    public String DeleteData(String sql) {
        try {
            // Deletando dados no banco de dados            
            sqlmgr.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Erro ao deletar dados no banco de dados: " + e.getMessage());
        }
        return "Dados deletados com sucesso!";
    }

    //Executa uma consulta no banco de dados via sql
    public ResultSet SelectData(String sql) {
        try {
            // Executando consulta no banco de dados            
            rs = sqlmgr.executeQuery(sql);

        } catch (SQLException e) {
            System.out.println("Erro ao executar consulta no banco de dados: " + e.getMessage());
        }
        return rs;
    }

    

}

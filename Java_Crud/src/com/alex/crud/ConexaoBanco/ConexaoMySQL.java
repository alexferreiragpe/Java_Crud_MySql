/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.Crud.ConexaoBanco;

/**
 *
 * @author alexf
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {

    //Nome do usuário do mysql
   // private static final String USERNAME = "root";

    //Senha do mysql
    //private static final String PASSWORD = "";

    //Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
   // private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/dados";
    
    
    // hostinger remoto
    
    private static final String DATABASE_URL = "jdbc:mysql://sql136.main-hosting.eu/u418628712_dados";
    private static final String USERNAME = "xxxxx";
    private static final String PASSWORD = "xxxxx";

    /**
     * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário
     * e senha fornecidos
     *
     * @param username
     * @param senha
     * @return uma conexão com o banco de dados
     * @throws Exception
     */
    public static Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver"); //Faz com que a classe seja carregada pela JVM

        //Cria a conexão com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws Exception {

        //Recupera uma conexão com o banco de dados
        Connection con = createConnectionToMySQL();

        //Testa se a conexão é nula
        if (con != null) {
            System.out.println("Conectado ao Banco de Dados com Sucesso!\n\n" + con);
            con.close();
        }

    }

}

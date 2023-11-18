/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.dal;

import java.sql.*;

/**
 *
 * @author josej
 */
public class ModuloDeConexao {

    //metodo para inciar a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chama o drive importado pela biblioteca
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazena informações do banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "123456";
        //estabelecendo a conexão com o db
        try { 
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
        
    }

}

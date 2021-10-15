/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author geovane
 */
public class FabricaDeConexoes {

    public static Connection getConexao() {
        try {            
            Connection con = DriverManager.
            getConnection("jdbc:mysql://localhost/locadora", 
                "root", "1234");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Connection conn = FabricaDeConexoes.getConexao();
            String sql = "select * from categoria "
                    + "where cod_categoria=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 2);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("nome_categoria"));
            }

            stmt.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

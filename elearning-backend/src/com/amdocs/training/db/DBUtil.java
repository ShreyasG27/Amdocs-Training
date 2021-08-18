package com.amdocs.training.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    static String url_name="jdbc:mysql://localhost:3306/elearningschema";
    static String user="root";
    static String pass="root";

    private static Connection conn=null;

    private DBUtil(){

    }

    public static Connection getConn() {
        if(conn==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn= DriverManager.getConnection(url_name,user,pass);
                return conn;
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}

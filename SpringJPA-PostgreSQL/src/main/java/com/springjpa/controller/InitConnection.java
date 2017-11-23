/*package com.springjpa.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InitConnection {
     
     public static void main (String[] args){
          try {
               Class.forName("org.postgresql.Driver");
               try {
                    Connection conn = DriverManager.getConnection("jdbc:postgresql://baasu.db.elephantsql.com:5432/fsrozlbh", "fsrozlbh", "GKZxfI6-1YZ1GIOACbhHKi5XA5B3NvMN");
                    System.out.print("Connection Success");
               } catch (SQLException e) {
                    e.printStackTrace();
               }
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     
     }
}*/
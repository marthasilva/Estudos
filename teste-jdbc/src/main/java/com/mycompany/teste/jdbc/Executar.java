/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Samsung
 */
public class Executar {
    
    public static void main(String[] args) {
        
        Conexao con = new Conexao();
        JdbcTemplate template = new JdbcTemplate(con.getDataSource());
        System.out.println(con.listar());
    }
}

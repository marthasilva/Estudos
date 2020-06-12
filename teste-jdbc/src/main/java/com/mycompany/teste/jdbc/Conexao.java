/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.jdbc;

import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Samsung
 */
public class Conexao {
    
    private BasicDataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public Conexao() {
        
        dataSource = new BasicDataSource();
       
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ShadowTech?useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("#Gf49315764862");
        
        jdbcTemplate = new JdbcTemplate(this.dataSource);
    }
    
    public List listar () {
        
        List<Map<String,Object>> lista = jdbcTemplate.queryForList("select * from Aluno");
        return lista;
    }

    @Override
    public String toString() {
        return "Conexao{" + "dataSource=" + dataSource + ", jdbcTemplate=" + jdbcTemplate + '}';
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    }
    
    
    


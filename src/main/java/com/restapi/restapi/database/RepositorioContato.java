package com.restapi.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.restapi.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}

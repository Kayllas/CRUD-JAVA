package com.interview.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interview.restapi.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long> {

}

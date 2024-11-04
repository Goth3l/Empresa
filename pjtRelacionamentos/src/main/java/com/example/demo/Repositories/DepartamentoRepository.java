package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Funcionario;

public class DepartamentoRepository {
	
	public interface UsuarioRepository extends JpaRepository<Funcionario, Long>{
	
	}
}
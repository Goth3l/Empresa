package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Funcionario;

public class FuncionarioRepository {
	
	public interface UsuarioRepository extends JpaRepository<Funcionario, Long>{
		
	}

}
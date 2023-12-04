package com.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findUsuarioByCpf(String cpf);
	
}

package br.com.monteiro.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.monteiro.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}

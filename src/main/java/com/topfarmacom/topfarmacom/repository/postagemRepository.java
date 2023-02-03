package com.topfarmacom.topfarmacom.repository;

import java.util.List;
import com.topfarmacom.topfarmacom.model.postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface postagemRepository extends JpaRepository<postagem, Long> {
	public List <postagem> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}

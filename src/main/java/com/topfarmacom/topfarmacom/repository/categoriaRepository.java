package com.topfarmacom.topfarmacom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.topfarmacom.topfarmacom.model.categoria;

@Repository
public interface categoriaRepository extends JpaRepository<categoria, Long> {

	public List<categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}

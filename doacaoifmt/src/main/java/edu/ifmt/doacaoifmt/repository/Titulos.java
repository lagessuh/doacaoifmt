package edu.ifmt.doacaoifmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ifmt.doacaoifmt.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
}

package com.example.aula2303;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

    List<Aluno> findByNomeContainingIgnoringCase(String nome);
    List<Aluno> findByCursoLessThan(String curso);
    void deleteById(Long ra);
    Optional<Produto> findAllById(Long ra);
}

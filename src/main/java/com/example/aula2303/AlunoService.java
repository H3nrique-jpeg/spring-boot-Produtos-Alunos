package com.example.aula2303;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository repositorio;

    public List<Aluno> listarTodos()
    {
        return repositorio.findAll();
    }
    public Aluno buscarPorRa(Long ra)
    {
        return repositorio.findById(ra).orElseThrow(
            () -> new RuntimeException("Aluno não encontrado"+ra)
        );
    }
    public Aluno salvar(Aluno aluno)
    {
        if (aluno.getNome() == null)
            throw new IllegalArgumentException("Aluno invalido");
        return repositorio.save(aluno);
    }
     public void deletar(Long ra){
        buscarPorRa(ra);
        repositorio.deleteById(ra);
    }
     public ResponseEntity<Produto> save(Produto produto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
     }
}



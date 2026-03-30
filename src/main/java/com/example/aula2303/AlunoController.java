package com.example.aula2303;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoRepository;

    @GetMapping("/{ra}")
    public Aluno buscar(@PathVariable Long ra) {
        Aluno aluno = alunoRepository.buscarPorRa(ra);
        return aluno.orElse(null);
    }
     @GetMapping
    public List<Aluno> listar() {return alunoRepository.listarTodos();}
    
    @PostMapping
    public Aluno createCustumer(@RequestBody Aluno aluno) {
        return alunoRepository.salvar(aluno);
    }
    
}

package com.senai.escola.Controller;

import com.senai.escola.Models.Aluno;
import com.senai.escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/alunos")

public class AlunoController {

    private final AlunoService alunoService;


    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List <Aluno> buscarAlunos (){
        return alunoService.buscartTodosAlunos();
    }

    @PostMapping
    public Aluno salvar (@RequestBody Aluno aluno) {

        return alunoService.salvarNovoAluno (aluno);
    }

    @GetMapping ("/{id}")
    public Aluno buscaAlunoId(Long id){
        return alunoService.buscarAlunoId(id)
    }

    @DeleteMapping
    public void excluirAluno(Long id){
        alunoService.deletarAluno(id);


    }

}

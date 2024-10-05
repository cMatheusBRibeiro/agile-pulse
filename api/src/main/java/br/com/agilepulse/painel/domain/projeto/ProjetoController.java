package br.com.agilepulse.painel.domain.projeto;

import br.com.agilepulse.painel.domain.projeto.repositories.ProjetoRepository;
import br.com.agilepulse.painel.domain.projeto.responses.DadosProjeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepository;

    @GetMapping
    public ResponseEntity<List<DadosProjeto>> buscarProjetos() {
        var projetos = this.projetoRepository.findAll();
        return ResponseEntity.ok(projetos.stream().map(DadosProjeto::new).toList());
    }

}

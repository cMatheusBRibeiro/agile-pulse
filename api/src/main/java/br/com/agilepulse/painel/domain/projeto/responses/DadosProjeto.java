package br.com.agilepulse.painel.domain.projeto.responses;

import br.com.agilepulse.painel.domain.projeto.models.Projeto;

public record DadosProjeto(
        Integer id,
        String nome
) {
    public DadosProjeto(Projeto projeto) {
        this(projeto.getId(), projeto.getNome());
    }
}

package br.com.agilepulse.painel.domain.projeto.models;

import br.com.agilepulse.painel.usuario.models.Usuario;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "projeto")
@Entity(name = "Projeto")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String nome;

}

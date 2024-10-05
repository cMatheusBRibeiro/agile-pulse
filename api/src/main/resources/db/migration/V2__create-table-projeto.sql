CREATE TABLE projeto (
    id SERIAL PRIMARY KEY,
    usuario_id INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    CONSTRAINT fk_projeto_usuario_id
        FOREIGN KEY (usuario_id)
        REFERENCES usuario (id)
);
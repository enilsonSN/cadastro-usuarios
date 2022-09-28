package com.enilsonProjeto.cadastrousuario.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor // gera o construtor com todos os arugmentos da classe
@NoArgsConstructor // gera o construtor vazio
@Data // gera os getters and setters
@Entity
@Table(name="TB_USUARIO")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 70)
    private String nome;
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
    @Column(nullable = false)
    private LocalDateTime dataDeNascimento;

}

package com.br.pratique.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "modalidade_esportiva")
public class ModalidadeEsportiva
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String urlIm;

    @OneToMany
    @JoinColumn(name = "evento_id")
    @Lazy
    private List<Evento> eventos;

}

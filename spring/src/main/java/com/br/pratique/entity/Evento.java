package com.br.pratique.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "evento")
public class Evento  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(columnDefinition="text")
    private String description;

    @CreatedBy
    @ManyToOne
    @JoinColumn(name="organizer_id", nullable=false)
    private User organizer;
    @ManyToOne
    @JoinColumn(name="modalidade_esportiva_id", nullable=false)
    private ModalidadeEsportiva modalidadeEsportiva;
    private BigDecimal price;


    @CreatedDate
    private LocalDateTime createdAt;
    @Column(columnDefinition="text")
    private String urlLocation;

    private String localName;
    private LocalDateTime dateTimeEvento;
}

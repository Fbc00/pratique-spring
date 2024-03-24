package com.br.pratique.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        @Column(columnDefinition = "boolean default false")
        private Boolean isActive;
        @OneToOne(mappedBy = "user",  cascade = CascadeType.ALL)
        @PrimaryKeyJoinColumn
        private ProfileUser profile;


        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "evento_id")
        @Lazy
        private List<Evento> eventos;
}

package com.br.pratique.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table(name = "profile_user")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProfileUser {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false)
        Long id;
        String phone;

        @OneToOne
        @MapsId
        @JoinColumn(name = "user_id")
        User user;
}

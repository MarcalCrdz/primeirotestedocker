package com.devops.todoapi;

import jakarta.persistence.*;

    @Entity
    @Table(name = "todos")
    public class Todo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String titulo;
        private boolean concluido;

        // os getters e os setters

        public long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }
        public boolean isConlcuido() { return concluido; }
        public void setConcluido(boolean concluido) { this.concluido = concluido;}

    }


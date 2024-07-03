package br.com.alura.screensound.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToAny
    private Artista artista;

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String toString() {
        return

        "Música='" + titulo + '\'' +
                ", artista=" + artista;
    }
}

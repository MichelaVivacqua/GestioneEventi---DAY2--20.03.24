package MichelaVivacqua.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="nome")
    private String nome;

    @Column (name="citta")
    private String citta;
    @OneToMany (mappedBy = "location")
    private List<Evento> eventi;

    public Location (){}

    public Location (String nome, String citta)
    {
        this.nome=nome;
        this.citta=citta;

    };}
package MichelaVivacqua.entities;

import jakarta.persistence.*;


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


    public Location (){}

    public Location (String nome, String citta)
    {
        this.nome=nome;
        this.citta=citta;

    };}
package MichelaVivacqua.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="persone")
public class Persona {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="nome")
    private String nome;

    @Column (name="cognome")
    private String cognome;
    @Column (name="email")
    private String email;
    @Column (name="dataDiNascita")
    private LocalDate dataDiNascita;

    @Column (name="sesso")
    private char sesso;

    @Column (name="listaPartecipazioni")
    private String listaPartecipazioni;

    public Persona (){}

    public Persona (String nome, String cognome, String email, LocalDate dataDiNascita, char sesso, String listaPartecipazioni)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.dataDiNascita=dataDiNascita;
        this.sesso=sesso;
        this.listaPartecipazioni=listaPartecipazioni;
    };}
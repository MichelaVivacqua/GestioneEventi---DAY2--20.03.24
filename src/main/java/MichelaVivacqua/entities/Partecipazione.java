package MichelaVivacqua.entities;

import jakarta.persistence.*;

@Entity
@Table(name="partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="persona")
    private String persona;

    @Column (name="evento")
    private String evento;
    @Column (name="stato")
    private Stato stato;


    public Partecipazione (){}

    public Partecipazione (String persona, String evento,Stato stato)
    {
        this.persona=persona;
        this.evento=evento;
        this.stato=stato;

    };}
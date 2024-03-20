package MichelaVivacqua.entities;

import jakarta.persistence.*;

@Entity
@Table (name="eventi")
public class Evento {
@Id
    @GeneratedValue
    private int id;

@Column (name="titolo")
    private String titolo;

    @Column (name="dataEvento")
    private String dataEvento;
    @Column (name="descrizione")
    private String descrizone;
    @Column (name="tipo")
    @Enumerated (EnumType.STRING)
    private TipoEvento tipoEvento;

    @Column (name="numeroMassimoPartecipanti")
    private int numeroMassimoPartecipanti;

    public Evento (){}

    public Evento (String titolo, String dataEvento, String descrizone, TipoEvento tipoEvento, int numeroMassimoPartecipanti){
        this.titolo=titolo;
        this.dataEvento=dataEvento;
        this.descrizone=descrizone;
        this.tipoEvento=tipoEvento;
        this.numeroMassimoPartecipanti=numeroMassimoPartecipanti;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizone() {
        return descrizone;
    }

    public void setDescrizone(String descrizone) {
        this.descrizone = descrizone;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento='" + dataEvento + '\'' +
                ", descrizone='" + descrizone + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}


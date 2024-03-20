package MichelaVivacqua.dao;

import MichelaVivacqua.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager em;
    public EventoDAO (EntityManager em){this.em=em;}
//    salvare una entity
    public void save (Evento evento) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(evento);
        transaction.commit();
        System.out.println("Evento " + evento.getTitolo() + " aggiunto correttamente al database");
    }
//        caricare una entity tramite primary key
        public Evento findById (int EventoId) {
            Evento evento = em.find(Evento.class, EventoId);
return evento;}

    public void findByIdAndDelete (int EventoId){
        Evento found = this.findById(EventoId);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(found);
        transaction.commit();
        System.out.println("Evento con id"+found.getId()+"eliminato!");
    }
}




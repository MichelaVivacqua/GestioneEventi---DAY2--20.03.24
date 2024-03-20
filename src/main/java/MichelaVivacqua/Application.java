package MichelaVivacqua;

import MichelaVivacqua.Exceptions.NotFoundException;
import MichelaVivacqua.dao.EventoDAO;
import MichelaVivacqua.entities.Evento;
import MichelaVivacqua.entities.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.annotations.NotFound;

public class Application {
private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);
        Evento cena = new Evento("cena", "22.01.2023", "cena di fine anno", TipoEvento.PUBBLICO,12);
        Evento viaggio = new Evento("Parigi", "22.02.2023", "gita di fine anno", TipoEvento.PUBBLICO,10);
        Evento gitona = new Evento("gita a Lipari", "22.03.2023", "viaggio di fine anno", TipoEvento.PUBBLICO,200);

        ed.save(cena);
        ed.save(viaggio);
        ed.save(gitona);

        try {
            // Recupero dell'evento per ID
            Evento retrievedEvento = ed.findById(cena.getId());
            System.out.println("Evento recuperato: " + retrievedEvento);
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            // Eliminazione dell'evento
            ed.findByIdAndDelete(cena.getId());
            System.out.println("Evento eliminato con successo");
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        em.close();
        emf.close();
}}

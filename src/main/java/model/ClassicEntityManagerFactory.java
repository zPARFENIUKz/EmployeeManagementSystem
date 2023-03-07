package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassicEntityManagerFactory {
    private static EntityManagerFactory emf = null;
    private static final String PERSISTENCE_UNIT_NAME = "default";
    public static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            synchronized (ClassicEntityManagerFactory.class) {
                if (emf == null) {
                    emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
                }
            }
        }
        return emf;
    }
}

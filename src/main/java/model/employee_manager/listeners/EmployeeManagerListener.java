package model.employee_manager.listeners;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
public class EmployeeManagerListener {
    @PrePersist
    void prePersist(Object object) {
        log.info(String.format("Trying to persist %s", object));
    }

    @PreUpdate
    void preUpdate(Object object) {
        log.info(String.format("Trying to update %s", object));
    }

    @PreRemove
    void preRemove(Object object) {
    }

    @PostLoad
    void postLoad(Object object) {
    }

    @PostRemove
    void postRemove(Object object) {
    }

    @PostUpdate
    void postUpdate(Object object) {
        log.info(String.format("%s was updated", object));
    }

    @PostPersist
    void postPersist(Object object) {
        log.info(String.format("%s was persisted", object));
    }
}

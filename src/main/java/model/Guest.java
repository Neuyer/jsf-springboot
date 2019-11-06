package model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Guest {

    @Id @GeneratedValue
    private long id;
    private String name;
    private Float bill;
    private String cpf;
    private Room room;
}

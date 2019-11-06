package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Room {
    @Id @GeneratedValue
    private String roomNumber;
    private int vacancy;
    private List<Guest> guests;
}

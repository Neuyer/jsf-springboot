package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Room {
    @Id @GeneratedValue
    private String roomNumber;
    private int vacancy;
    @OneToMany(mappedBy = "room")
    private List<Guest> guests;
}

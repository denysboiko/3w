package www;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long id;
    private String name;
    private String role;
    private Double longitude;
    private Double latitude;

    public User(String name, String role, Double longitude, Double latitude) {
        this.name = name;
        this.role = role;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public User() {

    }

}

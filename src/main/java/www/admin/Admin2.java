package www.admin;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Admin2 {

    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long id;
    private String pcode;
    private String name;

}

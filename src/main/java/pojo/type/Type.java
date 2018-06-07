package pojo.type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Type implements java.io.Serializable {

    //    ACOUSTIC("acoustic"),ELECTRIC("electric"),UNSPECIFIED("unspecified");
    private Integer id;
    private String value;

    public Type() {
    }

    private Type(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

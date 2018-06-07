package pojo.wood;

import javax.persistence.*;

@Entity
public class Wood implements java.io.Serializable {

    //	CAMPHOR("camphor"),//樟木
//	BRICH("birch"),//桦木
//	KOREANPINE("koreanpine");//红松
    private Integer id;
    private String value;

    public Wood() {
    }

    private Wood(String value) {
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

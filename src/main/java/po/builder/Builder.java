package po.builder;

import javax.persistence.*;

@Entity
public class Builder implements java.io.Serializable {

    //	JIANGSU("jiangsu"),SHANGHAI("shanghai"),SHANDONG("shandong");
    private Integer id;

    private String value;

    public Builder() {
    }

    public Builder(Integer id) {
        this.id = id;
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

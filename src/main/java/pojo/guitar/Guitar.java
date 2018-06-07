package pojo.guitar;

import pojo.builder.Builder;
import pojo.type.Type;
import pojo.wood.Wood;

import javax.persistence.*;

@Entity
public class Guitar implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 325952505698299172L;

    private String id;

    private Double price;

    private GuitarSpec spec;

    public Guitar() {

    }

    public Guitar(Double price, Builder builder, String model, Type type, Wood backWood,
        Wood topWood, Integer numStrings) {
        this.price = price;
        this.spec = new GuitarSpec(builder, model, type, backWood, topWood, numStrings);
    }

    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "builder",referencedColumnName = "id")
    public Builder getBuilder() {
        return spec.getBuilder();
    }

    public void setBuilder(Builder builder) {
        spec.setBuilder(builder);
    }

    public String getModel() {
        return spec.getModel();
    }

    public void setModel(String model) {
        spec.setModel(model);
    }

    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "type",referencedColumnName = "id")
    public Type getType() {
        return spec.getType();
    }

    public void setType(Type type) {
        spec.setType(type);
    }

    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "backWood",referencedColumnName = "id")
    public Wood getBackWood() {
        return spec.getBackWood();
    }

    public void setBackWood(Wood backWood) {
        spec.setBackWood(backWood);
    }

    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "topWood",referencedColumnName = "id")
    public Wood getTopWood() {
        return spec.getTopWood();
    }

    public void setTopWood(Wood topWood) {
        spec.setTopWood(topWood);
    }

    public Integer getNumStrings() {
        return spec.getNumStrings();
    }

    public void setNumStrings(Integer numStrings) {
        spec.setNumStrings(numStrings);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Transient
    public GuitarSpec getSpec() {
        //return new GuitarSpec(builder,model,type,backWood,topWood,numStrings);
        return spec;
    }

    public void setSpec(GuitarSpec spec) {
        this.spec = spec;
    }
}

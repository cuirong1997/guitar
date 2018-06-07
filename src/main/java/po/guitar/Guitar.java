package po.guitar;

import po.builder.Builder;
import po.type.Type;
import po.wood.Wood;

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
        Wood topWood, Integer serialNumber) {
        this.price = price;
        this.spec = new GuitarSpec(builder, model, type, backWood, topWood, serialNumber);
    }

    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "builderId",referencedColumnName = "id")
    public Builder getBuilder() {
        return spec.getBuilder();
    }

    public void setBuilder(Integer builderId) {
        spec.setBuilder(new Builder(builderId));
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
    @JoinColumn(name = "typeId",referencedColumnName = "id")
    public Type getType() {
        return spec.getType();
    }

    public void setType(Integer typeId) {
        spec.setType(new Type(typeId));
    }

    public void setType(Type type) {
        spec.setType(type);
    }

    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "backWoodId",referencedColumnName = "id")
    public Wood getBackWood() {
        return spec.getBackWood();
    }

    public void setBackWood(Wood backWood) {
        spec.setBackWood(backWood);
    }

    public void setBackWood(Integer backWoodId) {
        spec.setBackWood(new Wood(backWoodId));
    }

    @ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "topWoodId",referencedColumnName = "id")
    public Wood getTopWood() {
        return spec.getTopWood();
    }

    public void setTopWood(Wood topWood) {
        spec.setTopWood(topWood);
    }

    public void setTopWood(Integer topWoodId) {
        spec.setTopWood(new Wood(topWoodId));
    }

    public Integer getSerialNumber() {
        return spec.getSerialNumber();
    }

    public void setSerialNumber(Integer numStrings) {
        spec.setSerialNumber(numStrings);
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

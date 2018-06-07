package po.guitar;


import po.builder.Builder;
import po.type.Type;
import po.wood.Wood;

public class GuitarSpec{
	
	private Builder builder;
	
	private String model;

	private Type type;
	
	private Wood backWood;
	
	private Wood topWood;
	
	private int serialNumber;


	public GuitarSpec() {
	}

	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int serialNumber) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.serialNumber = serialNumber;
	}


	public boolean matches(GuitarSpec otherSpec) {
	    if (otherSpec.builder!=null && builder != otherSpec.builder)
	      return false;
	    if(otherSpec.getModel()!=null && otherSpec.getModel().trim().length()>0 && !otherSpec.getModel().toLowerCase().equals(model!=null?model.toLowerCase():null))
	      return false;
	    if (otherSpec.type!=null && type != otherSpec.type)
	      return false;
	    if (otherSpec.serialNumber >0 && serialNumber != otherSpec.serialNumber)
	      return false;
	    if (otherSpec.backWood!=null&&backWood != otherSpec.backWood)
	      return false;
	    if (otherSpec.topWood!=null && topWood != otherSpec.topWood)
	      return false;
	    return true;
	  }


	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

}

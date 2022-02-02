package SendEmail.model;

public class ModelClass {
private int minvalue;
private int maxvalue;
private int values;
public int getMinvalue() {
	return minvalue;
}
public void setMinvalue(int minvalue) {
	this.minvalue = minvalue;
}
public int getMaxvalue() {
	return maxvalue;
}
public void setMaxvalue(int maxvalue) {
	this.maxvalue = maxvalue;
}
public int getValues() {
	return values;
}
public void setValues(int values) {
	this.values = values;
}
@Override
public String toString() {
	return "ModelClass [minvalue=" + minvalue + ", maxvalue=" + maxvalue + ", values=" + values + ", getMinvalue()="
			+ getMinvalue() + ", getMaxvalue()=" + getMaxvalue() + ", getValues()=" + getValues() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}

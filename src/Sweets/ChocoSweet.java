package Sweets;

import java.util.Objects;

public class ChocoSweet extends Sweet {

    private String type;
    private String manufacture;

    public ChocoSweet(nameOfSweets name, int weight, int calories, int sugarAmount, String type, String manufacture) {
        super(name, weight, calories, sugarAmount);
        this.type = type;
        this.manufacture = manufacture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() +
                "  вид = " + type +
                ",  производитель = " + manufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChocoSweet that = (ChocoSweet) o;
        return Objects.equals(type, that.type) && Objects.equals(manufacture, that.manufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, manufacture);
    }
}

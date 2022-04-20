package Sweets;

public class CandySweet extends Sweet{

    private String flavor;
    private String shape;

    public CandySweet(nameOfSweets name, int weight, int calories, int sugarAmount, String flavor, String shape) {
        super(name, weight, calories, sugarAmount);
        this.flavor = flavor;
        this.shape = shape;
    }

    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return super.toString() +
                "  вкус = " + flavor +
                ",  форма = " + shape;
    }
}

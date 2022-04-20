package Sweets;

import java.util.Objects;

public abstract class Sweet {
    private int weight;
    private int calories;
    private int sugarAmount;
    private nameOfSweets name;

    public Sweet(nameOfSweets name, int weight, int calories, int sugarAmount) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.sugarAmount = sugarAmount;
    }

    public nameOfSweets getName() {
        return name;
    }
    public void setName(nameOfSweets name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public int getSugarAmount() {
        return sugarAmount;
    }
    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return weight == sweet.weight && calories == sweet.calories && sugarAmount == sweet.sugarAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, calories, sugarAmount);
    }

    @Override
    public String toString() {
        return "конфета " +
                name +
                " :  вес = " + weight +
                ",  содержание сахара = " + sugarAmount +
                ",  калорий = " + calories;
    }
}


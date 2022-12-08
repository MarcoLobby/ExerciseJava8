package it.DevelHope.ExerciseJava8;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    private final String priceType;
    private final double priceInEuros;

    public SmartphonePrice(String pryceType, double priceInEuros){
        this.priceType = pryceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        return (SmartphonePrice) super.clone();
    }

    @Override
    public String toString() {
        return "Price Type: " + priceType + ", Price in Euro: " + priceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Objects.equals(priceType, that.priceType) && Objects.equals(priceInEuros, that.priceInEuros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}

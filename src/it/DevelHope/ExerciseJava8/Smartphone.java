package it.DevelHope.ExerciseJava8;

import java.util.Objects;

public class Smartphone implements Cloneable{

    private final String brandName;
    private final String modelName;
    private final int batterymAh;

    private SmartphonePrice producerPrice ;
    private SmartphonePrice retailPrice ;


    // METODO COSTRUTTORE
    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice){
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return  "Brand Name: " + brandName + "\nModel Name: " + modelName + "\nBattery mAh: " + batterymAh + "\nProducer Price: (" + producerPrice + ")" + "\nRetail Price: (" + retailPrice + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {

        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = producerPrice;
        clonedSmartphone.retailPrice = retailPrice;
        return clonedSmartphone;
    }

}

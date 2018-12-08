package pl.atm.dietapp.dietapp.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private Double amount;
    private Double kcal;
    private Double carbs;
    private Double fat;
    private Double protein;

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", kcal=" + kcal +
                ", carbs=" + carbs +
                ", fat=" + fat +
                ", protein=" + protein +
                '}';
    }
}

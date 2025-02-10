package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange1;

import java.util.List;

public record Zoo(
        List<Animal> population
) {
    public int calculateFoodRequirement(){
        int sum = 0;
        for (Animal animal : population) {
            sum += animal.species().foodRequirementPerDayInGrams();
        }
        return sum;
    }
}

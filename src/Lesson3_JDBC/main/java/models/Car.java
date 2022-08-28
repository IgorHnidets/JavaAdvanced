package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private int model_year;
    private int price;

}


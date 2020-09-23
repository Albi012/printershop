package com.codecool.printershop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Rating {

    @Id
    @GeneratedValue
    Long id;
    @ElementCollection
    Map<Long,Integer> ratings;

    public int calculateAvg(){
        double result = 0;
        for (Integer value : ratings.values()) {
            result += value;
        }
        return (int) (result / ratings.size());
    }

}

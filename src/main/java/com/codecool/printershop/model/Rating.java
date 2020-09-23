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
    Map<Long, Boolean> ratings;

    public int getLikes() {
        int likeCounter = 0;
        for (Boolean value : ratings.values()) {
            if (value) {
                likeCounter++;
            }
        }
        return likeCounter;
    }

    ;

}

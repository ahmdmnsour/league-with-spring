package com.example.League.App;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

public interface Player {
    String getName();
    void setName(String name);
    int getShirtNumber();
    void setShirtNumber(int shirtNumber);

}

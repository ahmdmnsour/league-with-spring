package com.example.League.App;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class Striker implements Player {
    private String name;
    private int shirtNumber;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getShirtNumber() {
        return shirtNumber;
    }

    @Override
    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }
}

package com.example.League.App;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Team {
    private String name;
    private Player striker;
    private Player defender;
    private Player goalkeeper;
}

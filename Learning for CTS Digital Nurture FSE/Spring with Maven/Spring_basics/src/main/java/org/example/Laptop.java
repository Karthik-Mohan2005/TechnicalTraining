package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Gadgets {
    public void use(){
        System.out.println("Studies...");
    }
}

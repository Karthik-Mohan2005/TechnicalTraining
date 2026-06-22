package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Gadgets {
    @Autowired
    private Brand brand;
    public void use(){
        System.out.println("Studies..."+brand);
    }
}

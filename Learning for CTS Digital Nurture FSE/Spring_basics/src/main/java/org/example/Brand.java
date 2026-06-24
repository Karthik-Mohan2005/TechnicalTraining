package org.example;

import org.springframework.stereotype.Component;

@Component
public class Brand {
    private String name;
   /* public Brand(String name) {
        this.name = name;
    }

*/
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                '}';
    }
}

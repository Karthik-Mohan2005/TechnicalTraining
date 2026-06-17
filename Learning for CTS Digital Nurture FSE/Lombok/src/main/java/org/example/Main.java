package org.example;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
@Slf4j
public class Main {
    public static void main(String[] args) {
        @Cleanup Scanner sc = new Scanner(System.in);
        Employee e = new Employee(101,"Karthi","CSE");
        Employee f = new Employee();
        f.setId(sc.nextInt());
        f.setName("Karthi");
        f.setDept("CSE");
        log.info("Program Started");
        log.debug("Debug Message");
        log.error("Error Message");
        System.out.println(f.getId());
        System.out.println(f.getName());
        System.out.println(f.getDept());
        System.out.println(e);
        System.out.println(e.equals(f));
    }
}
package org.example;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@Slf4j
public class Main {

    public static void main(String[] args) {
        System.out.println("helo");
        System.out.println("jelo");
        int id= 101;
        log.info("helo");
        log.debug("Id = {}",id);
        log.error("Jelo");
    }
}
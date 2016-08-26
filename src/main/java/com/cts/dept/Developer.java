package com.cts.dept;

import java.math.BigDecimal;

/**
 * Created by David on 8/25/2016.
 */
public class Developer extends AbstractEmployee {
    public Developer(){
    }

    public Developer(String name){
        setTitle("Developer");
        setName(name);
    }
    public BigDecimal getCost() {
        return new BigDecimal("1000");
    }
}

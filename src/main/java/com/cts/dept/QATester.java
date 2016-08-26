package com.cts.dept;

import java.math.BigDecimal;

/**
 * This is a QA Tester Employee.
 *
 * Created by David on 8/25/2016.
 */
public class QATester extends AbstractEmployee {
    public QATester(){
    };

    public QATester(String name){
        setTitle("QATester");
        setName(name);
    }

    /**
     * Gets the QA testers cost.
     * @return
     */
    public BigDecimal getCost() {
        return new BigDecimal("500");
    }
}

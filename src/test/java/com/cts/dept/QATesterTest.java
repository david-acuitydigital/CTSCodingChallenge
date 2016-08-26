package com.cts.dept;

import java.math.BigDecimal;

/**
 * Created by David on 8/25/2016.
 */
public class QATesterTest extends DeveloperTest {

    public void beforeClass(){
        this.expectedCost = new BigDecimal("500");
        this.expectedTitle = "QATester";
        this.expectedName = "QATesterA";
        this.employee = new QATester(expectedName);
        ((AbstractEmployee)this.employee).setManager(expectedManager);

    }
}

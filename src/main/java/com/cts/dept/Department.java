package com.cts.dept;

import java.math.BigDecimal;

/**
 * Created by David on 8/25/2016.
 */
public class Department implements IDepartment {
    private String name;
    private IManager manager;

    public Department setName(String name) {
        this.name = name;
        return this;
    }

    public Department setManager(IManager manager) {
        this.manager = manager;
        return this;
    }

    public String getName() {
        return name;
    }

    public IManager getManager() {
        return manager;
    }

    public BigDecimal getCost() {
        BigDecimal cost = BigDecimal.ZERO;
        if (manager != null) {
            cost = manager.getCost();
        }
        return cost;
    }
}

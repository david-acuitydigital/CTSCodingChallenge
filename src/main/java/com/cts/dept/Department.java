package com.cts.dept;

import java.math.BigDecimal;

/**
 * The concrete department class.
 *
 * Created by David on 8/25/2016.
 */
public class Department implements IDepartment {
    private String name;
    private IManager manager;

    /**
     * Sets the name of the department.
     * @param name
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the department manager.
     *
     * @param manager
     */
    public void setManager(IManager manager) {
        this.manager = manager;
    }

    /**
     * Gets the name of the department.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the department manager.
     *
     * @return
     */
    public IManager getManager() {
        return manager;
    }

    /**
     * Gets the cost of the department manager and his staff.
     *
     * @return
     */
    public BigDecimal getCost() {
        BigDecimal cost = BigDecimal.ZERO;
        if (manager != null) {
            cost = manager.getCost();
        }
        return cost;
    }
}

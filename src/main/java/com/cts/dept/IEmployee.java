package com.cts.dept;

import java.math.BigDecimal;

/**
 * Employee's interface.
 */
public interface IEmployee {

    /**
     * Gets the employees manager
     *
     * @return
     */
    IManager getManager();

    /**
     * Sets the employees manager
     *
     * @return
     */
    void setManager(IManager manager);

    /**
     * Clears the employees manager
     *
     * @return
     */
    void clearManager();

    /**
     * Gets the name of the employee.
     *
     * @return String name
     */
    String getName();

    /**
     * Gets the employee's title
     *
     * @return String title
     */
    String getTitle();

    /**
     * Gets the cost of the employee
     *
     * @return BigDecimal cost.
     */
    BigDecimal getCost();
}
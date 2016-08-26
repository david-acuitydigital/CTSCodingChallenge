package com.cts.dept;

import java.math.BigDecimal;

/**
 * An interface that describes a Department
 *
 * Created by David on 8/25/2016.
 */
public interface IDepartment {
    /**
     * Gets the department name
     *
     * @return String name
     */
    String getName();

    /**
     * Gets the departments manager.
     *
     * @return IManager department manager
     */
    IManager getManager();

    /**
     * Gets the cost of the department
     *
     * @return
     */
    BigDecimal getCost();

}

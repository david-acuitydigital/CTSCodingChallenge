package com.cts.dept;

import java.util.List;

/**
 * An interface that describes a Manager Employee.
 *
 * Created by David on 8/25/2016.
 */
public interface IManager extends IEmployee{
    /**
     * Adds an employee to this manager.
     * @param employee
     */
    void addEmployee(IEmployee employee);

    /**
     * Removes an employee from this manager.
     * @param employee
     */
    void removeEmployee(IEmployee employee);

    /**
     * Gets the list of employees
     *
     * @return
     */
    List<IEmployee> getEmployees();
}

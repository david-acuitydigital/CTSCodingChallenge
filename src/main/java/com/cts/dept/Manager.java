package com.cts.dept;

import java.math.BigDecimal;
import java.util.*;

/**
 * This the manager implementation.
 * <p>
 * Created by David on 8/25/2016.
 */
public class Manager extends AbstractEmployee implements IManager {
    public Set<IEmployee> employees = new HashSet<IEmployee>();

    public Manager() {
    }

    ;

    public Manager(String name, Collection<IEmployee> employees) {
        setTitle("Manager");
        setName(name);
        if (employees != null && employees.size() > 0) {
            this.employees.addAll(employees);
        }
    }

    /**
     * Calculates the cost of the manager and his team.
     *
     * @return BigDecimal cost of the team.
     */
    public BigDecimal getCost() {
        BigDecimal cost = new BigDecimal("300");
        for (IEmployee employee :
                employees) {
            cost = cost.add(employee.getCost());
        }
        return cost;
    }

    /**
     * Adds an employee to this manager
     *
     * @param employee
     */

    public void addEmployee(IEmployee employee) {
        if(employee != null) {
            if(employee.getManager() != null){
                employee.getManager().removeEmployee(employee);
            }

            employees.add(employee);

            // You need to check if the manager is already set to this manager,
            // otherwise you get into an infinite loop situation.
            if(this != employee.getManager()) {
                employee.setManager(this);
            }

        }
    }

    /**
     * Removes an employee
     *
     * @param employee
     */
    public void removeEmployee(IEmployee employee) {
        if(employee != null) {
            employees.remove(employee);
            employee.clearManager();
        }
    }

    /**
     * Returns a list of employees
     *
     * @return
     */
    public List<IEmployee> getEmployees() {
        return new ArrayList<IEmployee>(employees);
    }
}

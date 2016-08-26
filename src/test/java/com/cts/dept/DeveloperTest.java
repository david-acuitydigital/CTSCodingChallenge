package com.cts.dept;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by David on 8/25/2016.
 */
public class DeveloperTest {
    protected BigDecimal expectedCost;
    protected String expectedTitle;
    protected String expectedName;
    protected IEmployee employee;
    protected IManager expectedManager = new Manager();

    @Before
    public void beforeClass() {
        this.expectedCost = new BigDecimal("1000");
        this.expectedTitle = "Developer";
        this.expectedName = "DeveloperA";
        this.employee = new Developer(expectedName);
        ((AbstractEmployee) this.employee).setManager(expectedManager);
    }

    @Test
    public void testTitle() {
        assertEquals(expectedTitle, employee.getTitle());
    }

    @Test
    public void testName() {
        assertEquals(expectedName, employee.getName());
    }

    @Test
    public void testGetCost() {
        assertEquals(expectedCost, employee.getCost());
    }

    @Test
    public void testGetManager() {
        assertEquals(expectedManager, employee.getManager());
    }

    @Test
    public void testGetManager_ChangeManager() {
        assertEquals(expectedManager, employee.getManager());

        IManager newManager = new Manager();
        employee.setManager(newManager);
        assertEquals("Expected employee to be removed from old manager", -1, expectedManager.getEmployees().indexOf(employee));
        assertEquals("Expected employee to be added to new manager", 0, newManager.getEmployees().indexOf(employee));
        assertEquals(newManager, employee.getManager());

    }

    @Test
    public void testGetManager_ChangeManagerToNull() {
        assertEquals(expectedManager, employee.getManager());

        employee.setManager(null);
        assertEquals("Expected employee to be removed from old manager", -1, expectedManager.getEmployees().indexOf(employee));
        assertNull(employee.getManager());

    }
}

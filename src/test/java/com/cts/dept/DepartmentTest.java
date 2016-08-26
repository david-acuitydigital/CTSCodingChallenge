package com.cts.dept;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by David on 8/25/2016.
 */
public class DepartmentTest {

    @Test
    public void test_GetName(){
        Department department = new Department();
        department.setName("Department");
        assertEquals("Department", department.getName());
    }

    @Test
    public void test_GetManager(){
        Department department = new Department();
        IManager manager = new Manager();
        department.setManager(manager);
        assertEquals(manager, department.getManager());
    }

    @Test
    public void test_getCost_WithDepartmentManager() {
        Department department = new Department();
        IManager manager = new Manager();
        manager.addEmployee(new QATester());
        manager.addEmployee(new Developer());
        IManager departmentManager = new Manager();
        departmentManager.addEmployee(manager);
        department.setManager(departmentManager);

        assertEquals(new BigDecimal("2100"), department.getCost());

    }

    @Test
    public void test_getCost_WithoutDepartmentManager() {
        Department department = new Department();
        assertEquals(BigDecimal.ZERO, department.getCost());

    }
}

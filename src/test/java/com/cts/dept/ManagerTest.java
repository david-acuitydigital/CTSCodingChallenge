package com.cts.dept;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by David on 8/25/2016.
 */
public class ManagerTest extends DeveloperTest {

    public void beforeClass() {
        this.expectedCost = new BigDecimal("300");
        this.expectedTitle = "Manager";
        this.expectedName = "ManagerA";
        this.employee = new Manager(expectedName, null);
        ((AbstractEmployee) this.employee).setManager(expectedManager);
    }

    @Test
    public void test_getCost_Given_QAAndDevOnly() {
        IManager manager = new Manager();
        manager.addEmployee(new QATester());
        manager.addEmployee(new Developer());

        assertEquals(new BigDecimal("1800"), manager.getCost());
    }

    @Test
    public void test_getCost_Given_ManagerWithQAAndDevOnly() {
        IManager manager = new Manager();
        manager.addEmployee(new QATester());
        manager.addEmployee(new Developer());
        IManager manager2 = new Manager();
        manager2.addEmployee(manager);

        assertEquals(new BigDecimal("2100"), manager2.getCost());
    }

    @Test
    public void test_getCost_Given_ManagerWithQAAndDevOnlyWithDuplicates() {
        IManager manager = new Manager();
        manager.addEmployee(new QATester());
        manager.addEmployee(new Developer());
        IManager manager2 = new Manager();
        manager2.addEmployee(manager);
        manager2.addEmployee(manager);
        manager2.addEmployee(manager);
        manager2.addEmployee(manager);

        assertEquals(new BigDecimal("2100"), manager2.getCost());
    }

    @Test
    public void test_removeEmployee() {
        IManager departmentManager = new Manager();
        IManager manager = new Manager();
        IEmployee developer = new Developer();
        IEmployee qaTester = new QATester();
        departmentManager.addEmployee(manager);
        departmentManager.addEmployee(developer);
        departmentManager.addEmployee(qaTester);
        assertEquals(3, departmentManager.getEmployees().size());
        departmentManager.removeEmployee(developer);
        assertEquals(2, departmentManager.getEmployees().size());
    }

    @Test
    public void test_constructor_non_null_employees() {
        IManager manager = null;
        IEmployee developer = new Developer();
        IEmployee qaTester = new QATester();
        Collection<IEmployee> employees = new ArrayList<IEmployee>();
        employees.add(developer);
        employees.add(qaTester);
        manager = new Manager("",employees);
        assertEquals(2, manager.getEmployees().size());
     }

    @Test
    public void test_addEmployee_ChangeManager(){
        IManager oldManager = new Manager();
        IManager newManager = new Manager();
        IEmployee employee = new Developer();
        oldManager.addEmployee(employee);
        assertEquals(oldManager, employee.getManager());
        assertEquals(0,oldManager.getEmployees().indexOf(employee));
        newManager.addEmployee(employee);
        assertEquals(newManager, employee.getManager());
        assertEquals(0,newManager.getEmployees().indexOf(employee));
        assertEquals(-1,oldManager.getEmployees().indexOf(employee));
    }

    @Test
    public void test_addEmployee_Null() {
        IManager manager = new Manager();
        manager.addEmployee(null);
        assertEquals(0,manager.getEmployees().size());
    }

    @Test
    public void test_removeEmployee_Null() {
        IManager manager = new Manager();
        manager.removeEmployee(null);
        assertEquals(0,manager.getEmployees().size());
    }
}
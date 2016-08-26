package com.cts.dept;

/**
 * The base employee class.
 *
 * Created by David on 8/25/2016.
 */
public abstract class AbstractEmployee implements IEmployee {
    private IManager manager;
    private String name;
    private String title;

    /**
     * It sets the manager, ensuring that this employee only exists in manager's heirarchy.
     * @param manager
     */
    public void setManager(IManager manager) {
        if (this.manager != null) {
            this.manager.removeEmployee(this);
        }
        if (manager != null && !manager.equals(this.manager) && manager.getEmployees().indexOf(this) < 0) {
            manager.addEmployee(this);
        }
        this.manager = manager;

    }

    /**
     * Clears the employees manager
     */
    public void clearManager(){
        this.manager = null;
    }

    /**
     * Sets the employee's name.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the employee's title.
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the employees manager.
     *
     * @return
     */
    public IManager getManager() {
        return manager;
    }

    /**
     * Gets the employees name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the employee's title.
     * @return
     */
    public String getTitle() {
        return title;
    }

}

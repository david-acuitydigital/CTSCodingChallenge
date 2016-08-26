package com.cts.dept;

/**
 * Created by David on 8/25/2016.
 */
public abstract class AbstractEmployee implements IEmployee {
    private IManager manager;
    private String name;
    private String title;

    public void setManager(IManager manager) {
        if (this.manager != null) {
            this.manager.removeEmployee(this);
        }
        this.manager = manager;
        if (this.manager != null) {
            this.manager.addEmployee(this);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IManager getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

}

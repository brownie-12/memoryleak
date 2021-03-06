package com.emc.memoryleaks.beans;

/**
 * Created by freemb2 on 8/29/16.
 */
public abstract class BaseBean {

    private String id;
    private String name;
    private String description;
    private String details;

    public BaseBean(String id, String name, String description, String details) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}

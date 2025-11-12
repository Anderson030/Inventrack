package com.inventory.Inventrack.domain.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String role;
    private boolean active;

    public UserDTO() {}

    public UserDTO(Long id, String name, String role, boolean active) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.active = active;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}



package com.msb.entity;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 17:54
 */
public class District {
    private Integer id;
    private String name;
    
    public District(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public District() {
    
    }
    
    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

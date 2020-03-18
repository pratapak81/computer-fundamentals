package com.nsc.tdd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonPropertyOrder({"Id", "name"})
public class User {
    private String Id;
    private String name;

    public User(String id, String name) {
        Id = id;
        this.name = name;
    }

    // why on getter? https://github.com/FasterXML/jackson-databind/issues/729
    @JsonProperty("Id")
    public String getId() {
        return Id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "\"Id\":\"" + Id + "\"" +
                ",\"name\":\"" + name + "\"" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id.equals(user.Id) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }
}

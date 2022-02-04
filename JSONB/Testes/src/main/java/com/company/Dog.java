package com.company;

import lombok.Data;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.config.PropertyOrderStrategy;


@JsonbPropertyOrder(PropertyOrderStrategy.ANY)
@Data
public class Dog {
    @JsonbCreator//Para não precisar ter um construtor vazio, precisa do JsonProperty abaixo
    public Dog(@JsonbProperty("name") String name, @JsonbProperty("age") int age, @JsonbProperty("bitable") boolean bitable) {
        this.name = name;
        this.age = age;
        this.bitable = bitable;
    }

    @JsonbProperty(value = "name_animal", nillable = true)//Altera o nome desse atributo
    //@JsonbProperty(nillable=true)//Caso esse atributo seja null, vai serializalo como null, se não tivesse essa anotação, não serializaria esse atributo.


    public String name;
    //@JsonbTransient//Ignora esse atributo e não o serializa
    public int age;
    public boolean bitable;

}

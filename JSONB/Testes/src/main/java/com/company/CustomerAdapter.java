package com.company;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;

public class CustomerAdapter implements JsonbAdapter<Customer, JsonObject> {
    @Override
    public JsonObject adaptToJson(Customer c) throws Exception {
        return Json.createObjectBuilder()
                .add("id", c.getId())
                .add("name", c.getName())
                .build();
    }

    @Override
    public Customer adaptFromJson(JsonObject adapted) throws Exception {
        Customer c = new Customer();
        c.setId(adapted.getInt("id"));
        c.setName(adapted.getString("name"));
        return c;
    }
}

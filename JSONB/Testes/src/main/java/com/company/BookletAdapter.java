package com.company;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;

public class BookletAdapter implements JsonbAdapter<Booklet, JsonObject> {

    @Override
    public JsonObject adaptToJson(Booklet booklet) {
        return Json.createObjectBuilder()
                .add("title", booklet.getTitle())
                .add("firstName", booklet.getAuthor().getFirstName())
                .add("lastName", booklet.getAuthor().getLastName())
                .build();
    }

    @Override
    public Booklet adaptFromJson(JsonObject json) {
        return new Booklet(
                json.getString("title"),
                new Author(json.getString("firstName"),
                        json.getString("lastName")));
    }
}

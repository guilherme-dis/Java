package com.company;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class Main {
    public static void main(String[] args) {
//// Create a dog instance
        Dog falco = new Dog("Falco", 4, false);
//
// Create Jsonb and serialize
        Jsonb jsonb = JsonbBuilder.create();
        System.out.println(jsonb.toJson(falco));
// Deserialize back
        falco = jsonb.fromJson("{\"name\":\"Falco\",\"age\":4,\"bitable\":false}", Dog.class);
        System.out.println(falco);
//
////======================================================================================================================
//        //Collection
//        Dog cassidy = new Dog("Cassidy", 5, true);
//        Dog snoop = new Dog("Snoop", 3, false);
//
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(snoop);
//        dogs.add(cassidy);
//        String result = jsonb.toJson(dogs);
//
//// Deserialize back
//        //List<Dog> dogs2 = jsonb.fromJson(result, List.getClass());
//        dogs = jsonb.fromJson(result, new ArrayList<Dog>(){}.getClass().getGenericSuperclass());
////=====================================================================================================================-=
////Mapping Customized.
//
//        Dog pojo = new Dog();
//
//        // Create custom configuration
//        JsonbConfig nillableConfig = new JsonbConfig().withNullValues(true);
//
//        // Create Jsonb with custom configuration
//        Jsonb jsonb2 = JsonbBuilder.create(nillableConfig);
//
//        // Use it!
//        String result2 = jsonb2.toJson(pojo);
//        System.out.println(result2);
//=====================================================================================================================-=
//Customized mapping
//        // Create custom configuration
//        JsonbConfig config = new JsonbConfig();
//
//        // Create Jsonb with custom configuration
//        Jsonb jsonb3 = JsonbBuilder.create(config);

//        // Create custom configuration with formatted output
//        JsonbConfig config = new JsonbConfig().withFormatting(true);
////        JsonbConfig config = new JsonbConfig().withPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE );
////        JsonbConfig config = new JsonbConfig().withPropertyOrderStrategy(PropertyOrderStrategy.REVERSE);
////        JsonbConfig nillableConfig = new JsonbConfig().withNullValues(true);
//
//        // Create Jsonb with custom configuration
//        Jsonb jsonb = JsonbBuilder.create(config);
////
////        // Use it!
////        System.out.println(jsonb3.toJson(falco));;
////        System.out.println(jsonb3.fromJson(jsonb3.toJson(falco),Dog.class));
//
//
//       System.out.println(jsonb.toJson(falco));
//        System.out.println(jsonb.fromJson(jsonb.toJson(falco),Dog.class));
//        JsonbConfig config=new JsonbConfig().withAdapters(new CustomerAdapter()).withFormatting(true);
//        Jsonb jsonb = JsonbBuilder.create(config);
//        Customer c = new Customer();
//        c.setId(1);
//        c.setName("json bourne");
//        c.setOrganization("bit");
//        c.setPosition("Super Agent");
//
//        System.out.println( jsonb.toJson(c));

// Create a list of carrier objects


    }

}


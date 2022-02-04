package com.company.coding_with_john;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MultitheadThing multitheadThing = new MultitheadThing(1);
        MultitheadThing multitheadThing2 = new MultitheadThing(2);
        MultitheadThing multitheadThing3 = new MultitheadThing(3);

        multitheadThing.start();
        multitheadThing2.start();
        multitheadThing3.start();


//        System.out.println(multitheadThing.isAlive());;
//        multitheadThing.stop();
//        multitheadThing.join();
//
//        multitheadThing2.isAlive();
//        Mesmo parando o programa principal, as theads continuam rodando.
//        throw new RuntimeException();


    }
}

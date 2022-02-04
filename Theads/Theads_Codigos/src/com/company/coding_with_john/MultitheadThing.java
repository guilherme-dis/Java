package com.company.coding_with_john;

import java.util.stream.IntStream;

public class MultitheadThing extends Thread{
    private int theadNumber;
    public MultitheadThing(int theadNumber){
        this.theadNumber=theadNumber;
    }

    @Override
    public void run(){
        IntStream.rangeClosed(1, 5).forEach(i -> {

            System.out.println(theadNumber+"  -  "+i);
            System.out.println();

            /*caudando uma exeção em uma tread para provar que se uma cair, as outras ficam intactas.
            if(theadNumber==3){
                throw new RuntimeException();
            }*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
        });
    }
}

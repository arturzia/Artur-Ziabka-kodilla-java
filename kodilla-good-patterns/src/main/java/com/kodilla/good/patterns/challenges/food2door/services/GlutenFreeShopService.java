package com.kodilla.good.patterns.challenges.food2door.services;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public class GlutenFreeShopService implements OrderService {

    public boolean process(Producer producer, String food, int quantity){

        System.out.println("Producer name: "+producer.getName()+" Product: "+food+" --> ORDER ACCEPTED");
        return true;
    }
}

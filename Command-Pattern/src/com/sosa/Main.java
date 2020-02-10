package com.sosa;

import com.sosa.infrasctructure.Broker;
import com.sosa.infrasctructure.BuyStock;
import com.sosa.infrasctructure.SellStock;
import com.sosa.infrasctructure.Stock;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}

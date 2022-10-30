package handlers;

import common.Type;

import java.util.Map;


public class PurchaseValidator {

    protected boolean validate(int id, double price, Type type, Map<Type, Double> limit) {
        if (price > 0) {
            if (price <= limit.get(type)) {
                System.out.println(this.getClass().getSimpleName() + " approved purchase with id " + id + " that costs " + price + ".");
                return true;
            } else {
                System.out.println("Purchase with id " + id + " needs approval from higher position than " + this.getClass().getSimpleName() + ".");
                return false;
            }
        } else {
            System.out.println("Cost must be a positive number.");
            return false;
        }
    }


}

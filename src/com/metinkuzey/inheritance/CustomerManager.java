package com.metinkuzey.inheritance;

public class CustomerManager {
    public void customerAdd(Customer customer){
        System.out.println("Id: " + customer.getId() +
                            " - Customer Number: " + customer.getCustomerNumber()
                             + " added to DB." );
    }

    public void customerAddMultiple(Customer[] customers){
        for (Customer customer:customers
             ) {
            System.out.println("Id: " + customer.getId() +
                    " - Customer Number: " + customer.getCustomerNumber()
                    + " added to DB." );
        }
    }

    public void customerUpdate(Customer customer){
        System.out.println("Id: " + customer.getId() +
                " - Customer Number: " + customer.getCustomerNumber()
                + " updated in DB." );
    }
    public void customerDelete(Customer customer){
        System.out.println("Id: " + customer.getId() +
                " - Customer Number: " + customer.getCustomerNumber()
                + " deleted from DB." );
    }
}

package com.metinkuzey.inheritance;

public class Main {
    public static void main(String[] args) {

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("202100000001");
        individualCustomer.setFirstName("Metin");
        individualCustomer.setLastName("Kuzey");
        individualCustomer.setNationalIdentity("12345678900");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("202100000002");
        corporateCustomer.setCompanyName("Metin Kuzey Corporate Company");
        corporateCustomer.setTaxNumber("1234567890");

        UnionCustomer unionCustomer = new UnionCustomer();
        unionCustomer.setId(3);
        unionCustomer.setCustomerNumber("202100000003");
        unionCustomer.setUnionType("Engineering");

        CustomerManager customerManager = new CustomerManager();
        customerManager.customerAdd(individualCustomer);
        customerManager.customerAdd(corporateCustomer);
        customerManager.customerAdd(unionCustomer);
        System.out.println("------------------------------------");
        System.out.println("Adding multiple customer");
        Customer[] customers = {individualCustomer,
                                corporateCustomer,
                                unionCustomer};
        customerManager.customerAddMultiple(customers);
    }
}

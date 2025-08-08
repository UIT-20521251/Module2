package com.example.demo3.BT10.CustomerList;

import java.util.ArrayList;
import java.util.List;

public class ListCustomer {
    private static List<Customer> customers= new ArrayList<>();

    static {
        customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "spooky_movie.png"));
        customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "spooky_movie.png"));
        customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "spooky_movie.png"));
        customers.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "spooky_movie.png"));
        customers.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "spooky_movie.png"));
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public List<Customer> getCustomers() {
        return customers;
    }

}

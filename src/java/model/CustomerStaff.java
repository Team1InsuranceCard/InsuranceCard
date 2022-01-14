/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author area1
 */
public class CustomerStaff {
    private Customer customer;
    private Staff staff;
    private Date startDate;
    private Date endDate;
    private Staff next;

    public CustomerStaff() {
    }

    public CustomerStaff(Customer customer, Staff staff, Date startDate, Date endDate, Staff next) {
        this.customer = customer;
        this.staff = staff;
        this.startDate = startDate;
        this.endDate = endDate;
        this.next = next;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Staff getNext() {
        return next;
    }

    public void setNext(Staff next) {
        this.next = next;
    }
    
    
}

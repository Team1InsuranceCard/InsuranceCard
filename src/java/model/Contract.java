/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author area1
 */
public class Contract {

    private int id;
    private Product product;
    private Customer customer;
    private Staff staff;
    private Timestamp startDate;
    private Timestamp endDate;
    private boolean isDelete;
    private double contractFee;
    private String cancelComment;
    private String cancelReason;
    private Timestamp cancelDate;
    private Timestamp cancelRequestDate;
    private String vehicleType;
    private String engine;
    private String licensePlate;
    private String color;
    private String certImage; //Chua ro la nen dung Blob hay ImageBase64
    private String brand;
    private String owner;
    private String chassis;
    private Timestamp requestDate;
    private Timestamp resolveDate;
    private short status;
    private Staff startStaff;
    private Staff cancelStaff;

    public Contract() {
    }

    public Contract(int id, Product product, Customer customer, Staff staff, Timestamp startDate, Timestamp endDate, boolean isDelete, double contractFee, String cancelComment, String cancelReason, Timestamp cancelDate, Timestamp cancelRequestDate, String vehicleType, String engine, String licensePlate, String color, String certImage, String brand, String owner, String chassis, Timestamp requestDate, Timestamp resolveDate, short status, Staff startStaff, Staff cancelStaff) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.staff = staff;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isDelete = isDelete;
        this.contractFee = contractFee;
        this.cancelComment = cancelComment;
        this.cancelReason = cancelReason;
        this.cancelDate = cancelDate;
        this.cancelRequestDate = cancelRequestDate;
        this.vehicleType = vehicleType;
        this.engine = engine;
        this.licensePlate = licensePlate;
        this.color = color;
        this.certImage = certImage;
        this.brand = brand;
        this.owner = owner;
        this.chassis = chassis;
        this.requestDate = requestDate;
        this.resolveDate = resolveDate;
        this.status = status;
        this.startStaff = startStaff;
        this.cancelStaff = cancelStaff;
    }

    public Staff getStartStaff() {
        return startStaff;
    }

    public void setStartStaff(Staff startStaff) {
        this.startStaff = startStaff;
    }

    public Staff getCancelStaff() {
        return cancelStaff;
    }

    public void setCancelStaff(Staff cancelStaff) {
        this.cancelStaff = cancelStaff;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
 

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public double getContractFee() {
        return contractFee;
    }

    public void setContractFee(double contractFee) {
        this.contractFee = contractFee;
    }

    public String getCancelComment() {
        return cancelComment;
    }

    public void setCancelComment(String cancelComment) {
        this.cancelComment = cancelComment;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Timestamp getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Timestamp cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Timestamp getCancelRequestDate() {
        return cancelRequestDate;
    }

    public void setCancelRequestDate(Timestamp cancelRequestDate) {
        this.cancelRequestDate = cancelRequestDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCertImage() {
        return certImage;
    }

    public void setCertImage(String certImage) {
        this.certImage = certImage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public Timestamp getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Timestamp resolveDate) {
        this.resolveDate = resolveDate;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

}

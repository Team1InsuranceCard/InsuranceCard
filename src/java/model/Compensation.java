/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author area1
 */
public class Compensation {

    private int id;
    private Contract contract;
    private String driverName;
    private Timestamp createDate;
    private Timestamp resolveDate;
    private String resolveNote;
    private boolean decision;
    private String description;
    private String attachment; //chua ro kieu du lieu

    public Compensation() {
    }

    public Compensation(int id, Contract contract, String driverName, Timestamp createDate, Timestamp resolveDate, String resolveNote, boolean decision, String description, String attachment) {
        this.id = id;
        this.contract = contract;
        this.driverName = driverName;
        this.createDate = createDate;
        this.resolveDate = resolveDate;
        this.resolveNote = resolveNote;
        this.decision = decision;
        this.description = description;
        this.attachment = attachment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Timestamp resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getResolveNote() {
        return resolveNote;
    }

    public void setResolveNote(String resolveNote) {
        this.resolveNote = resolveNote;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

}

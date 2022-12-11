/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kcsar
 */
public class AuditingOrder extends orders{
    private String auditPath;

    public AuditingOrder(String auditPath, String role, String assignedTo, String Service, String OrderedBy, String RequestTo, String Status, java.util.Date Date, float Amount, String Details) {
        super(role, assignedTo, Service, OrderedBy, RequestTo, Status, Date, Amount, Details);
        this.auditPath = auditPath;
    }

    public String getAuditPath() {
        return auditPath;
    }

    public void setAuditPath(String auditPath) {
        this.auditPath = auditPath;
    }

    
}

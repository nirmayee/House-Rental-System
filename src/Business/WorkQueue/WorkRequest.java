/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Kiran
 */
public abstract class WorkRequest {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String avail;
    private Date date_req;
    private Date resolve_Date;
    private String quote;
    
    public WorkRequest() {
        date_req = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String status) {
        this.avail = status;
    }

    public Date getDate_req() {
        return date_req;
    }

    public void setDate_req(Date date_req) {
        this.date_req = date_req;
    }

    public Date getResolve_Date() {
        return resolve_Date;
    }

    public void setResolve_Date(Date resolve_Date) {
        this.resolve_Date = resolve_Date;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
    
    
    
}

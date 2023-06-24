package com.nkxgen.spring.jdbc.model;

import java.util.Date;
import java.time.LocalDateTime;

public class cashChest {

    private long totalamount;
    private long loaninterest;
    private Date timestamp;
    private long startedamount;
    
    public long getstartedamount() {
    	return startedamount;
    }
 
    public void setstartedamount(long startedamount ) {
    	this.startedamount=startedamount;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long gettotalamount() {
        return totalamount;
    }

    public void settotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public Long getloaninterest() {
        return loaninterest;
    }

    public void setloaninterest(Long loaninterest) {
        this.loaninterest = loaninterest;
    }

    public cashChest() {
        timestamp = new Date();
        
    }
}

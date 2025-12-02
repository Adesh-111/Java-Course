package model;

public class Transaction {
    private int customerId;
    private String transactionType;
    private int beforeBalance;

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public String getTransactionType() {
        return transactionType;
    }
    public int getBeforeBalance() {
        return beforeBalance;
    }
    public int getAfterBalance() {
        return AfterBalance;
    }
    private int AfterBalance;

}

package model;

public class Admin {
    private String accountNo;
    private String name;
    private String address;
    private String mobileNo;
    private String email;
    private String accType;
    private int initialBalance;
    private String dob;
    private String idProof;
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    private String password;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
    public int getInitialBalance() {
        return initialBalance;
    }
    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getIdProof() {
        return idProof;
    }
    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}

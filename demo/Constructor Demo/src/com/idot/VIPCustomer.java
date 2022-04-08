package com.idot;

public class VIPCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VIPCustomer(){
        this("default", 0, "null");
    }

    public VIPCustomer(String name, String emailAddress){
        this(name, 10000, "default@email.com");
    }

    public VIPCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

        if(emailAddress.contains(new CharSequence() {
            @Override
            public int length() {
                int length = emailAddress.length();
                if(length>50 || length<7){
                    return -1;
                }
                return 0;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {

                return null;
            }
        }));
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        if(creditLimit<0){
            return -1;
        }
        else {
            return creditLimit;
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

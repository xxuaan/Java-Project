package LecW2;

public class Person {
    // private is making them only accessible within the declared class
    private String name;
    private String address;
    private Account account;

    // this is called constructor, this is special
    // it called when we create a new object
    public Person(String name) {
        this.name = name;
    }

    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    //getter and setter - name
    //define define 1. modifier (ppp), 2. return type, 3. methodName
    public String getName(){
        return name; //this < me, myself, this object
    }

    public void setName(String name){
        this.name = name;

    }

    // getter and setter
    public String getAddress(){
        return address; //this < me, myself, this object
    }

    public void setAddress(String address){
        this.address = address;
    }

    // getter and setter
    public Account getAccount(){
        return account; //this < me, myself, this object
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void printAccountDetail(){
        System.out.println("Your account number is " + this.account.getAccountNumber());
        System.out.println("Your account number is saving? " + this.account.isSaving);
        System.out.println("Your account number is current?" + this.account.isCurrent);
    }

}

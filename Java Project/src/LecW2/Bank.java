package LecW2;

public class Bank {

    /*
    no variables required at the moment
    WHY?
    Because bank object should be a central place to "play" around
    Person object and Account object
    */

    public static void main(String [] args) {
        System.out.println("Welcome to Bank CSC1009");
        //lecture 2 - create an object from person
        Person xuan = new Person("Xuan");

        xuan.setAddress("SG");
//        xuan.setAccount();

        // chain method
        System.out.println("Your name is: " + xuan.getName());
        System.out.println("Your address is: " + xuan.getAddress());

//        xuan.setName("Xuan");

        // use .setName in occurence like user change name:
        xuan.setName("Xuan the second");
        System.out.println("Your (re)name is: " + xuan.getName());

//        Person paul = new Person("Paul","AMK");
//        System.out.println("Your name is: " + paul.getName());
//        System.out.println("Your address is: " + paul.getAddress());

        Account acc001 = new Account("283-342423-23423",true,false);
        xuan.setAccount(acc001);
        xuan.printAccountDetail();
//        System.out.println("Your account number is: " + acc001.getAccountNumber());


        VIPPerson mary = new VIPPerson("mary", "us", "m-class");
        System.out.println("Your name is: " + mary.getName());
        System.out.println("Your address is: " + mary.getAddress());
        System.out.println("Your grade is: " + mary.getGrade());


        Staff boss = new Staff("BBIg BOSS", 3,"938473");
        boss.setAddress("i live in office");
        System.out.println("Your name is: " + boss.getName());
        System.out.println("Your rank is: " + boss.getRank());
        System.out.println("Your address is: " + boss.getAddress());
        System.out.println("Your staff number is: " + boss.getStaffNumber());

    }
}

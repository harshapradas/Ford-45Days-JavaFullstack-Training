public class CallCenter {
    public static void makeCallToCallCenter(Customer c) {
        pickUpCall();
        if(c.getMembership().equals("premium")){
            allotTime(15);
        }
        else if(c.getMembership().equals("golden")){
            allotTime(10);
        }
        else{
            allotTime(5);
        }
        hangCall();
    }

    public static void pickUpCall(){
        System.out.println("Started Serving customer");
    }
    public static void allotTime(int time){
        System.out.println("Alloted time "+time+" mins for customers");
    }
    public static void hangCall(){
        System.out.println("Service over to customer");
    }


}
public class Customer {
    private  static long id=1000;
    private String name;
    private String membership;
    private long phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }



    public Customer( String name, String membership, long phone) {
        this.id++;
        this.name = name;
        this.membership = membership;
        this.phone = phone;
    }

    public void printCustomerInfo() {
        System.out.println(id+" "+name+" "+membership+" "+phone);
    }
}
public class CustomerController {
    public static void main(String[] args) {
        Customer c1=new Customer("varun","golden",827364834);
        c1.printCustomerInfo();
        Customer c2=new Customer("arun","premium",273481928);
        c2.printCustomerInfo();

        CallCenter.makeCallToCallCenter(c2);

    }
}

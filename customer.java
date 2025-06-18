public class customer {
    String coustomer_Name;
    int customerId;
    int age;
    int customerNumber;
    int payment;
     void getCustomer(){
        //System.out.println(coustomer_Name+ "\n" + customerId + "\n"+ customerNumber+ "\n" +payment);
        System.out.println("coustomer_Name: " + coustomer_Name);
        System.out.println("age: " + age);
    } 
    public static void main(String[] args) {
        customer details = new customer();
        details.coustomer_Name = "Nithin";
        details.customerId = 786;
        details.customerNumber = 344473823;
        details.payment = 2343;
        details.age = 30;
        details.getCustomer();
    }
    
}

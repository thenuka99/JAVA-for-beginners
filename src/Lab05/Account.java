//----- Lab05 -----
// Q04
package Lab05;

public class Account {
    private String acc_no;
    private String name;
    private String email;
    private String id;
    private double amount;

    //Account Number
    public String getAccNo() {
        return acc_no;
    }

    public void setAccNo(String acc_no) {
        this.acc_no = acc_no;
    }

    //Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    //Amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class Bank {

    public static void main(String[] args) {
        Account a = new Account();
        a.setAccNo("39929911234");
        a.setName("Nimal Jayasinghe");
        a.setId("981232234V");
        a.setEmail("nimalj@gmail.com");
        a.setAmount(25000.0);

        if(!a.getAccNo().isBlank())
        {
            System.out.println("Account Number              : " + a.getAccNo());
        }else{
            System.out.println("Invalid Account Number!");
        }

        System.out.println("Name of the account holder  : " + a.getName());
        System.out.println("ID of the account holder    : " + a.getId());
        System.out.println("E-mail of the account holder: " + a.getEmail());
        System.out.println("Total amount deposited      : " + a.getAmount());

    }


}
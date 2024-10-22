package app.models;

public class Client extends Person{

    private int sum;
    private String bank;

    public Client(String name, String bank,  int sum) {
        super(name);
        this.sum = sum;
        this.bank = bank;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    @Override
    public String toString() {
        return "Client{" +
                "sum=" + sum +
                ", bank='" + bank + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

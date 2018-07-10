public abstract class ATM {
    private String name;
    private int []money = new int[3];
    private int []counter = new int[3];

    public ATM(String name, int[] money, int[] counter) {
        this.name = name;
        this.money = money;
        this.counter = counter;
    }
    abstract void Sort(int enter);
   abstract int withdrawMoney(int moneyOut);
}

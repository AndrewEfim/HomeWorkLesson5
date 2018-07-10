import java.util.Scanner;

public class AvalATM extends ATM implements iATM {
    int[] money = new int[3];
    int[] counter = new int[3];
    Scanner in = new Scanner(System.in);

    public AvalATM() {
        super("Aval", new int[3], new int[3]);
    }

    @Override
    public void Sort(int enter) {
        if (enter % 50 == 40) {
            counter[2] = 1;
            money[2] = 20 * counter[2];
            enter = enter - 20;
        }
        if (enter % 50 == 20) {
            counter[2] = counter[2] + 1;
            money[2] = 20 * counter[2];
            enter = enter - (enter % 50);
        }
        if (enter % 50 == 0) {
            counter[0] = enter / 100;
            money[0] = 100 * counter[0];
        }
        if (enter - (100 * (enter / 100)) == 50) {
            counter[1] = (enter - (100 * (enter / 100))) / 50;
            money[1] = 50 * counter[1];
        } else if (enter % 50 == 30 || enter % 50 == 30) {
            System.out.println("Принимаются только 100 50 20 и все кратные суммы");
        }
    }

    @Override
    public int withdrawMoney(int moneyOut) {
        int lastMoney = (money[0] + money[1] + money[2]) - moneyOut;
        return lastMoney;
    }

    @Override
    public void SumMoney() {
        System.out.println("Сумма денег в банкомате" + " " + (money[0] + money[1] + money[2]));
    }

    @Override
    public void StartMenu() {
        System.out.println("Выбирите операцию 1 положить деньги 2 снять деньги 3 посмотреть остаток 4 выход");
        do {
            if (in.nextInt( ) == 1) {
                System.out.println("В ведите сумму для ввода");
                Sort(in.nextInt( ));
            }
            if (in.nextInt( ) == 2) {
                System.out.println("В ведите сумму для снятия");
                Sort(withdrawMoney(in.nextInt( )));
            }
            if (in.nextInt( ) == 3) {
                SumMoney( );
            }
        } while (in.nextInt( ) != 4);
		
    }
}

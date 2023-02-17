package Assessment1;
import java.util.Scanner;
public class InvestmentCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 2022, invAmount, avrProfit, invDuration, profit, start;

        System.out.println("Input initial investment amount: ");
        invAmount = scan.nextInt();
        System.out.println("Input average profit %: ");
        avrProfit = scan.nextInt();
        System.out.println("Input investment duration(years): ");
        invDuration = scan.nextInt();

        System.out.println("Year\t Investment Amount\t\t Profit\n");
        for(int i = 0; i < invDuration; i++){
            start = invAmount;
            profit = invAmount * avrProfit / 100;
            System.out.println(year + "\t\t" + start + ".00\t\t\t" + profit + ".00");
            invAmount += profit;
            year++;
        }

    }
}

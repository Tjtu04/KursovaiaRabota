import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int count2= 0;
        ArrayList<Players> command1 = new ArrayList<>();
        String command_1 = "Bayern Munich";
        Players Ba1 = new Players("Muller", 92);
        command1.add(Ba1);
        Players Ba2 = new Players("Lewandowski", 94);
        command1.add(Ba2);
        Players Ba3 = new Players("Neuer", 91);
        command1.add(Ba3);
        Players Ba4 = new Players("Kimmich", 88);
        command1.add(Ba4);
        Players Ba5 = new Players("Goretzka", 87);
        command1.add(Ba5);
        ArrayList<Players> command2 = new ArrayList<>();
        String command_2 = "Real Madrid";
        Players Real1 = new Players("Benzema", 89);
        command2.add(Real1);
        Players Real2 = new Players("Modric", 87);
        command2.add(Real2);
        Players Real3 = new Players("Courtois", 89);
        command2.add(Real3);
        Players Real4 = new Players("Hazard", 85);
        command2.add(Real4);
        Players Real5 = new Players("Kroos", 88);
        command2.add(Real5);
        double allPower = 0;
        for (int i = 0; i < 5; i++) {
            double commands = command1.get(i).getPower();
            allPower += commands;
        }
        double allPower2 = 0;
        for (int i = 0; i < 5; i++) {
            double commands2 = command2.get(i).getPower();
            allPower2 += commands2;
        }
        if (allPower >= 50) {
            count += 1;
            if (allPower > 70) {
                count += 1;
                if (allPower > 90) {
                    count += 1;
                }
            }
        }
//                    --------------------------------------------------------------
//                    --------------------------------------------------------------
//                    --------------------------------------------------------------
        if (allPower2 >= 50){
            count2 += 1;
            if (allPower2 > 70){
                count2 += 1;
                if (allPower2 > 90){
                    count2 += 1;
                }
            }
        }
        while (true) {
            System.out.println("[1] Start game");
            System.out.println("[2] Watch first main team");
            System.out.println("[3] Watch second main team");
            System.out.println("[4] Show goals");
            System.out.println("[5] Show total team powers");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Game:");
                    if (allPower >= 50) {
                        count = 1;
                    }
                    if (allPower >= 70) {
                        count = 2;
                    }
                    if (allPower > 90) {
                        count = 3;
                    }
//              -------------------------------------------------------------------------
                    if (allPower2 >= 50) {
                        count2 = 1;
                    }
                    if (allPower2 >= 70) {
                        count2 = 2;
                    }
//              -------------------------------------------------------------------------
                    if (count == count2){
                        System.out.println("equals");
                    }else if (count > count2){
                        System.out.println(command_1 + " win");
                    }else {
                        System.out.println(command_2 + " win");
                    }
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    System.out.println(command_1 + " main team:");
                    System.out.println(command1);
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    System.out.println(command_2 + " main team:");
                    System.out.println(command2);
                    System.out.println("------------------------------------");
                    break;
                case 4:
                    System.out.println("Goals:");
                    if (allPower >= 50) {
                        count = 1;
                    }
                    if (allPower >= 70) {
                        count = 2;
                    }
                    if (allPower > 90) {
                        count = 3;
                    }
//              -------------------------------------------------------------------------
                    if (allPower2 >= 50) {
                        count2 = 1;
                    }
                    if (allPower2 >= 70) {
                        count2 = 2;
                    }
                    System.out.println(command_1 + " " + count + ":" + count2 + " " + command_2);
                    break;
                case 5:
                    System.out.println(command_1 + " total power is: " + allPower/5 + "\n" + command_2 + " total power is: " + allPower2/5);
                    System.out.println("------------------------------------");
                    break;
            }
        }
    }
}
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RobuxGen {

    public static void main(String[] args) {

        //Data location

        int amountRobux;
        String accountName;
        //boolean yes;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Enter desired ROBUX amount.");

        amountRobux = Integer.parseInt(scan.nextLine());

        if (amountRobux <1) {
            Sleep2();
            System.out.println("Can not give you "+ amountRobux +" ROBUX silly!");

        }
        else
            Sleep1();
        System.out.println("Enter Roblox Username");

        accountName = scan.nextLine();

        System.out.println("Please Wait...");

        ConsoleSleepTimer.consoletimer();


        System.out.print("Is this correct?"+" Press enter to proceed" + "\n" +"AMOUNT:\t" + "NAME:" +"\n" + amountRobux + "\t" + accountName);

        try{System.in.read();}
        catch(Exception e){}

        System.out.println("OK, PROCESSING");
        Sleep2();
        System.out.println("~SENDING DATA");
        Sleep2();
        System.out.println("~RECEIVING PACKETS");
        Sleep2();
        System.out.println("~INJECTING ROBUX...");
        Sleep2();

        StatusBar.StatusBar();

        if(accountName.equals("Roblox")) {

        System.out.println("FAILED, DON'T GIVE THE OWNERS ROBUX!");
        return;
        }

        System.out.println("DONE!");
        Sleep2();
        System.out.println("ENJOY YOUR ROBUX!");
        }

    private static void Sleep2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void Sleep1() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}




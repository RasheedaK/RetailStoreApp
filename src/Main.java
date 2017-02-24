import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Dependency dependency = new Dependency();
        OutputConsole outputConsole=new OutputConsole();
        RetailStoreApp retailStoreApp = dependency.initializeRetailStore();
        AppRunner appRunner = new AppRunner(retailStoreApp,outputConsole);
        Scanner sc = new Scanner(System.in);
        Menu menu=dependency.setMenu();
        int userOption=0;
        do {
            outputConsole.print(menu.showOptions());
            userOption = sc.nextInt();
            appRunner.run(userOption);
        }while (userOption!=6);
    }
}

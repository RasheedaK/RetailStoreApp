import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Dependency dependency = new Dependency();
        RetailStoreApp retailStoreApp = dependency.initializeRetailStore();
        AppRunner appRunner = new AppRunner(retailStoreApp);
        Scanner sc = new Scanner(System.in);
        Menu menu=dependency.setMenu();
        while (sc.hasNext()) {
            menu.showOptions();
            appRunner.run(sc.nextInt());
        }
    }
}

import java.util.ArrayList;
import java.util.List;

class Menu {
    List<String> options;

    Menu() {
        options=new ArrayList<>();
    }

    void addOption(String option) {
        options.add(option);
    }

    String showOptions() {
        String menuOptions="";
        for (String option:options) {
            menuOptions+=option;
        }
        return menuOptions;
    }
}

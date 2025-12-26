import java.util.*;

public class TitleMenu {
    public String menuOptions;
    public TitleMenu parent;
    public List<TitleMenu> children;

    //constructor
    public TitleMenu(String menuOptions, TitleMenu parent) {
        this.menuOptions = menuOptions;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    //linking children to Parents
    public void addChild(String menu){
        this.children.add(new TitleMenu(menu, null));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TitleMenu menuUI = new TitleMenu("Main Menu", null);
        menuUI.addChild("New Game");
        menuUI.addChild("Load Game");
        menuUI.addChild("Settings");
        menuUI.addChild("Quit");

        System.out.println("Select an option by pressing w(up0 or s(down) and enter to select!");
        //should we set it up to where index is actually +1 or -1 to keep track and keep reusing??
        char userInput = keyboard.next(). charAt(0);
        if (userInput == 'w') {
            System.out.printf("Current selected option: %s\n", menuUI.children.get(0).menuOptions);
        } else if (userInput == 's') { 
            System.out.printf("Current selected option: %s\n", menuUI.children.get(1).menuOptions);
        }
        keyboard.close();
    }
}

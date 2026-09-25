package bulletecho;
import java.util.ArrayList;
import java.util.List;
// ==========================================

public class HeroInventory {
    private List<Hero> heroesList;

    public HeroInventory() {
        heroesList = new ArrayList<>();
    }
public void addHero(Hero hero){
    heroesList.add(hero);
    System.out.println("Successfully added: " + hero.getHeroName());
}

public void showAllHeroes(){
    System.out.println("\n--- Roster of Heroes ---");
    if (heroesList.isEmpty()){
        System.out.println("The inventory is empty");
    } else {
        for (Hero h : heroesList){
            h.displayHeroInfo();
        }
    }
}
}

import bulletecho.Hero;
import bulletecho.AssaultHeroSkill;
import bulletecho.HeroInventory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INITIALIZING BULLET ECHO MANAGER ===");

        HeroInventory myInventory = new HeroInventory();

        Hero hero1 = new Hero("Stalker", "Assault", 1450);
        Hero hero2 = new Hero("Firefly", "Tank", 1320); 

        myInventory.addHero(hero1);
        myInventory.addHero(hero2);

        myInventory.showAllHeroes();

        System.out.println("\n-- Testing Hero Skills --");
        
        AssaultHeroSkill stalkerSkill = new AssaultHeroSkill("Tactical Cloak");
        stalkerSkill.useSpecialAbility();

    }
}
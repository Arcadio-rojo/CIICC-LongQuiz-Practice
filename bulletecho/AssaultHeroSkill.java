package bulletecho;

public class AssaultHeroSkill extends CharacterSkills {
    public AssaultHeroSkill(String skillName) {
        super("Tactical Cloak");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("⚡ Assault Skill Used: Stalker activates tactical cloak!");
    }
}
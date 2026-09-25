package bulletecho;

public abstract class CharacterSkills {
    protected String skillName;

    public CharacterSkills(String skillName){
    this.skillName = skillName;
    }

    public abstract void useSpecialAbility();

}


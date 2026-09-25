package bulletecho;

public class Hero {
    private String heroName;
    private String classType;
    private int powerLevel;
    
public Hero(String heroName, String classType, int powerLevel){
    this.heroName = heroName;
    this.classType = classType;
    this.powerLevel = powerLevel;
}


public String getHeroName(){
    return heroName;
}

public String getClassType(){
    return classType;
}

public int getPowerLevel(){
    return powerLevel;
}

public void displayHeroInfo(){
    System.out.println("- " + heroName + " (" + classType + ") | Power: " + powerLevel);
}

}
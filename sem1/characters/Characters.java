package sem1.characters;

public class Characters {
    public int health, mana, defence, damage;
    public String name;

    public Characters(int health, int mana, int defence, int damage, String name) {
        this.health = health; // хп
        this.mana = mana; // мана
        this.defence = defence; // деф
        this.damage = damage; // урон
        this.name = name; // имя
    }
}

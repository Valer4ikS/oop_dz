package sem1;

import sem1.characters.Characters;
import sem1.characters.Crossbowman;
import sem1.characters.Mage;
import sem1.characters.Monk;
import sem1.characters.Outlaw;
import sem1.characters.Peasant;
import sem1.characters.Sniper;
import sem1.characters.Spearman;

import java.util.ArrayList;

/*
Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик,
снайпер, арбалетчик, крестьянин. На базе описания персонажей описать
простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса.
 */
public class Program {
    public static void main(String[] args) {
        ArrayList<Characters> units = new ArrayList<>();

        units.add(new Mage("Mage"));
        units.add(new Monk("Monk"));
        units.add(new Outlaw("Outlaw"));
        units.add(new Spearman("Spearman"));
        units.add(new Sniper("Sniper"));
        units.add(new Crossbowman("Crossbowman"));
        units.add(new Peasant("Peasant"));

        units.forEach(n -> System.out.println(n.name));
    }
}
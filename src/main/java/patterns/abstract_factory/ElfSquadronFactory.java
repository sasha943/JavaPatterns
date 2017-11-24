package patterns.abstract_factory;

/*
* In most cases abstract factory realize singleton pattern
* Abstract factory used when we want to inject some specific factory
*
* */
public class ElfSquadronFactory {

    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    public void createSquadron (SquadronFactory factory) {
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
    }

}

class ElfMage implements Mage {
    public void cast() {
        // использовать магию эльфов
    }
}

class ElfArcher implements Archer {
    public void shoot() {
        // использовать лук эльфов
    }
}

class ElfWarrior implements Warrior {
    public void attack() {
        // использовать меч эльфов
    }
}
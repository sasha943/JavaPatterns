package patterns.abstract_factory;


public abstract class SquadronFactory {

    public abstract Mage createMage();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();
}

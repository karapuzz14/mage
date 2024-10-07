package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.a.AlchemyAkkiRonin;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author karapuzz14
 */
public final class AlchemyKamigawaRebalanced extends ExpansionSet {

    private static final AlchemyKamigawaRebalanced instance = new AlchemyKamigawaRebalanced();

    public static AlchemyKamigawaRebalanced getInstance() {
        return instance;
    }

    private AlchemyKamigawaRebalanced() {
        super("Alchemy: Kamigawa Rebalanced", "RNEO", ExpansionSet.buildDate(2022, 3, 17), SetType.MAGIC_ARENA);
        this.blockName = "Alchemy";
        this.hasBoosters = false;
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("A-Akki Ronin", "A-131", Rarity.COMMON, AlchemyAkkiRonin.class));

    }
}

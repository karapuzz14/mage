package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author karapuzz14
 */
public final class AlchemyKamigawa extends ExpansionSet {

    private static final AlchemyKamigawa instance = new AlchemyKamigawa();

    public static AlchemyKamigawa getInstance() {
        return instance;
    }

    private AlchemyKamigawa() {
        super("Alchemy: Kamigawa", "YNEO", ExpansionSet.buildDate(2022, 3, 17), SetType.MAGIC_ARENA);
        this.blockName = "Alchemy";
        this.hasBoosters = false;
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Artillery Enthusiast", 18, Rarity.UNCOMMON, mage.cards.a.ArtilleryEnthusiast.class));
        cards.add(new SetCardInfo("Bellowsbreath Ogre", 21, Rarity.RARE, mage.cards.b.BellowsbreathOgre.class));
        cards.add(new SetCardInfo("Better Offer", 10, Rarity.RARE, mage.cards.b.BetterOffer.class));
        cards.add(new SetCardInfo("Boseiju Pathlighter", 26, Rarity.RARE, mage.cards.b.BoseijuPathlighter.class));
        cards.add(new SetCardInfo("Chronicler of Worship", 25, Rarity.RARE, mage.cards.c.ChroniclerOfWorship.class));
        cards.add(new SetCardInfo("Consuming Oni", 17, Rarity.MYTHIC, mage.cards.c.ConsumingOni.class));
        cards.add(new SetCardInfo("Dragonfly Pilot", 1, Rarity.UNCOMMON, mage.cards.d.DragonflyPilot.class));
        cards.add(new SetCardInfo("Experimental Pilot", 6, Rarity.UNCOMMON, mage.cards.e.ExperimentalPilot.class));
        cards.add(new SetCardInfo("Forceful Cultivator", 29, Rarity.MYTHIC, mage.cards.f.ForcefulCultivator.class));
        cards.add(new SetCardInfo("Forgeborn Phoenix", 23, Rarity.MYTHIC, mage.cards.f.ForgebornPhoenix.class));
        cards.add(new SetCardInfo("Foundry Beetle", 19, Rarity.RARE, mage.cards.f.FoundryBeetle.class));
        cards.add(new SetCardInfo("Fragment Reality", 4, Rarity.RARE, mage.cards.f.FragmentReality.class));
        cards.add(new SetCardInfo("Futurist Spellthief", 8, Rarity.RARE, mage.cards.f.FuturistSpellthief.class));
        cards.add(new SetCardInfo("Holographic Double", 7, Rarity.RARE, mage.cards.h.HolographicDouble.class));
        cards.add(new SetCardInfo("Imperial Blademaster", 30, Rarity.RARE, mage.cards.i.ImperialBlademaster.class));
        cards.add(new SetCardInfo("Inchblade Companion", 2, Rarity.RARE, mage.cards.i.InchbladeCompanion.class));
        cards.add(new SetCardInfo("Jukai Liberator", 27, Rarity.RARE, mage.cards.j.JukaiLiberator.class));
        cards.add(new SetCardInfo("Junkyard Scrapper", 20, Rarity.RARE, mage.cards.j.JunkyardScrapper.class));
        cards.add(new SetCardInfo("Kami of Bamboo Groves", 24, Rarity.UNCOMMON, mage.cards.k.KamiOfBambooGroves.class));
        cards.add(new SetCardInfo("Kami of Mourning", 14, Rarity.RARE, mage.cards.k.KamiOfMourning.class));
        cards.add(new SetCardInfo("Kami of Transmutation", 3, Rarity.RARE, mage.cards.k.KamiOfTransmutation.class));
        cards.add(new SetCardInfo("Molten Impact", 22, Rarity.RARE, mage.cards.m.MoltenImpact.class));
        cards.add(new SetCardInfo("Mothrider Cavalry", 5, Rarity.MYTHIC, mage.cards.m.MothriderCavalry.class));
        cards.add(new SetCardInfo("Painful Bond", 12, Rarity.UNCOMMON, mage.cards.p.PainfulBond.class));
        cards.add(new SetCardInfo("Runaway Growth", 28, Rarity.RARE, mage.cards.r.RunawayGrowth.class));
        cards.add(new SetCardInfo("Saiba Syphoner", 11, Rarity.MYTHIC, mage.cards.s.SaibaSyphoner.class));
        cards.add(new SetCardInfo("Semblance Scanner", 9, Rarity.RARE, mage.cards.s.SemblanceScanner.class));
        cards.add(new SetCardInfo("Soul Servitude", 16, Rarity.RARE, mage.cards.s.SoulServitude.class));
        cards.add(new SetCardInfo("Swarm Saboteur", 13, Rarity.RARE, mage.cards.s.SwarmSaboteur.class));
        cards.add(new SetCardInfo("Undercity Plunder", 15, Rarity.RARE, mage.cards.u.UndercityPlunder.class));

    }
}

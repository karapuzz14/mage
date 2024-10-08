package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;

import java.util.ArrayList;
import java.util.List;
/**
 * @author TheElk801
 */
public final class PhyrexiaAllWillBeOne extends ExpansionSet {

    private static final PhyrexiaAllWillBeOne instance = new PhyrexiaAllWillBeOne();

    public static PhyrexiaAllWillBeOne getInstance() {
        return instance;
    }

    private PhyrexiaAllWillBeOne() {
        super("Phyrexia: All Will Be One", "ONE", ExpansionSet.buildDate(2023, 1, 10), SetType.EXPANSION);
        this.blockName = "Phyrexia: All Will Be One";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 7;
        this.maxCardNumberInBooster = 271;

        cards.add(new SetCardInfo("Adaptive Sporesinger", 157, Rarity.COMMON, mage.cards.a.AdaptiveSporesinger.class));
        cards.add(new SetCardInfo("Against All Odds", 1, Rarity.UNCOMMON, mage.cards.a.AgainstAllOdds.class));
        cards.add(new SetCardInfo("All Will Be One", 118, Rarity.MYTHIC, mage.cards.a.AllWillBeOne.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("All Will Be One", 352, Rarity.MYTHIC, mage.cards.a.AllWillBeOne.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ambulatory Edifice", 79, Rarity.UNCOMMON, mage.cards.a.AmbulatoryEdifice.class));
        cards.add(new SetCardInfo("Annex Sentry", 2, Rarity.UNCOMMON, mage.cards.a.AnnexSentry.class));
        cards.add(new SetCardInfo("Annihilating Glare", 80, Rarity.COMMON, mage.cards.a.AnnihilatingGlare.class));
        cards.add(new SetCardInfo("Anoint with Affliction", 81, Rarity.COMMON, mage.cards.a.AnointWithAffliction.class));
        cards.add(new SetCardInfo("Apostle of Invasion", 3, Rarity.UNCOMMON, mage.cards.a.ApostleOfInvasion.class));
        cards.add(new SetCardInfo("Archfiend of the Dross", 304, Rarity.RARE, mage.cards.a.ArchfiendOfTheDross.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Archfiend of the Dross", 434, Rarity.RARE, mage.cards.a.ArchfiendOfTheDross.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Archfiend of the Dross", 82, Rarity.RARE, mage.cards.a.ArchfiendOfTheDross.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Argentum Masticore", 222, Rarity.RARE, mage.cards.a.ArgentumMasticore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Argentum Masticore", 393, Rarity.RARE, mage.cards.a.ArgentumMasticore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Armored Scrapgorger", 158, Rarity.UNCOMMON, mage.cards.a.ArmoredScrapgorger.class));
        cards.add(new SetCardInfo("Aspirant's Ascent", 40, Rarity.COMMON, mage.cards.a.AspirantsAscent.class));
        cards.add(new SetCardInfo("Atmosphere Surgeon", 41, Rarity.UNCOMMON, mage.cards.a.AtmosphereSurgeon.class));
        cards.add(new SetCardInfo("Atraxa's Skitterfang", 223, Rarity.UNCOMMON, mage.cards.a.AtraxasSkitterfang.class));
        cards.add(new SetCardInfo("Atraxa, Grand Unifier", 196, Rarity.MYTHIC, mage.cards.a.AtraxaGrandUnifier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Atraxa, Grand Unifier", 316, Rarity.MYTHIC, mage.cards.a.AtraxaGrandUnifier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Atraxa, Grand Unifier", 357, Rarity.MYTHIC, mage.cards.a.AtraxaGrandUnifier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Atraxa, Grand Unifier", 459, Rarity.MYTHIC, mage.cards.a.AtraxaGrandUnifier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Awaken the Sleeper", 119, Rarity.UNCOMMON, mage.cards.a.AwakenTheSleeper.class));
        cards.add(new SetCardInfo("Axiom Engraver", 120, Rarity.COMMON, mage.cards.a.AxiomEngraver.class));
        cards.add(new SetCardInfo("Barbed Batterfist", 121, Rarity.COMMON, mage.cards.b.BarbedBatterfist.class));
        cards.add(new SetCardInfo("Basilica Shepherd", 4, Rarity.COMMON, mage.cards.b.BasilicaShepherd.class));
        cards.add(new SetCardInfo("Basilica Skullbomb", 224, Rarity.COMMON, mage.cards.b.BasilicaSkullbomb.class));
        cards.add(new SetCardInfo("Bilious Skulldweller", 83, Rarity.UNCOMMON, mage.cards.b.BiliousSkulldweller.class));
        cards.add(new SetCardInfo("Black Sun's Twilight", 383, Rarity.RARE, mage.cards.b.BlackSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Black Sun's Twilight", 84, Rarity.RARE, mage.cards.b.BlackSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blackcleave Cliffs", 248, Rarity.RARE, mage.cards.b.BlackcleaveCliffs.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blackcleave Cliffs", 370, Rarity.RARE, mage.cards.b.BlackcleaveCliffs.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blade of Shared Souls", 378, Rarity.RARE, mage.cards.b.BladeOfSharedSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blade of Shared Souls", 42, Rarity.RARE, mage.cards.b.BladeOfSharedSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bladed Ambassador", 285, Rarity.UNCOMMON, mage.cards.b.BladedAmbassador.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bladed Ambassador", 417, Rarity.UNCOMMON, mage.cards.b.BladedAmbassador.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bladed Ambassador", 5, Rarity.UNCOMMON, mage.cards.b.BladedAmbassador.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bladegraft Aspirant", 122, Rarity.COMMON, mage.cards.b.BladegraftAspirant.class));
        cards.add(new SetCardInfo("Bladehold War-Whip", 197, Rarity.UNCOMMON, mage.cards.b.BladeholdWarWhip.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bladehold War-Whip", 280, Rarity.UNCOMMON, mage.cards.b.BladeholdWarWhip.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blazing Crescendo", 123, Rarity.COMMON, mage.cards.b.BlazingCrescendo.class));
        cards.add(new SetCardInfo("Blightbelly Rat", 289, Rarity.COMMON, mage.cards.b.BlightbellyRat.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blightbelly Rat", 435, Rarity.UNCOMMON, mage.cards.b.BlightbellyRat.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blightbelly Rat", 85, Rarity.COMMON, mage.cards.b.BlightbellyRat.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloated Contaminator", 159, Rarity.RARE, mage.cards.b.BloatedContaminator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloated Contaminator", 389, Rarity.RARE, mage.cards.b.BloatedContaminator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blue Sun's Twilight", 379, Rarity.RARE, mage.cards.b.BlueSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Blue Sun's Twilight", 43, Rarity.RARE, mage.cards.b.BlueSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bonepicker Skirge", 290, Rarity.COMMON, mage.cards.b.BonepickerSkirge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bonepicker Skirge", 436, Rarity.COMMON, mage.cards.b.BonepickerSkirge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bonepicker Skirge", 86, Rarity.COMMON, mage.cards.b.BonepickerSkirge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Branchblight Stalker", 160, Rarity.COMMON, mage.cards.b.BranchblightStalker.class));
        cards.add(new SetCardInfo("Bring the Ending", 44, Rarity.COMMON, mage.cards.b.BringTheEnding.class));
        cards.add(new SetCardInfo("Cacophony Scamp", 124, Rarity.UNCOMMON, mage.cards.c.CacophonyScamp.class));
        cards.add(new SetCardInfo("Cankerbloom", 161, Rarity.UNCOMMON, mage.cards.c.Cankerbloom.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cankerbloom", 294, Rarity.UNCOMMON, mage.cards.c.Cankerbloom.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cankerbloom", 451, Rarity.UNCOMMON, mage.cards.c.Cankerbloom.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Capricious Hellraiser", 125, Rarity.MYTHIC, mage.cards.c.CapriciousHellraiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Capricious Hellraiser", 310, Rarity.MYTHIC, mage.cards.c.CapriciousHellraiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Capricious Hellraiser", 353, Rarity.MYTHIC, mage.cards.c.CapriciousHellraiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Capricious Hellraiser", 444, Rarity.MYTHIC, mage.cards.c.CapriciousHellraiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Carnivorous Canopy", 162, Rarity.COMMON, mage.cards.c.CarnivorousCanopy.class));
        cards.add(new SetCardInfo("Cephalopod Sentry", 198, Rarity.UNCOMMON, mage.cards.c.CephalopodSentry.class));
        cards.add(new SetCardInfo("Charforger", 199, Rarity.UNCOMMON, mage.cards.c.Charforger.class));
        cards.add(new SetCardInfo("Charge of the Mites", 6, Rarity.COMMON, mage.cards.c.ChargeOfTheMites.class));
        cards.add(new SetCardInfo("Chimney Rabble", 126, Rarity.COMMON, mage.cards.c.ChimneyRabble.class));
        cards.add(new SetCardInfo("Chittering Skitterling", 87, Rarity.UNCOMMON, mage.cards.c.ChitteringSkitterling.class));
        cards.add(new SetCardInfo("Chrome Prowler", 45, Rarity.COMMON, mage.cards.c.ChromeProwler.class));
        cards.add(new SetCardInfo("Churning Reservoir", 127, Rarity.UNCOMMON, mage.cards.c.ChurningReservoir.class));
        cards.add(new SetCardInfo("Cinderslash Ravager", 200, Rarity.UNCOMMON, mage.cards.c.CinderslashRavager.class));
        cards.add(new SetCardInfo("Compleat Devotion", 7, Rarity.COMMON, mage.cards.c.CompleatDevotion.class));
        cards.add(new SetCardInfo("Conduit of Worlds", 163, Rarity.RARE, mage.cards.c.ConduitOfWorlds.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Conduit of Worlds", 390, Rarity.RARE, mage.cards.c.ConduitOfWorlds.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Contagious Vorrac", 164, Rarity.COMMON, mage.cards.c.ContagiousVorrac.class));
        cards.add(new SetCardInfo("Copper Longlegs", 165, Rarity.COMMON, mage.cards.c.CopperLonglegs.class));
        cards.add(new SetCardInfo("Copperline Gorge", 249, Rarity.RARE, mage.cards.c.CopperlineGorge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Copperline Gorge", 371, Rarity.RARE, mage.cards.c.CopperlineGorge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Crawling Chorus", 8, Rarity.COMMON, mage.cards.c.CrawlingChorus.class));
        cards.add(new SetCardInfo("Cruel Grimnarch", 88, Rarity.COMMON, mage.cards.c.CruelGrimnarch.class));
        cards.add(new SetCardInfo("Cutthroat Centurion", 89, Rarity.COMMON, mage.cards.c.CutthroatCenturion.class));
        cards.add(new SetCardInfo("Darkslick Shores", 250, Rarity.RARE, mage.cards.d.DarkslickShores.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Darkslick Shores", 372, Rarity.RARE, mage.cards.d.DarkslickShores.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Distorted Curiosity", 46, Rarity.UNCOMMON, mage.cards.d.DistortedCuriosity.class));
        cards.add(new SetCardInfo("Dragonwing Glider", 128, Rarity.RARE, mage.cards.d.DragonwingGlider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dragonwing Glider", 385, Rarity.RARE, mage.cards.d.DragonwingGlider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Drivnod, Carnage Dominus", 305, Rarity.MYTHIC, mage.cards.d.DrivnodCarnageDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Drivnod, Carnage Dominus", 350, Rarity.MYTHIC, mage.cards.d.DrivnodCarnageDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Drivnod, Carnage Dominus", 437, Rarity.MYTHIC, mage.cards.d.DrivnodCarnageDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Drivnod, Carnage Dominus", 90, Rarity.MYTHIC, mage.cards.d.DrivnodCarnageDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dross Skullbomb", 225, Rarity.COMMON, mage.cards.d.DrossSkullbomb.class));
        cards.add(new SetCardInfo("Drown in Ichor", 91, Rarity.UNCOMMON, mage.cards.d.DrownInIchor.class));
        cards.add(new SetCardInfo("Duelist of Deep Faith", 9, Rarity.COMMON, mage.cards.d.DuelistOfDeepFaith.class));
        cards.add(new SetCardInfo("Dune Mover", 226, Rarity.COMMON, mage.cards.d.DuneMover.class));
        cards.add(new SetCardInfo("Duress", 92, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 10, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 298, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 345, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 414, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 415, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 416, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 418, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 419, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 420, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn, Mother of Machines", 421, Rarity.MYTHIC, mage.cards.e.EleshNornMotherOfMachines.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Encroaching Mycosynth", 380, Rarity.RARE, mage.cards.e.EncroachingMycosynth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Encroaching Mycosynth", 47, Rarity.RARE, mage.cards.e.EncroachingMycosynth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Escaped Experiment", 48, Rarity.COMMON, mage.cards.e.EscapedExperiment.class));
        cards.add(new SetCardInfo("Evolved Spinoderm", 166, Rarity.RARE, mage.cards.e.EvolvedSpinoderm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Evolved Spinoderm", 313, Rarity.RARE, mage.cards.e.EvolvedSpinoderm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Evolved Spinoderm", 452, Rarity.RARE, mage.cards.e.EvolvedSpinoderm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Evolving Adaptive", 167, Rarity.UNCOMMON, mage.cards.e.EvolvingAdaptive.class));
        cards.add(new SetCardInfo("Expand the Sphere", 168, Rarity.UNCOMMON, mage.cards.e.ExpandTheSphere.class));
        cards.add(new SetCardInfo("Experimental Augury", 278, Rarity.COMMON, mage.cards.e.ExperimentalAugury.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Experimental Augury", 49, Rarity.COMMON, mage.cards.e.ExperimentalAugury.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Exuberant Fuseling", 129, Rarity.UNCOMMON, mage.cards.e.ExuberantFuseling.class));
        cards.add(new SetCardInfo("Eye of Malcator", 50, Rarity.COMMON, mage.cards.e.EyeOfMalcator.class));
        cards.add(new SetCardInfo("Ezuri, Stalker of Spheres", 201, Rarity.RARE, mage.cards.e.EzuriStalkerOfSpheres.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ezuri, Stalker of Spheres", 317, Rarity.RARE, mage.cards.e.EzuriStalkerOfSpheres.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ezuri, Stalker of Spheres", 460, Rarity.RARE, mage.cards.e.EzuriStalkerOfSpheres.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Feed the Infection", 93, Rarity.UNCOMMON, mage.cards.f.FeedTheInfection.class));
        cards.add(new SetCardInfo("Flensing Raptor", 12, Rarity.COMMON, mage.cards.f.FlensingRaptor.class));
        cards.add(new SetCardInfo("Fleshless Gladiator", 94, Rarity.COMMON, mage.cards.f.FleshlessGladiator.class));
        cards.add(new SetCardInfo("Font of Progress", 51, Rarity.UNCOMMON, mage.cards.f.FontOfProgress.class));
        cards.add(new SetCardInfo("Forest", 266, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 271, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 276, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 369, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forgehammer Centurion", 130, Rarity.COMMON, mage.cards.f.ForgehammerCenturion.class));
        cards.add(new SetCardInfo("Free from Flesh", 131, Rarity.COMMON, mage.cards.f.FreeFromFlesh.class));
        cards.add(new SetCardInfo("Furnace Punisher", 132, Rarity.UNCOMMON, mage.cards.f.FurnacePunisher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Furnace Punisher", 291, Rarity.UNCOMMON, mage.cards.f.FurnacePunisher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Furnace Punisher", 445, Rarity.UNCOMMON, mage.cards.f.FurnacePunisher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Furnace Skullbomb", 228, Rarity.COMMON, mage.cards.f.FurnaceSkullbomb.class));
        cards.add(new SetCardInfo("Furnace Strider", 133, Rarity.COMMON, mage.cards.f.FurnaceStrider.class));
        cards.add(new SetCardInfo("Geth, Thane of Contracts", 306, Rarity.RARE, mage.cards.g.GethThaneOfContracts.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Geth, Thane of Contracts", 438, Rarity.RARE, mage.cards.g.GethThaneOfContracts.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Geth, Thane of Contracts", 95, Rarity.RARE, mage.cards.g.GethThaneOfContracts.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gitaxian Anatomist", 52, Rarity.COMMON, mage.cards.g.GitaxianAnatomist.class));
        cards.add(new SetCardInfo("Gitaxian Raptor", 53, Rarity.COMMON, mage.cards.g.GitaxianRaptor.class));
        cards.add(new SetCardInfo("Gleeful Demolition", 134, Rarity.UNCOMMON, mage.cards.g.GleefulDemolition.class));
        cards.add(new SetCardInfo("Glissa Sunslayer", 202, Rarity.RARE, mage.cards.g.GlissaSunslayer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glissa Sunslayer", 318, Rarity.RARE, mage.cards.g.GlissaSunslayer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glissa Sunslayer", 461, Rarity.RARE, mage.cards.g.GlissaSunslayer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glistener Seer", 54, Rarity.COMMON, mage.cards.g.GlistenerSeer.class));
        cards.add(new SetCardInfo("Goldwarden's Helm", 13, Rarity.COMMON, mage.cards.g.GoldwardensHelm.class));
        cards.add(new SetCardInfo("Goliath Hatchery", 408, Rarity.RARE, mage.cards.g.GoliathHatchery.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goliath Hatchery", 413, Rarity.RARE, mage.cards.g.GoliathHatchery.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Graaz, Unstoppable Juggernaut", 229, Rarity.RARE, mage.cards.g.GraazUnstoppableJuggernaut.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Graaz, Unstoppable Juggernaut", 334, Rarity.RARE, mage.cards.g.GraazUnstoppableJuggernaut.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Graaz, Unstoppable Juggernaut", 478, Rarity.RARE, mage.cards.g.GraazUnstoppableJuggernaut.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Green Sun's Twilight", 169, Rarity.RARE, mage.cards.g.GreenSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Green Sun's Twilight", 284, Rarity.RARE, mage.cards.g.GreenSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Green Sun's Twilight", 391, Rarity.RARE, mage.cards.g.GreenSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gulping Scraptrap", 96, Rarity.COMMON, mage.cards.g.GulpingScraptrap.class));
        cards.add(new SetCardInfo("Hazardous Blast", 135, Rarity.COMMON, mage.cards.h.HazardousBlast.class));
        cards.add(new SetCardInfo("Hexgold Halberd", 136, Rarity.UNCOMMON, mage.cards.h.HexgoldHalberd.class));
        cards.add(new SetCardInfo("Hexgold Hoverwings", 14, Rarity.UNCOMMON, mage.cards.h.HexgoldHoverwings.class));
        cards.add(new SetCardInfo("Hexgold Slash", 137, Rarity.COMMON, mage.cards.h.HexgoldSlash.class));
        cards.add(new SetCardInfo("Ichor Synthesizer", 55, Rarity.COMMON, mage.cards.i.IchorSynthesizer.class));
        cards.add(new SetCardInfo("Ichormoon Gauntlet", 348, Rarity.MYTHIC, mage.cards.i.IchormoonGauntlet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ichormoon Gauntlet", 56, Rarity.MYTHIC, mage.cards.i.IchormoonGauntlet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ichorplate Golem", 230, Rarity.UNCOMMON, mage.cards.i.IchorplateGolem.class));
        cards.add(new SetCardInfo("Ichorspit Basilisk", 170, Rarity.COMMON, mage.cards.i.IchorspitBasilisk.class));
        cards.add(new SetCardInfo("Incisor Glider", 15, Rarity.COMMON, mage.cards.i.IncisorGlider.class));
        cards.add(new SetCardInfo("Incubation Sac", 171, Rarity.UNCOMMON, mage.cards.i.IncubationSac.class));
        cards.add(new SetCardInfo("Indoctrination Attendant", 16, Rarity.COMMON, mage.cards.i.IndoctrinationAttendant.class));
        cards.add(new SetCardInfo("Infectious Bite", 172, Rarity.UNCOMMON, mage.cards.i.InfectiousBite.class));
        cards.add(new SetCardInfo("Infectious Inquiry", 97, Rarity.COMMON, mage.cards.i.InfectiousInquiry.class));
        cards.add(new SetCardInfo("Infested Fleshcutter", 17, Rarity.UNCOMMON, mage.cards.i.InfestedFleshcutter.class));
        cards.add(new SetCardInfo("Island", 263, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 268, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 273, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 366, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Jace, the Perfected Mind", 325, Rarity.MYTHIC, mage.cards.j.JaceThePerfectedMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace, the Perfected Mind", 336, Rarity.MYTHIC, mage.cards.j.JaceThePerfectedMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace, the Perfected Mind", 360, Rarity.MYTHIC, mage.cards.j.JaceThePerfectedMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace, the Perfected Mind", 428, Rarity.MYTHIC, mage.cards.j.JaceThePerfectedMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace, the Perfected Mind", 429, Rarity.MYTHIC, mage.cards.j.JaceThePerfectedMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace, the Perfected Mind", 57, Rarity.MYTHIC, mage.cards.j.JaceThePerfectedMind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jawbone Duelist", 18, Rarity.UNCOMMON, mage.cards.j.JawboneDuelist.class));
        cards.add(new SetCardInfo("Jor Kadeen, First Goldwarden", 203, Rarity.RARE, mage.cards.j.JorKadeenFirstGoldwarden.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jor Kadeen, First Goldwarden", 332, Rarity.RARE, mage.cards.j.JorKadeenFirstGoldwarden.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jor Kadeen, First Goldwarden", 462, Rarity.RARE, mage.cards.j.JorKadeenFirstGoldwarden.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaito, Dancing Shadow", 204, Rarity.RARE, mage.cards.k.KaitoDancingShadow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaito, Dancing Shadow", 340, Rarity.RARE, mage.cards.k.KaitoDancingShadow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaito, Dancing Shadow", 463, Rarity.RARE, mage.cards.k.KaitoDancingShadow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Karumonix, the Rat King", 282, Rarity.RARE, mage.cards.k.KarumonixTheRatKing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Karumonix, the Rat King", 307, Rarity.RARE, mage.cards.k.KarumonixTheRatKing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Karumonix, the Rat King", 439, Rarity.RARE, mage.cards.k.KarumonixTheRatKing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Karumonix, the Rat King", 98, Rarity.RARE, mage.cards.k.KarumonixTheRatKing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaya, Intangible Slayer", 205, Rarity.RARE, mage.cards.k.KayaIntangibleSlayer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaya, Intangible Slayer", 341, Rarity.RARE, mage.cards.k.KayaIntangibleSlayer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kaya, Intangible Slayer", 464, Rarity.RARE, mage.cards.k.KayaIntangibleSlayer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kemba, Kha Enduring", 19, Rarity.RARE, mage.cards.k.KembaKhaEnduring.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kemba, Kha Enduring", 330, Rarity.RARE, mage.cards.k.KembaKhaEnduring.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kemba, Kha Enduring", 423, Rarity.RARE, mage.cards.k.KembaKhaEnduring.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kethek, Crucible Goliath", 206, Rarity.RARE, mage.cards.k.KethekCrucibleGoliath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kethek, Crucible Goliath", 319, Rarity.RARE, mage.cards.k.KethekCrucibleGoliath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kethek, Crucible Goliath", 465, Rarity.RARE, mage.cards.k.KethekCrucibleGoliath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kinzu of the Bleak Coven", 406, Rarity.RARE, mage.cards.k.KinzuOfTheBleakCoven.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kinzu of the Bleak Coven", 411, Rarity.RARE, mage.cards.k.KinzuOfTheBleakCoven.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Koth, Fire of Resistance", 138, Rarity.RARE, mage.cards.k.KothFireOfResistance.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Koth, Fire of Resistance", 338, Rarity.RARE, mage.cards.k.KothFireOfResistance.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Koth, Fire of Resistance", 446, Rarity.RARE, mage.cards.k.KothFireOfResistance.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kuldotha Cackler", 139, Rarity.COMMON, mage.cards.k.KuldothaCackler.class));
        cards.add(new SetCardInfo("Lattice-Blade Mantis", 173, Rarity.COMMON, mage.cards.l.LatticeBladeMantis.class));
        cards.add(new SetCardInfo("Leonin Lightbringer", 20, Rarity.COMMON, mage.cards.l.LeoninLightbringer.class));
        cards.add(new SetCardInfo("Lukka, Bound to Ruin", 207, Rarity.MYTHIC, mage.cards.l.LukkaBoundToRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lukka, Bound to Ruin", 328, Rarity.MYTHIC, mage.cards.l.LukkaBoundToRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lukka, Bound to Ruin", 342, Rarity.MYTHIC, mage.cards.l.LukkaBoundToRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lukka, Bound to Ruin", 363, Rarity.MYTHIC, mage.cards.l.LukkaBoundToRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lukka, Bound to Ruin", 466, Rarity.MYTHIC, mage.cards.l.LukkaBoundToRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lukka, Bound to Ruin", 467, Rarity.MYTHIC, mage.cards.l.LukkaBoundToRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Magmatic Sprinter", 140, Rarity.UNCOMMON, mage.cards.m.MagmaticSprinter.class));
        cards.add(new SetCardInfo("Malcator's Watcher", 58, Rarity.COMMON, mage.cards.m.MalcatorsWatcher.class));
        cards.add(new SetCardInfo("Malcator, Purity Overseer", 208, Rarity.RARE, mage.cards.m.MalcatorPurityOverseer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Malcator, Purity Overseer", 320, Rarity.RARE, mage.cards.m.MalcatorPurityOverseer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Malcator, Purity Overseer", 468, Rarity.RARE, mage.cards.m.MalcatorPurityOverseer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mandible Justiciar", 21, Rarity.COMMON, mage.cards.m.MandibleJusticiar.class));
        cards.add(new SetCardInfo("Maze Skullbomb", 231, Rarity.COMMON, mage.cards.m.MazeSkullbomb.class));
        cards.add(new SetCardInfo("Maze's Mantle", 174, Rarity.COMMON, mage.cards.m.MazesMantle.class));
        cards.add(new SetCardInfo("Meldweb Curator", 59, Rarity.COMMON, mage.cards.m.MeldwebCurator.class));
        cards.add(new SetCardInfo("Meldweb Strider", 60, Rarity.COMMON, mage.cards.m.MeldwebStrider.class));
        cards.add(new SetCardInfo("Melira, the Living Cure", 209, Rarity.RARE, mage.cards.m.MeliraTheLivingCure.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Melira, the Living Cure", 333, Rarity.RARE, mage.cards.m.MeliraTheLivingCure.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Melira, the Living Cure", 469, Rarity.RARE, mage.cards.m.MeliraTheLivingCure.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mercurial Spelldancer", 381, Rarity.RARE, mage.cards.m.MercurialSpelldancer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mercurial Spelldancer", 61, Rarity.RARE, mage.cards.m.MercurialSpelldancer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mesmerizing Dose", 62, Rarity.COMMON, mage.cards.m.MesmerizingDose.class));
        cards.add(new SetCardInfo("Migloz, Maze Crusher", 210, Rarity.RARE, mage.cards.m.MiglozMazeCrusher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Migloz, Maze Crusher", 321, Rarity.RARE, mage.cards.m.MiglozMazeCrusher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Migloz, Maze Crusher", 470, Rarity.RARE, mage.cards.m.MiglozMazeCrusher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mindsplice Apparatus", 382, Rarity.RARE, mage.cards.m.MindspliceApparatus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mindsplice Apparatus", 63, Rarity.RARE, mage.cards.m.MindspliceApparatus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Minor Misstep", 64, Rarity.UNCOMMON, mage.cards.m.MinorMisstep.class));
        cards.add(new SetCardInfo("Mirran Bardiche", 22, Rarity.COMMON, mage.cards.m.MirranBardiche.class));
        cards.add(new SetCardInfo("Mirran Safehouse", 232, Rarity.RARE, mage.cards.m.MirranSafehouse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mirran Safehouse", 395, Rarity.RARE, mage.cards.m.MirranSafehouse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mirrex", 254, Rarity.RARE, mage.cards.m.Mirrex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mirrex", 400, Rarity.RARE, mage.cards.m.Mirrex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mite Overseer", 404, Rarity.RARE, mage.cards.m.MiteOverseer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mite Overseer", 409, Rarity.RARE, mage.cards.m.MiteOverseer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Molten Rebuke", 141, Rarity.COMMON, mage.cards.m.MoltenRebuke.class));
        cards.add(new SetCardInfo("Mondrak, Glory Dominus", 23, Rarity.MYTHIC, mage.cards.m.MondrakGloryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mondrak, Glory Dominus", 299, Rarity.MYTHIC, mage.cards.m.MondrakGloryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mondrak, Glory Dominus", 346, Rarity.MYTHIC, mage.cards.m.MondrakGloryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mondrak, Glory Dominus", 424, Rarity.MYTHIC, mage.cards.m.MondrakGloryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Monument to Perfection", 233, Rarity.RARE, mage.cards.m.MonumentToPerfection.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Monument to Perfection", 396, Rarity.RARE, mage.cards.m.MonumentToPerfection.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 270, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 275, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 368, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Myr Convert", 234, Rarity.UNCOMMON, mage.cards.m.MyrConvert.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myr Convert", 297, Rarity.UNCOMMON, mage.cards.m.MyrConvert.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myr Convert", 479, Rarity.UNCOMMON, mage.cards.m.MyrConvert.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myr Custodian", 235, Rarity.COMMON, mage.cards.m.MyrCustodian.class));
        cards.add(new SetCardInfo("Myr Kinsmith", 236, Rarity.COMMON, mage.cards.m.MyrKinsmith.class));
        cards.add(new SetCardInfo("Nahiri's Sacrifice", 142, Rarity.UNCOMMON, mage.cards.n.NahirisSacrifice.class));
        cards.add(new SetCardInfo("Nahiri, the Unforgiving", 211, Rarity.MYTHIC, mage.cards.n.NahiriTheUnforgiving.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nahiri, the Unforgiving", 329, Rarity.MYTHIC, mage.cards.n.NahiriTheUnforgiving.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nahiri, the Unforgiving", 343, Rarity.MYTHIC, mage.cards.n.NahiriTheUnforgiving.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nahiri, the Unforgiving", 364, Rarity.MYTHIC, mage.cards.n.NahiriTheUnforgiving.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nahiri, the Unforgiving", 471, Rarity.MYTHIC, mage.cards.n.NahiriTheUnforgiving.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nahiri, the Unforgiving", 472, Rarity.MYTHIC, mage.cards.n.NahiriTheUnforgiving.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Necrogen Communion", 99, Rarity.UNCOMMON, mage.cards.n.NecrogenCommunion.class));
        cards.add(new SetCardInfo("Necrogen Rotpriest", 212, Rarity.UNCOMMON, mage.cards.n.NecrogenRotpriest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Necrogen Rotpriest", 296, Rarity.UNCOMMON, mage.cards.n.NecrogenRotpriest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Necrogen Rotpriest", 473, Rarity.UNCOMMON, mage.cards.n.NecrogenRotpriest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Necrosquito", 100, Rarity.UNCOMMON, mage.cards.n.Necrosquito.class));
        cards.add(new SetCardInfo("Nimraiser Paladin", 101, Rarity.UNCOMMON, mage.cards.n.NimraiserPaladin.class));
        cards.add(new SetCardInfo("Nissa, Ascended Animist", 175, Rarity.MYTHIC, mage.cards.n.NissaAscendedAnimist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nissa, Ascended Animist", 327, Rarity.MYTHIC, mage.cards.n.NissaAscendedAnimist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nissa, Ascended Animist", 339, Rarity.MYTHIC, mage.cards.n.NissaAscendedAnimist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nissa, Ascended Animist", 362, Rarity.MYTHIC, mage.cards.n.NissaAscendedAnimist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nissa, Ascended Animist", 453, Rarity.MYTHIC, mage.cards.n.NissaAscendedAnimist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nissa, Ascended Animist", 454, Rarity.MYTHIC, mage.cards.n.NissaAscendedAnimist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Norn's Wellspring", 24, Rarity.RARE, mage.cards.n.NornsWellspring.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Norn's Wellspring", 375, Rarity.RARE, mage.cards.n.NornsWellspring.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Noxious Assault", 176, Rarity.UNCOMMON, mage.cards.n.NoxiousAssault.class));
        cards.add(new SetCardInfo("Offer Immortality", 102, Rarity.COMMON, mage.cards.o.OfferImmortality.class));
        cards.add(new SetCardInfo("Oil-Gorger Troll", 177, Rarity.COMMON, mage.cards.o.OilGorgerTroll.class));
        cards.add(new SetCardInfo("Orthodoxy Enforcer", 25, Rarity.COMMON, mage.cards.o.OrthodoxyEnforcer.class));
        cards.add(new SetCardInfo("Ossification", 26, Rarity.UNCOMMON, mage.cards.o.Ossification.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ossification", 277, Rarity.UNCOMMON, mage.cards.o.Ossification.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ovika, Enigma Goliath", 213, Rarity.RARE, mage.cards.o.OvikaEnigmaGoliath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ovika, Enigma Goliath", 322, Rarity.RARE, mage.cards.o.OvikaEnigmaGoliath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ovika, Enigma Goliath", 474, Rarity.RARE, mage.cards.o.OvikaEnigmaGoliath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Oxidda Finisher", 143, Rarity.UNCOMMON, mage.cards.o.OxiddaFinisher.class));
        cards.add(new SetCardInfo("Paladin of Predation", 178, Rarity.UNCOMMON, mage.cards.p.PaladinOfPredation.class));
        cards.add(new SetCardInfo("Pestilent Syphoner", 103, Rarity.COMMON, mage.cards.p.PestilentSyphoner.class));
        cards.add(new SetCardInfo("Phyrexian Arena", 104, Rarity.RARE, mage.cards.p.PhyrexianArena.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Arena", 283, Rarity.RARE, mage.cards.p.PhyrexianArena.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Arena", 384, Rarity.RARE, mage.cards.p.PhyrexianArena.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Atlas", 237, Rarity.COMMON, mage.cards.p.PhyrexianAtlas.class));
        cards.add(new SetCardInfo("Phyrexian Obliterator", 105, Rarity.MYTHIC, mage.cards.p.PhyrexianObliterator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Obliterator", 308, Rarity.MYTHIC, mage.cards.p.PhyrexianObliterator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Obliterator", 351, Rarity.MYTHIC, mage.cards.p.PhyrexianObliterator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Obliterator", 440, Rarity.MYTHIC, mage.cards.p.PhyrexianObliterator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Vindicator", 27, Rarity.MYTHIC, mage.cards.p.PhyrexianVindicator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Vindicator", 300, Rarity.MYTHIC, mage.cards.p.PhyrexianVindicator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Vindicator", 347, Rarity.MYTHIC, mage.cards.p.PhyrexianVindicator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Vindicator", 425, Rarity.MYTHIC, mage.cards.p.PhyrexianVindicator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plague Nurse", 179, Rarity.COMMON, mage.cards.p.PlagueNurse.class));
        cards.add(new SetCardInfo("Plains", 262, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plains", 267, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plains", 272, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 365, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Planar Disruption", 28, Rarity.COMMON, mage.cards.p.PlanarDisruption.class));
        cards.add(new SetCardInfo("Plated Onslaught", 29, Rarity.UNCOMMON, mage.cards.p.PlatedOnslaught.class));
        cards.add(new SetCardInfo("Porcelain Zealot", 30, Rarity.UNCOMMON, mage.cards.p.PorcelainZealot.class));
        cards.add(new SetCardInfo("Predation Steward", 180, Rarity.COMMON, mage.cards.p.PredationSteward.class));
        cards.add(new SetCardInfo("Prologue to Phyresis", 65, Rarity.COMMON, mage.cards.p.PrologueToPhyresis.class));
        cards.add(new SetCardInfo("Prophetic Prism", 238, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Prosthetic Injector", 239, Rarity.UNCOMMON, mage.cards.p.ProstheticInjector.class));
        cards.add(new SetCardInfo("Quicksilver Fisher", 287, Rarity.COMMON, mage.cards.q.QuicksilverFisher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quicksilver Fisher", 430, Rarity.COMMON, mage.cards.q.QuicksilverFisher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quicksilver Fisher", 66, Rarity.COMMON, mage.cards.q.QuicksilverFisher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ravenous Necrotitan", 106, Rarity.UNCOMMON, mage.cards.r.RavenousNecrotitan.class));
        cards.add(new SetCardInfo("Razorverge Thicket", 257, Rarity.RARE, mage.cards.r.RazorvergeThicket.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Razorverge Thicket", 373, Rarity.RARE, mage.cards.r.RazorvergeThicket.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rebel Salvo", 144, Rarity.UNCOMMON, mage.cards.r.RebelSalvo.class));
        cards.add(new SetCardInfo("Red Sun's Twilight", 145, Rarity.RARE, mage.cards.r.RedSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Red Sun's Twilight", 386, Rarity.RARE, mage.cards.r.RedSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reject Imperfection", 67, Rarity.UNCOMMON, mage.cards.r.RejectImperfection.class));
        cards.add(new SetCardInfo("Resistance Reunited", 31, Rarity.UNCOMMON, mage.cards.r.ResistanceReunited.class));
        cards.add(new SetCardInfo("Resistance Skywarden", 146, Rarity.UNCOMMON, mage.cards.r.ResistanceSkywarden.class));
        cards.add(new SetCardInfo("Rhuk, Hexgold Nabber", 407, Rarity.RARE, mage.cards.r.RhukHexgoldNabber.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rhuk, Hexgold Nabber", 412, Rarity.RARE, mage.cards.r.RhukHexgoldNabber.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ria Ivor, Bane of Bladehold", 214, Rarity.RARE, mage.cards.r.RiaIvorBaneOfBladehold.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ria Ivor, Bane of Bladehold", 323, Rarity.RARE, mage.cards.r.RiaIvorBaneOfBladehold.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ria Ivor, Bane of Bladehold", 475, Rarity.RARE, mage.cards.r.RiaIvorBaneOfBladehold.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ribskiff", 240, Rarity.UNCOMMON, mage.cards.r.Ribskiff.class));
        cards.add(new SetCardInfo("Rustvine Cultivator", 181, Rarity.COMMON, mage.cards.r.RustvineCultivator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rustvine Cultivator", 295, Rarity.COMMON, mage.cards.r.RustvineCultivator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rustvine Cultivator", 455, Rarity.COMMON, mage.cards.r.RustvineCultivator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ruthless Predation", 182, Rarity.COMMON, mage.cards.r.RuthlessPredation.class));
        cards.add(new SetCardInfo("Sawblade Scamp", 147, Rarity.COMMON, mage.cards.s.SawbladeScamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sawblade Scamp", 292, Rarity.COMMON, mage.cards.s.SawbladeScamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sawblade Scamp", 447, Rarity.COMMON, mage.cards.s.SawbladeScamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Scheming Aspirant", 107, Rarity.UNCOMMON, mage.cards.s.SchemingAspirant.class));
        cards.add(new SetCardInfo("Seachrome Coast", 258, Rarity.RARE, mage.cards.s.SeachromeCoast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Seachrome Coast", 374, Rarity.RARE, mage.cards.s.SeachromeCoast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Serum Snare", 68, Rarity.UNCOMMON, mage.cards.s.SerumSnare.class));
        cards.add(new SetCardInfo("Serum Sovereign", 405, Rarity.RARE, mage.cards.s.SerumSovereign.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Serum Sovereign", 410, Rarity.RARE, mage.cards.s.SerumSovereign.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Serum-Core Chimera", 215, Rarity.UNCOMMON, mage.cards.s.SerumCoreChimera.class));
        cards.add(new SetCardInfo("Sheoldred's Edict", 108, Rarity.UNCOMMON, mage.cards.s.SheoldredsEdict.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sheoldred's Edict", 279, Rarity.UNCOMMON, mage.cards.s.SheoldredsEdict.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sheoldred's Headcleaver", 109, Rarity.COMMON, mage.cards.s.SheoldredsHeadcleaver.class));
        cards.add(new SetCardInfo("Shrapnel Slinger", 148, Rarity.COMMON, mage.cards.s.ShrapnelSlinger.class));
        cards.add(new SetCardInfo("Sinew Dancer", 286, Rarity.COMMON, mage.cards.s.SinewDancer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sinew Dancer", 32, Rarity.COMMON, mage.cards.s.SinewDancer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sinew Dancer", 426, Rarity.COMMON, mage.cards.s.SinewDancer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skrelv's Hive", 34, Rarity.RARE, mage.cards.s.SkrelvsHive.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skrelv's Hive", 376, Rarity.RARE, mage.cards.s.SkrelvsHive.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skrelv, Defector Mite", 301, Rarity.RARE, mage.cards.s.SkrelvDefectorMite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skrelv, Defector Mite", 33, Rarity.RARE, mage.cards.s.SkrelvDefectorMite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skrelv, Defector Mite", 427, Rarity.RARE, mage.cards.s.SkrelvDefectorMite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Skyscythe Engulfer", 183, Rarity.COMMON, mage.cards.s.SkyscytheEngulfer.class));
        cards.add(new SetCardInfo("Slaughter Singer", 216, Rarity.UNCOMMON, mage.cards.s.SlaughterSinger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Slaughter Singer", 281, Rarity.UNCOMMON, mage.cards.s.SlaughterSinger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Slobad, Iron Goblin", 149, Rarity.RARE, mage.cards.s.SlobadIronGoblin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Slobad, Iron Goblin", 311, Rarity.RARE, mage.cards.s.SlobadIronGoblin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Slobad, Iron Goblin", 448, Rarity.RARE, mage.cards.s.SlobadIronGoblin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Solphim, Mayhem Dominus", 150, Rarity.MYTHIC, mage.cards.s.SolphimMayhemDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Solphim, Mayhem Dominus", 312, Rarity.MYTHIC, mage.cards.s.SolphimMayhemDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Solphim, Mayhem Dominus", 354, Rarity.MYTHIC, mage.cards.s.SolphimMayhemDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Solphim, Mayhem Dominus", 449, Rarity.MYTHIC, mage.cards.s.SolphimMayhemDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soulless Jailer", 241, Rarity.RARE, mage.cards.s.SoullessJailer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soulless Jailer", 397, Rarity.RARE, mage.cards.s.SoullessJailer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Staff of Compleation", 242, Rarity.MYTHIC, mage.cards.s.StaffOfCompleation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Staff of Compleation", 358, Rarity.MYTHIC, mage.cards.s.StaffOfCompleation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Stinging Hivemaster", 110, Rarity.COMMON, mage.cards.s.StingingHivemaster.class));
        cards.add(new SetCardInfo("Surgical Skullbomb", 243, Rarity.COMMON, mage.cards.s.SurgicalSkullbomb.class));
        cards.add(new SetCardInfo("Swamp", 264, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 269, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 274, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 367, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swooping Lookout", 35, Rarity.UNCOMMON, mage.cards.s.SwoopingLookout.class));
        cards.add(new SetCardInfo("Sword of Forge and Frontier", 244, Rarity.MYTHIC, mage.cards.s.SwordOfForgeAndFrontier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sword of Forge and Frontier", 359, Rarity.MYTHIC, mage.cards.s.SwordOfForgeAndFrontier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sylvok Battle-Chair", 184, Rarity.UNCOMMON, mage.cards.s.SylvokBattleChair.class));
        cards.add(new SetCardInfo("Tablet of Compleation", 245, Rarity.RARE, mage.cards.t.TabletOfCompleation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tablet of Compleation", 398, Rarity.RARE, mage.cards.t.TabletOfCompleation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tainted Observer", 217, Rarity.UNCOMMON, mage.cards.t.TaintedObserver.class));
        cards.add(new SetCardInfo("Tamiyo's Immobilizer", 69, Rarity.UNCOMMON, mage.cards.t.TamiyosImmobilizer.class));
        cards.add(new SetCardInfo("Tamiyo's Logbook", 70, Rarity.UNCOMMON, mage.cards.t.TamiyosLogbook.class));
        cards.add(new SetCardInfo("Tekuthal, Inquiry Dominus", 302, Rarity.MYTHIC, mage.cards.t.TekuthalInquiryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tekuthal, Inquiry Dominus", 349, Rarity.MYTHIC, mage.cards.t.TekuthalInquiryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tekuthal, Inquiry Dominus", 431, Rarity.MYTHIC, mage.cards.t.TekuthalInquiryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tekuthal, Inquiry Dominus", 71, Rarity.MYTHIC, mage.cards.t.TekuthalInquiryDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Terramorphic Expanse", 261, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Testament Bearer", 111, Rarity.COMMON, mage.cards.t.TestamentBearer.class));
        cards.add(new SetCardInfo("The Autonomous Furnace", 247, Rarity.COMMON, mage.cards.t.TheAutonomousFurnace.class));
        cards.add(new SetCardInfo("The Dross Pits", 251, Rarity.COMMON, mage.cards.t.TheDrossPits.class));
        cards.add(new SetCardInfo("The Eternal Wanderer", 11, Rarity.RARE, mage.cards.t.TheEternalWanderer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Eternal Wanderer", 335, Rarity.RARE, mage.cards.t.TheEternalWanderer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Eternal Wanderer", 422, Rarity.RARE, mage.cards.t.TheEternalWanderer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Fair Basilica", 252, Rarity.COMMON, mage.cards.t.TheFairBasilica.class));
        cards.add(new SetCardInfo("The Filigree Sylex", 227, Rarity.RARE, mage.cards.t.TheFiligreeSylex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Filigree Sylex", 394, Rarity.RARE, mage.cards.t.TheFiligreeSylex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Hunter Maze", 253, Rarity.COMMON, mage.cards.t.TheHunterMaze.class));
        cards.add(new SetCardInfo("The Monumental Facade", 255, Rarity.RARE, mage.cards.t.TheMonumentalFacade.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Monumental Facade", 401, Rarity.RARE, mage.cards.t.TheMonumentalFacade.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Mycosynth Gardens", 256, Rarity.RARE, mage.cards.t.TheMycosynthGardens.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Mycosynth Gardens", 402, Rarity.RARE, mage.cards.t.TheMycosynthGardens.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Seedcore", 259, Rarity.RARE, mage.cards.t.TheSeedcore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Seedcore", 403, Rarity.RARE, mage.cards.t.TheSeedcore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Surgical Bay", 260, Rarity.COMMON, mage.cards.t.TheSurgicalBay.class));
        cards.add(new SetCardInfo("Thirsting Roots", 185, Rarity.COMMON, mage.cards.t.ThirstingRoots.class));
        cards.add(new SetCardInfo("Thrill of Possibility", 151, Rarity.COMMON, mage.cards.t.ThrillOfPossibility.class));
        cards.add(new SetCardInfo("Thrummingbird", 288, Rarity.UNCOMMON, mage.cards.t.Thrummingbird.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrummingbird", 432, Rarity.UNCOMMON, mage.cards.t.Thrummingbird.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrummingbird", 72, Rarity.UNCOMMON, mage.cards.t.Thrummingbird.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrun, Breaker of Silence", 186, Rarity.RARE, mage.cards.t.ThrunBreakerOfSilence.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrun, Breaker of Silence", 331, Rarity.RARE, mage.cards.t.ThrunBreakerOfSilence.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrun, Breaker of Silence", 456, Rarity.RARE, mage.cards.t.ThrunBreakerOfSilence.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Titanic Growth", 187, Rarity.COMMON, mage.cards.t.TitanicGrowth.class));
        cards.add(new SetCardInfo("Transplant Theorist", 73, Rarity.UNCOMMON, mage.cards.t.TransplantTheorist.class));
        cards.add(new SetCardInfo("Trawler Drake", 74, Rarity.UNCOMMON, mage.cards.t.TrawlerDrake.class));
        cards.add(new SetCardInfo("Tyrranax Atrocity", 188, Rarity.COMMON, mage.cards.t.TyrranaxAtrocity.class));
        cards.add(new SetCardInfo("Tyrranax Rex", 189, Rarity.MYTHIC, mage.cards.t.TyrranaxRex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyrranax Rex", 314, Rarity.MYTHIC, mage.cards.t.TyrranaxRex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyrranax Rex", 355, Rarity.MYTHIC, mage.cards.t.TyrranaxRex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyrranax Rex", 457, Rarity.MYTHIC, mage.cards.t.TyrranaxRex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyvar's Stand", 190, Rarity.UNCOMMON, mage.cards.t.TyvarsStand.class));
        cards.add(new SetCardInfo("Tyvar, Jubilant Brawler", 218, Rarity.RARE, mage.cards.t.TyvarJubilantBrawler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyvar, Jubilant Brawler", 344, Rarity.RARE, mage.cards.t.TyvarJubilantBrawler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tyvar, Jubilant Brawler", 476, Rarity.RARE, mage.cards.t.TyvarJubilantBrawler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Unctus's Retrofitter", 76, Rarity.UNCOMMON, mage.cards.u.UnctussRetrofitter.class));
        cards.add(new SetCardInfo("Unctus, Grand Metatect", 303, Rarity.RARE, mage.cards.u.UnctusGrandMetatect.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Unctus, Grand Metatect", 433, Rarity.RARE, mage.cards.u.UnctusGrandMetatect.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Unctus, Grand Metatect", 75, Rarity.RARE, mage.cards.u.UnctusGrandMetatect.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Unnatural Restoration", 191, Rarity.UNCOMMON, mage.cards.u.UnnaturalRestoration.class));
        cards.add(new SetCardInfo("Urabrask's Anointer", 152, Rarity.UNCOMMON, mage.cards.u.UrabrasksAnointer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urabrask's Anointer", 293, Rarity.UNCOMMON, mage.cards.u.UrabrasksAnointer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urabrask's Anointer", 450, Rarity.UNCOMMON, mage.cards.u.UrabrasksAnointer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urabrask's Forge", 153, Rarity.RARE, mage.cards.u.UrabrasksForge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urabrask's Forge", 387, Rarity.RARE, mage.cards.u.UrabrasksForge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vanish into Eternity", 36, Rarity.COMMON, mage.cards.v.VanishIntoEternity.class));
        cards.add(new SetCardInfo("Vat Emergence", 112, Rarity.UNCOMMON, mage.cards.v.VatEmergence.class));
        cards.add(new SetCardInfo("Vat of Rebirth", 113, Rarity.UNCOMMON, mage.cards.v.VatOfRebirth.class));
        cards.add(new SetCardInfo("Veil of Assimilation", 37, Rarity.UNCOMMON, mage.cards.v.VeilOfAssimilation.class));
        cards.add(new SetCardInfo("Venerated Rotpriest", 192, Rarity.RARE, mage.cards.v.VeneratedRotpriest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Venerated Rotpriest", 392, Rarity.RARE, mage.cards.v.VeneratedRotpriest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Venomous Brutalizer", 193, Rarity.UNCOMMON, mage.cards.v.VenomousBrutalizer.class));
        cards.add(new SetCardInfo("Venser, Corpse Puppet", 219, Rarity.RARE, mage.cards.v.VenserCorpsePuppet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Venser, Corpse Puppet", 324, Rarity.RARE, mage.cards.v.VenserCorpsePuppet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Venser, Corpse Puppet", 477, Rarity.RARE, mage.cards.v.VenserCorpsePuppet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vindictive Flamestoker", 154, Rarity.RARE, mage.cards.v.VindictiveFlamestoker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vindictive Flamestoker", 388, Rarity.RARE, mage.cards.v.VindictiveFlamestoker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Viral Spawning", 194, Rarity.UNCOMMON, mage.cards.v.ViralSpawning.class));
        cards.add(new SetCardInfo("Vivisection Evangelist", 220, Rarity.UNCOMMON, mage.cards.v.VivisectionEvangelist.class));
        cards.add(new SetCardInfo("Vivisurgeon's Insight", 77, Rarity.COMMON, mage.cards.v.VivisurgeonsInsight.class));
        cards.add(new SetCardInfo("Voidwing Hybrid", 221, Rarity.UNCOMMON, mage.cards.v.VoidwingHybrid.class));
        cards.add(new SetCardInfo("Volt Charge", 155, Rarity.COMMON, mage.cards.v.VoltCharge.class));
        cards.add(new SetCardInfo("Vraan, Executioner Thane", 114, Rarity.RARE, mage.cards.v.VraanExecutionerThane.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraan, Executioner Thane", 309, Rarity.RARE, mage.cards.v.VraanExecutionerThane.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraan, Executioner Thane", 441, Rarity.RARE, mage.cards.v.VraanExecutionerThane.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraska's Fall", 116, Rarity.COMMON, mage.cards.v.VraskasFall.class));
        cards.add(new SetCardInfo("Vraska, Betrayal's Sting", 115, Rarity.MYTHIC, mage.cards.v.VraskaBetrayalsSting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraska, Betrayal's Sting", 326, Rarity.MYTHIC, mage.cards.v.VraskaBetrayalsSting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraska, Betrayal's Sting", 337, Rarity.MYTHIC, mage.cards.v.VraskaBetrayalsSting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraska, Betrayal's Sting", 361, Rarity.MYTHIC, mage.cards.v.VraskaBetrayalsSting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraska, Betrayal's Sting", 442, Rarity.MYTHIC, mage.cards.v.VraskaBetrayalsSting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vraska, Betrayal's Sting", 443, Rarity.MYTHIC, mage.cards.v.VraskaBetrayalsSting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vulshok Splitter", 156, Rarity.COMMON, mage.cards.v.VulshokSplitter.class));
        cards.add(new SetCardInfo("Watchful Blisterzoa", 78, Rarity.UNCOMMON, mage.cards.w.WatchfulBlisterzoa.class));
        cards.add(new SetCardInfo("Whisper of the Dross", 117, Rarity.COMMON, mage.cards.w.WhisperOfTheDross.class));
        cards.add(new SetCardInfo("White Sun's Twilight", 377, Rarity.RARE, mage.cards.w.WhiteSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("White Sun's Twilight", 38, Rarity.RARE, mage.cards.w.WhiteSunsTwilight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zealot's Conviction", 39, Rarity.COMMON, mage.cards.z.ZealotsConviction.class));
        cards.add(new SetCardInfo("Zenith Chronicler", 246, Rarity.RARE, mage.cards.z.ZenithChronicler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zenith Chronicler", 399, Rarity.RARE, mage.cards.z.ZenithChronicler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zopandrel, Hunger Dominus", 195, Rarity.MYTHIC, mage.cards.z.ZopandrelHungerDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zopandrel, Hunger Dominus", 315, Rarity.MYTHIC, mage.cards.z.ZopandrelHungerDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zopandrel, Hunger Dominus", 356, Rarity.MYTHIC, mage.cards.z.ZopandrelHungerDominus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zopandrel, Hunger Dominus", 458, Rarity.MYTHIC, mage.cards.z.ZopandrelHungerDominus.class, NON_FULL_USE_VARIOUS));
    }

    @Override
    public BoosterCollator createCollator() {
        return new PhyrexiaAllWillBeOneCollator();
    }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/one.html
// Using Japanese collation for common, no collation for uncommons
// Using 2:1 for each rare:mythic which results in (1/7) 14.29% mythic packs, matching the advertised ~14%
class PhyrexiaAllWillBeOneCollator implements BoosterCollator {
    private final CardRun commonA = new CardRun(true, "54", "251", "44", "77", "243", "49", "228", "45", "231", "55", "260", "58", "60", "238", "65", "187", "54", "253", "59", "252", "52", "44", "224", "62", "251", "50", "139", "48", "236", "77", "238", "59", "53", "253", "65", "50", "187", "60", "228", "48", "260", "55", "251", "53", "231", "58", "252", "49", "243", "45", "224", "52", "236", "54", "139", "62", "44", "252", "58", "48", "238", "55", "243", "59", "139", "52", "260", "62", "54", "231", "50", "228", "44", "253", "77", "224", "49", "251", "65", "60", "236", "53", "187", "45", "228", "55", "52", "253", "50", "260", "77", "236", "58", "238", "45", "252", "65", "139", "49", "187", "59", "243", "48", "62", "231", "60", "53", "224");
    private final CardRun commonB = new CardRun(true, "16", "94", "111", "15", "7", "97", "12", "96", "102", "20", "120", "110", "9", "25", "103", "6", "40", "94", "4", "247", "117", "13", "137", "88", "39", "225", "109", "22", "151", "116", "28", "226", "92", "21", "12", "97", "8", "20", "111", "261", "39", "89", "28", "36", "117", "21", "120", "116", "8", "247", "103", "13", "40", "110", "22", "16", "102", "225", "4", "88", "151", "9", "109", "226", "7", "96", "137", "25", "92", "36", "6", "116", "261", "15", "109", "21", "39", "110", "16", "13", "102", "22", "137", "94", "25", "15", "111", "247", "8", "89", "12", "225", "117", "9", "120", "97", "7", "261", "103", "36", "40", "88", "28", "20", "92", "226", "4", "96", "151", "6", "89");
    private final CardRun commonC = new CardRun(true, "81", "165", "147", "188", "286", "126", "162", "173", "130", "180", "66", "122", "164", "157", "123", "160", "85", "156", "174", "237", "121", "170", "130", "188", "123", "185", "290", "122", "181", "179", "133", "157", "81", "135", "180", "182", "148", "66", "170", "126", "32", "162", "156", "235", "173", "141", "183", "80", "147", "174", "160", "131", "165", "164", "135", "32", "177", "155", "289", "180", "121", "181", "80", "131", "179", "235", "133", "188", "81", "130", "170", "121", "174", "80", "123", "177", "148", "182", "292", "165", "86", "141", "160", "237", "155", "185", "173", "148", "235", "164", "122", "287", "162", "135", "86", "157", "156", "183", "141", "177", "237", "133", "179", "185", "126", "85", "295", "155", "182", "183", "131");
    private final CardRun uncommon = new CardRun(false, "1", "79", "2", "3", "158", "41", "223", "119", "83", "5", "197", "124", "161", "198", "199", "87", "127", "200", "46", "91", "167", "168", "129", "93", "51", "132", "134", "136", "14", "230", "171", "172", "17", "18", "140", "64", "234", "142", "99", "212", "100", "101", "176", "26", "143", "178", "29", "30", "239", "106", "144", "67", "31", "146", "240", "107", "215", "68", "108", "216", "35", "184", "217", "69", "70", "72", "73", "74", "190", "76", "191", "152", "112", "113", "37", "193", "194", "220", "221", "78");
    private final CardRun rare = new CardRun(false, "118", "82", "82", "222", "222", "196", "248", "248", "84", "84", "42", "42", "159", "159", "43", "43", "125", "163", "163", "249", "249", "250", "250", "128", "128", "90", "10", "47", "47", "166", "166", "201", "201", "95", "95", "202", "202", "229", "229", "169", "169", "56", "57", "203", "203", "204", "204", "98", "98", "205", "205", "19", "19", "206", "206", "138", "138", "207", "208", "208", "209", "209", "61", "61", "210", "210", "63", "63", "232", "232", "254", "254", "23", "233", "233", "211", "175", "24", "24", "213", "213", "104", "104", "105", "27", "257", "257", "145", "145", "214", "214", "258", "258", "33", "33", "34", "34", "149", "149", "150", "241", "241", "242", "244", "245", "245", "71", "11", "11", "227", "227", "255", "255", "256", "256", "259", "259", "186", "186", "189", "218", "218", "75", "75", "153", "153", "192", "192", "219", "219", "154", "154", "114", "114", "115", "38", "38", "246", "246", "195");
    private final CardRun land = new CardRun(false, "262", "263", "264", "265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276", "365", "366", "367", "368", "369");

    private final BoosterStructure AABBBBCCCC = new BoosterStructure(
            commonA, commonA,
            commonB, commonB, commonB, commonB,
            commonC, commonC, commonC, commonC
    );
    private final BoosterStructure AAABBBCCCC = new BoosterStructure(
            commonA, commonA, commonA,
            commonB, commonB, commonB,
            commonC, commonC, commonC, commonC
    );
    private final BoosterStructure AAABBBBCCC = new BoosterStructure(
            commonA, commonA, commonA,
            commonB, commonB, commonB, commonB,
            commonC, commonC, commonC
    );
    private final BoosterStructure U3 = new BoosterStructure(uncommon, uncommon, uncommon);
    private final BoosterStructure R1 = new BoosterStructure(rare);
    private final BoosterStructure L1 = new BoosterStructure(land);

    // In order for equal numbers of each common to exist, the average booster must contain:
    // 2.67 A commons (270 / 101)
    // 3.66 B commons (370 / 101)
    // 3.66 C commons (370 / 101)
    private final RarityConfiguration commonRuns = new RarityConfiguration(
            AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC,
            AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC,
            AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC,
            AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC,
            AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC,
            AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC, AABBBBCCCC,
            AABBBBCCCC, AABBBBCCCC, AABBBBCCCC,
            AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC,
            AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC,
            AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC,
            AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC,
            AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC,
            AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC,
            AAABBBCCCC, AAABBBCCCC, AAABBBCCCC, AAABBBCCCC,
            AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC,
            AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC,
            AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC,
            AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC,
            AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC,
            AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC,
            AAABBBBCCC, AAABBBBCCC, AAABBBBCCC, AAABBBBCCC
    );

    private final RarityConfiguration uncommonRuns = new RarityConfiguration(U3);
    private final RarityConfiguration rareRuns = new RarityConfiguration(R1);
    private final RarityConfiguration landRuns = new RarityConfiguration(L1);

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        booster.addAll(commonRuns.getNext().makeRun());
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(rareRuns.getNext().makeRun());
        booster.addAll(landRuns.getNext().makeRun());
        return booster;
    }
}

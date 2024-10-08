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
 * @author North
 */
public final class Lorwyn extends ExpansionSet {

    private static final Lorwyn instance = new Lorwyn();

    public static Lorwyn getInstance() {
        return instance;
    }

    private Lorwyn() {
        super("Lorwyn", "LRW", ExpansionSet.buildDate(2007, 10, 12), SetType.EXPANSION);
        this.blockName = "Lorwyn";
        this.hasBoosters = true;
        this.rotationSet = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Adder-Staff Boggart", 148, Rarity.COMMON, mage.cards.a.AdderStaffBoggart.class));
        cards.add(new SetCardInfo("Aethersnipe", 50, Rarity.COMMON, mage.cards.a.Aethersnipe.class));
        cards.add(new SetCardInfo("Ajani Goldmane", 1, Rarity.RARE, mage.cards.a.AjaniGoldmane.class));
        cards.add(new SetCardInfo("Amoeboid Changeling", 51, Rarity.COMMON, mage.cards.a.AmoeboidChangeling.class));
        cards.add(new SetCardInfo("Ancient Amphitheater", 266, Rarity.RARE, mage.cards.a.AncientAmphitheater.class));
        cards.add(new SetCardInfo("Aquitect's Will", 52, Rarity.COMMON, mage.cards.a.AquitectsWill.class));
        cards.add(new SetCardInfo("Arbiter of Knollridge", 2, Rarity.RARE, mage.cards.a.ArbiterOfKnollridge.class));
        cards.add(new SetCardInfo("Ashling's Prerogative", 150, Rarity.RARE, mage.cards.a.AshlingsPrerogative.class));
        cards.add(new SetCardInfo("Ashling the Pilgrim", 149, Rarity.RARE, mage.cards.a.AshlingThePilgrim.class));
        cards.add(new SetCardInfo("Auntie's Hovel", 267, Rarity.RARE, mage.cards.a.AuntiesHovel.class));
        cards.add(new SetCardInfo("Austere Command", 3, Rarity.RARE, mage.cards.a.AustereCommand.class));
        cards.add(new SetCardInfo("Avian Changeling", 4, Rarity.COMMON, mage.cards.a.AvianChangeling.class));
        cards.add(new SetCardInfo("Axegrinder Giant", 151, Rarity.COMMON, mage.cards.a.AxegrinderGiant.class));
        cards.add(new SetCardInfo("Battle Mastery", 5, Rarity.UNCOMMON, mage.cards.b.BattleMastery.class));
        cards.add(new SetCardInfo("Battlewand Oak", 197, Rarity.COMMON, mage.cards.b.BattlewandOak.class));
        cards.add(new SetCardInfo("Benthicore", 53, Rarity.UNCOMMON, mage.cards.b.Benthicore.class));
        cards.add(new SetCardInfo("Black Poplar Shaman", 99, Rarity.COMMON, mage.cards.b.BlackPoplarShaman.class));
        cards.add(new SetCardInfo("Blades of Velis Vel", 152, Rarity.COMMON, mage.cards.b.BladesOfVelisVel.class));
        cards.add(new SetCardInfo("Blind-Spot Giant", 153, Rarity.COMMON, mage.cards.b.BlindSpotGiant.class));
        cards.add(new SetCardInfo("Boggart Birth Rite", 101, Rarity.COMMON, mage.cards.b.BoggartBirthRite.class));
        cards.add(new SetCardInfo("Boggart Forager", 154, Rarity.COMMON, mage.cards.b.BoggartForager.class));
        cards.add(new SetCardInfo("Boggart Harbinger", 102, Rarity.UNCOMMON, mage.cards.b.BoggartHarbinger.class));
        cards.add(new SetCardInfo("Boggart Loggers", 103, Rarity.COMMON, mage.cards.b.BoggartLoggers.class));
        cards.add(new SetCardInfo("Boggart Mob", 104, Rarity.RARE, mage.cards.b.BoggartMob.class));
        cards.add(new SetCardInfo("Boggart Shenanigans", 155, Rarity.UNCOMMON, mage.cards.b.BoggartShenanigans.class));
        cards.add(new SetCardInfo("Boggart Sprite-Chaser", 156, Rarity.COMMON, mage.cards.b.BoggartSpriteChaser.class));
        cards.add(new SetCardInfo("Bog Hoodlums", 100, Rarity.COMMON, mage.cards.b.BogHoodlums.class));
        cards.add(new SetCardInfo("Bog-Strider Ash", 198, Rarity.COMMON, mage.cards.b.BogStriderAsh.class));
        cards.add(new SetCardInfo("Briarhorn", 199, Rarity.UNCOMMON, mage.cards.b.Briarhorn.class));
        cards.add(new SetCardInfo("Brigid, Hero of Kinsbaile", 6, Rarity.RARE, mage.cards.b.BrigidHeroOfKinsbaile.class));
        cards.add(new SetCardInfo("Brion Stoutarm", 246, Rarity.RARE, mage.cards.b.BrionStoutarm.class));
        cards.add(new SetCardInfo("Broken Ambitions", 54, Rarity.COMMON, mage.cards.b.BrokenAmbitions.class));
        cards.add(new SetCardInfo("Burrenton Forge-Tender", 7, Rarity.UNCOMMON, mage.cards.b.BurrentonForgeTender.class));
        cards.add(new SetCardInfo("Cairn Wanderer", 105, Rarity.RARE, mage.cards.c.CairnWanderer.class));
        cards.add(new SetCardInfo("Captivating Glance", 55, Rarity.UNCOMMON, mage.cards.c.CaptivatingGlance.class));
        cards.add(new SetCardInfo("Caterwauling Boggart", 157, Rarity.COMMON, mage.cards.c.CaterwaulingBoggart.class));
        cards.add(new SetCardInfo("Ceaseless Searblades", 158, Rarity.UNCOMMON, mage.cards.c.CeaselessSearblades.class));
        cards.add(new SetCardInfo("Cenn's Heir", 8, Rarity.COMMON, mage.cards.c.CennsHeir.class));
        cards.add(new SetCardInfo("Chandra Nalaar", 159, Rarity.RARE, mage.cards.c.ChandraNalaar.class));
        cards.add(new SetCardInfo("Changeling Berserker", 160, Rarity.UNCOMMON, mage.cards.c.ChangelingBerserker.class));
        cards.add(new SetCardInfo("Changeling Hero", 9, Rarity.UNCOMMON, mage.cards.c.ChangelingHero.class));
        cards.add(new SetCardInfo("Changeling Titan", 200, Rarity.UNCOMMON, mage.cards.c.ChangelingTitan.class));
        cards.add(new SetCardInfo("Cloudcrown Oak", 201, Rarity.COMMON, mage.cards.c.CloudcrownOak.class));
        cards.add(new SetCardInfo("Cloudgoat Ranger", 10, Rarity.UNCOMMON, mage.cards.c.CloudgoatRanger.class));
        cards.add(new SetCardInfo("Cloudthresher", 202, Rarity.RARE, mage.cards.c.Cloudthresher.class));
        cards.add(new SetCardInfo("Colfenor's Plans", 106, Rarity.RARE, mage.cards.c.ColfenorsPlans.class));
        cards.add(new SetCardInfo("Colfenor's Urn", 254, Rarity.RARE, mage.cards.c.ColfenorsUrn.class));
        cards.add(new SetCardInfo("Consuming Bonfire", 161, Rarity.COMMON, mage.cards.c.ConsumingBonfire.class));
        cards.add(new SetCardInfo("Crib Swap", 11, Rarity.UNCOMMON, mage.cards.c.CribSwap.class));
        cards.add(new SetCardInfo("Crush Underfoot", 162, Rarity.UNCOMMON, mage.cards.c.CrushUnderfoot.class));
        cards.add(new SetCardInfo("Cryptic Command", 56, Rarity.RARE, mage.cards.c.CrypticCommand.class));
        cards.add(new SetCardInfo("Dauntless Dourbark", 203, Rarity.RARE, mage.cards.d.DauntlessDourbark.class));
        cards.add(new SetCardInfo("Dawnfluke", 12, Rarity.COMMON, mage.cards.d.Dawnfluke.class));
        cards.add(new SetCardInfo("Deathrender", 255, Rarity.RARE, mage.cards.d.Deathrender.class));
        cards.add(new SetCardInfo("Deeptread Merrow", 57, Rarity.COMMON, mage.cards.d.DeeptreadMerrow.class));
        cards.add(new SetCardInfo("Dolmen Gate", 256, Rarity.RARE, mage.cards.d.DolmenGate.class));
        cards.add(new SetCardInfo("Doran, the Siege Tower", 247, Rarity.RARE, mage.cards.d.DoranTheSiegeTower.class));
        cards.add(new SetCardInfo("Dread", 107, Rarity.RARE, mage.cards.d.Dread.class));
        cards.add(new SetCardInfo("Dreamspoiler Witches", 108, Rarity.COMMON, mage.cards.d.DreamspoilerWitches.class));
        cards.add(new SetCardInfo("Drowner of Secrets", 58, Rarity.UNCOMMON, mage.cards.d.DrownerOfSecrets.class));
        cards.add(new SetCardInfo("Ego Erasure", 59, Rarity.UNCOMMON, mage.cards.e.EgoErasure.class));
        cards.add(new SetCardInfo("Elvish Branchbender", 204, Rarity.COMMON, mage.cards.e.ElvishBranchbender.class));
        cards.add(new SetCardInfo("Elvish Eulogist", 205, Rarity.COMMON, mage.cards.e.ElvishEulogist.class));
        cards.add(new SetCardInfo("Elvish Handservant", 206, Rarity.COMMON, mage.cards.e.ElvishHandservant.class));
        cards.add(new SetCardInfo("Elvish Harbinger", 207, Rarity.UNCOMMON, mage.cards.e.ElvishHarbinger.class));
        cards.add(new SetCardInfo("Elvish Promenade", 208, Rarity.UNCOMMON, mage.cards.e.ElvishPromenade.class));
        cards.add(new SetCardInfo("Entangling Trap", 13, Rarity.UNCOMMON, mage.cards.e.EntanglingTrap.class));
        cards.add(new SetCardInfo("Epic Proportions", 209, Rarity.RARE, mage.cards.e.EpicProportions.class));
        cards.add(new SetCardInfo("Ethereal Whiskergill", 60, Rarity.UNCOMMON, mage.cards.e.EtherealWhiskergill.class));
        cards.add(new SetCardInfo("Exiled Boggart", 109, Rarity.COMMON, mage.cards.e.ExiledBoggart.class));
        cards.add(new SetCardInfo("Eyeblight's Ending", 110, Rarity.COMMON, mage.cards.e.EyeblightsEnding.class));
        cards.add(new SetCardInfo("Eyes of the Wisent", 210, Rarity.RARE, mage.cards.e.EyesOfTheWisent.class));
        cards.add(new SetCardInfo("Facevaulter", 111, Rarity.COMMON, mage.cards.f.Facevaulter.class));
        cards.add(new SetCardInfo("Faerie Harbinger", 61, Rarity.UNCOMMON, mage.cards.f.FaerieHarbinger.class));
        cards.add(new SetCardInfo("Faerie Tauntings", 112, Rarity.UNCOMMON, mage.cards.f.FaerieTauntings.class));
        cards.add(new SetCardInfo("Faerie Trickery", 62, Rarity.COMMON, mage.cards.f.FaerieTrickery.class));
        cards.add(new SetCardInfo("Fallowsage", 63, Rarity.UNCOMMON, mage.cards.f.Fallowsage.class));
        cards.add(new SetCardInfo("Familiar's Ruse", 64, Rarity.UNCOMMON, mage.cards.f.FamiliarsRuse.class));
        cards.add(new SetCardInfo("Fathom Trawl", 65, Rarity.RARE, mage.cards.f.FathomTrawl.class));
        cards.add(new SetCardInfo("Faultgrinder", 163, Rarity.COMMON, mage.cards.f.Faultgrinder.class));
        cards.add(new SetCardInfo("Favor of the Mighty", 14, Rarity.RARE, mage.cards.f.FavorOfTheMighty.class));
        cards.add(new SetCardInfo("Fertile Ground", 211, Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Final Revels", 113, Rarity.UNCOMMON, mage.cards.f.FinalRevels.class));
        cards.add(new SetCardInfo("Fire-Belly Changeling", 164, Rarity.COMMON, mage.cards.f.FireBellyChangeling.class));
        cards.add(new SetCardInfo("Fistful of Force", 212, Rarity.COMMON, mage.cards.f.FistfulOfForce.class));
        cards.add(new SetCardInfo("Flamekin Bladewhirl", 165, Rarity.UNCOMMON, mage.cards.f.FlamekinBladewhirl.class));
        cards.add(new SetCardInfo("Flamekin Brawler", 166, Rarity.COMMON, mage.cards.f.FlamekinBrawler.class));
        cards.add(new SetCardInfo("Flamekin Harbinger", 167, Rarity.UNCOMMON, mage.cards.f.FlamekinHarbinger.class));
        cards.add(new SetCardInfo("Flamekin Spitfire", 168, Rarity.UNCOMMON, mage.cards.f.FlamekinSpitfire.class));
        cards.add(new SetCardInfo("Fodder Launch", 114, Rarity.UNCOMMON, mage.cards.f.FodderLaunch.class));
        cards.add(new SetCardInfo("Footbottom Feast", 115, Rarity.COMMON, mage.cards.f.FootbottomFeast.class));
        cards.add(new SetCardInfo("Forced Fruition", 66, Rarity.RARE, mage.cards.f.ForcedFruition.class));
        cards.add(new SetCardInfo("Forest", 298, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 299, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 300, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 301, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gaddock Teeg", 248, Rarity.RARE, mage.cards.g.GaddockTeeg.class));
        cards.add(new SetCardInfo("Galepowder Mage", 15, Rarity.RARE, mage.cards.g.GalepowderMage.class));
        cards.add(new SetCardInfo("Garruk Wildspeaker", 213, Rarity.RARE, mage.cards.g.GarrukWildspeaker.class));
        cards.add(new SetCardInfo("Ghostly Changeling", 116, Rarity.UNCOMMON, mage.cards.g.GhostlyChangeling.class));
        cards.add(new SetCardInfo("Giant Harbinger", 169, Rarity.UNCOMMON, mage.cards.g.GiantHarbinger.class));
        cards.add(new SetCardInfo("Giant's Ire", 170, Rarity.COMMON, mage.cards.g.GiantsIre.class));
        cards.add(new SetCardInfo("Gilt-Leaf Ambush", 214, Rarity.COMMON, mage.cards.g.GiltLeafAmbush.class));
        cards.add(new SetCardInfo("Gilt-Leaf Palace", 268, Rarity.RARE, mage.cards.g.GiltLeafPalace.class));
        cards.add(new SetCardInfo("Gilt-Leaf Seer", 215, Rarity.COMMON, mage.cards.g.GiltLeafSeer.class));
        cards.add(new SetCardInfo("Glarewielder", 171, Rarity.UNCOMMON, mage.cards.g.Glarewielder.class));
        cards.add(new SetCardInfo("Glen Elendra Pranksters", 67, Rarity.UNCOMMON, mage.cards.g.GlenElendraPranksters.class));
        cards.add(new SetCardInfo("Glimmerdust Nap", 68, Rarity.COMMON, mage.cards.g.GlimmerdustNap.class));
        cards.add(new SetCardInfo("Goatnapper", 172, Rarity.UNCOMMON, mage.cards.g.Goatnapper.class));
        cards.add(new SetCardInfo("Goldmeadow Dodger", 16, Rarity.COMMON, mage.cards.g.GoldmeadowDodger.class));
        cards.add(new SetCardInfo("Goldmeadow Harrier", 17, Rarity.COMMON, mage.cards.g.GoldmeadowHarrier.class));
        cards.add(new SetCardInfo("Goldmeadow Stalwart", 18, Rarity.UNCOMMON, mage.cards.g.GoldmeadowStalwart.class));
        cards.add(new SetCardInfo("Guardian of Cloverdell", 216, Rarity.UNCOMMON, mage.cards.g.GuardianOfCloverdell.class));
        cards.add(new SetCardInfo("Guile", 69, Rarity.RARE, mage.cards.g.Guile.class));
        cards.add(new SetCardInfo("Hamletback Goliath", 173, Rarity.RARE, mage.cards.h.HamletbackGoliath.class));
        cards.add(new SetCardInfo("Harpoon Sniper", 19, Rarity.UNCOMMON, mage.cards.h.HarpoonSniper.class));
        cards.add(new SetCardInfo("Heal the Scars", 217, Rarity.COMMON, mage.cards.h.HealTheScars.class));
        cards.add(new SetCardInfo("Hearthcage Giant", 174, Rarity.UNCOMMON, mage.cards.h.HearthcageGiant.class));
        cards.add(new SetCardInfo("Heat Shimmer", 175, Rarity.RARE, mage.cards.h.HeatShimmer.class));
        cards.add(new SetCardInfo("Herbal Poultice", 257, Rarity.COMMON, mage.cards.h.HerbalPoultice.class));
        cards.add(new SetCardInfo("Hillcomber Giant", 20, Rarity.COMMON, mage.cards.h.HillcomberGiant.class));
        cards.add(new SetCardInfo("Hoarder's Greed", 117, Rarity.UNCOMMON, mage.cards.h.HoardersGreed.class));
        cards.add(new SetCardInfo("Hoofprints of the Stag", 21, Rarity.RARE, mage.cards.h.HoofprintsOfTheStag.class));
        cards.add(new SetCardInfo("Horde of Notions", 249, Rarity.RARE, mage.cards.h.HordeOfNotions.class));
        cards.add(new SetCardInfo("Hornet Harasser", 118, Rarity.COMMON, mage.cards.h.HornetHarasser.class));
        cards.add(new SetCardInfo("Hostility", 176, Rarity.RARE, mage.cards.h.Hostility.class));
        cards.add(new SetCardInfo("Howltooth Hollow", 269, Rarity.RARE, mage.cards.h.HowltoothHollow.class));
        cards.add(new SetCardInfo("Hunt Down", 218, Rarity.COMMON, mage.cards.h.HuntDown.class));
        cards.add(new SetCardInfo("Hunter of Eyeblights", 119, Rarity.UNCOMMON, mage.cards.h.HunterOfEyeblights.class));
        cards.add(new SetCardInfo("Hurly-Burly", 177, Rarity.COMMON, mage.cards.h.HurlyBurly.class));
        cards.add(new SetCardInfo("Immaculate Magistrate", 219, Rarity.RARE, mage.cards.i.ImmaculateMagistrate.class));
        cards.add(new SetCardInfo("Imperious Perfect", 220, Rarity.UNCOMMON, mage.cards.i.ImperiousPerfect.class));
        cards.add(new SetCardInfo("Incandescent Soulstoke", 178, Rarity.RARE, mage.cards.i.IncandescentSoulstoke.class));
        cards.add(new SetCardInfo("Incendiary Command", 179, Rarity.RARE, mage.cards.i.IncendiaryCommand.class));
        cards.add(new SetCardInfo("Incremental Growth", 221, Rarity.UNCOMMON, mage.cards.i.IncrementalGrowth.class));
        cards.add(new SetCardInfo("Ingot Chewer", 180, Rarity.COMMON, mage.cards.i.IngotChewer.class));
        cards.add(new SetCardInfo("Inkfathom Divers", 70, Rarity.COMMON, mage.cards.i.InkfathomDivers.class));
        cards.add(new SetCardInfo("Inner-Flame Acolyte", 181, Rarity.COMMON, mage.cards.i.InnerFlameAcolyte.class));
        cards.add(new SetCardInfo("Inner-Flame Igniter", 182, Rarity.UNCOMMON, mage.cards.i.InnerFlameIgniter.class));
        cards.add(new SetCardInfo("Island", 286, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 287, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 288, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 289, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace Beleren", 71, Rarity.RARE, mage.cards.j.JaceBeleren.class));
        cards.add(new SetCardInfo("Jagged-Scar Archers", 222, Rarity.UNCOMMON, mage.cards.j.JaggedScarArchers.class));
        cards.add(new SetCardInfo("Judge of Currents", 22, Rarity.COMMON, mage.cards.j.JudgeOfCurrents.class));
        cards.add(new SetCardInfo("Kinsbaile Balloonist", 23, Rarity.COMMON, mage.cards.k.KinsbaileBalloonist.class));
        cards.add(new SetCardInfo("Kinsbaile Skirmisher", 24, Rarity.COMMON, mage.cards.k.KinsbaileSkirmisher.class));
        cards.add(new SetCardInfo("Kithkin Daggerdare", 223, Rarity.COMMON, mage.cards.k.KithkinDaggerdare.class));
        cards.add(new SetCardInfo("Kithkin Greatheart", 25, Rarity.COMMON, mage.cards.k.KithkinGreatheart.class));
        cards.add(new SetCardInfo("Kithkin Harbinger", 26, Rarity.UNCOMMON, mage.cards.k.KithkinHarbinger.class));
        cards.add(new SetCardInfo("Kithkin Healer", 27, Rarity.COMMON, mage.cards.k.KithkinHealer.class));
        cards.add(new SetCardInfo("Kithkin Mourncaller", 224, Rarity.UNCOMMON, mage.cards.k.KithkinMourncaller.class));
        cards.add(new SetCardInfo("Knight of Meadowgrain", 28, Rarity.UNCOMMON, mage.cards.k.KnightOfMeadowgrain.class));
        cards.add(new SetCardInfo("Knucklebone Witch", 120, Rarity.RARE, mage.cards.k.KnuckleboneWitch.class));
        cards.add(new SetCardInfo("Lace with Moonglove", 225, Rarity.COMMON, mage.cards.l.LaceWithMoonglove.class));
        cards.add(new SetCardInfo("Lairwatch Giant", 29, Rarity.COMMON, mage.cards.l.LairwatchGiant.class));
        cards.add(new SetCardInfo("Lammastide Weave", 226, Rarity.UNCOMMON, mage.cards.l.LammastideWeave.class));
        cards.add(new SetCardInfo("Lash Out", 183, Rarity.COMMON, mage.cards.l.LashOut.class));
        cards.add(new SetCardInfo("Leaf Gilder", 227, Rarity.COMMON, mage.cards.l.LeafGilder.class));
        cards.add(new SetCardInfo("Lignify", 228, Rarity.COMMON, mage.cards.l.Lignify.class));
        cards.add(new SetCardInfo("Liliana Vess", 121, Rarity.RARE, mage.cards.l.LilianaVess.class));
        cards.add(new SetCardInfo("Lowland Oaf", 184, Rarity.COMMON, mage.cards.l.LowlandOaf.class));
        cards.add(new SetCardInfo("Lys Alana Huntmaster", 229, Rarity.COMMON, mage.cards.l.LysAlanaHuntmaster.class));
        cards.add(new SetCardInfo("Lys Alana Scarblade", 122, Rarity.UNCOMMON, mage.cards.l.LysAlanaScarblade.class));
        cards.add(new SetCardInfo("Mad Auntie", 123, Rarity.RARE, mage.cards.m.MadAuntie.class));
        cards.add(new SetCardInfo("Makeshift Mannequin", 124, Rarity.UNCOMMON, mage.cards.m.MakeshiftMannequin.class));
        cards.add(new SetCardInfo("Marsh Flitter", 125, Rarity.UNCOMMON, mage.cards.m.MarshFlitter.class));
        cards.add(new SetCardInfo("Masked Admirers", 230, Rarity.RARE, mage.cards.m.MaskedAdmirers.class));
        cards.add(new SetCardInfo("Merrow Commerce", 72, Rarity.UNCOMMON, mage.cards.m.MerrowCommerce.class));
        cards.add(new SetCardInfo("Merrow Harbinger", 73, Rarity.UNCOMMON, mage.cards.m.MerrowHarbinger.class));
        cards.add(new SetCardInfo("Merrow Reejerey", 74, Rarity.UNCOMMON, mage.cards.m.MerrowReejerey.class));
        cards.add(new SetCardInfo("Militia's Pride", 30, Rarity.RARE, mage.cards.m.MilitiasPride.class));
        cards.add(new SetCardInfo("Mirror Entity", 31, Rarity.RARE, mage.cards.m.MirrorEntity.class));
        cards.add(new SetCardInfo("Mistbind Clique", 75, Rarity.RARE, mage.cards.m.MistbindClique.class));
        cards.add(new SetCardInfo("Moonglove Extract", 258, Rarity.COMMON, mage.cards.m.MoongloveExtract.class));
        cards.add(new SetCardInfo("Moonglove Winnower", 126, Rarity.COMMON, mage.cards.m.MoongloveWinnower.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 270, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Mountain", 294, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 295, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 296, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 297, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mournwhelk", 127, Rarity.COMMON, mage.cards.m.Mournwhelk.class));
        cards.add(new SetCardInfo("Mudbutton Torchrunner", 185, Rarity.COMMON, mage.cards.m.MudbuttonTorchrunner.class));
        cards.add(new SetCardInfo("Mulldrifter", 76, Rarity.COMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Nameless Inversion", 128, Rarity.COMMON, mage.cards.n.NamelessInversion.class));
        cards.add(new SetCardInfo("Nath of the Gilt-Leaf", 250, Rarity.RARE, mage.cards.n.NathOfTheGiltLeaf.class));
        cards.add(new SetCardInfo("Nath's Buffoon", 129, Rarity.COMMON, mage.cards.n.NathsBuffoon.class));
        cards.add(new SetCardInfo("Nath's Elite", 231, Rarity.COMMON, mage.cards.n.NathsElite.class));
        cards.add(new SetCardInfo("Neck Snap", 32, Rarity.COMMON, mage.cards.n.NeckSnap.class));
        cards.add(new SetCardInfo("Nectar Faerie", 130, Rarity.UNCOMMON, mage.cards.n.NectarFaerie.class));
        cards.add(new SetCardInfo("Needle Drop", 186, Rarity.COMMON, mage.cards.n.NeedleDrop.class));
        cards.add(new SetCardInfo("Nettlevine Blight", 131, Rarity.RARE, mage.cards.n.NettlevineBlight.class));
        cards.add(new SetCardInfo("Nightshade Stinger", 132, Rarity.COMMON, mage.cards.n.NightshadeStinger.class));
        cards.add(new SetCardInfo("Nova Chaser", 187, Rarity.RARE, mage.cards.n.NovaChaser.class));
        cards.add(new SetCardInfo("Oaken Brawler", 33, Rarity.COMMON, mage.cards.o.OakenBrawler.class));
        cards.add(new SetCardInfo("Oakgnarl Warrior", 232, Rarity.COMMON, mage.cards.o.OakgnarlWarrior.class));
        cards.add(new SetCardInfo("Oblivion Ring", 34, Rarity.COMMON, mage.cards.o.OblivionRing.class));
        cards.add(new SetCardInfo("Oona's Prowler", 133, Rarity.RARE, mage.cards.o.OonasProwler.class));
        cards.add(new SetCardInfo("Paperfin Rascal", 77, Rarity.COMMON, mage.cards.p.PaperfinRascal.class));
        cards.add(new SetCardInfo("Peppersmoke", 134, Rarity.COMMON, mage.cards.p.Peppersmoke.class));
        cards.add(new SetCardInfo("Pestermite", 78, Rarity.COMMON, mage.cards.p.Pestermite.class));
        cards.add(new SetCardInfo("Plains", 282, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 283, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 284, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 285, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plover Knights", 35, Rarity.COMMON, mage.cards.p.PloverKnights.class));
        cards.add(new SetCardInfo("Pollen Lullaby", 36, Rarity.UNCOMMON, mage.cards.p.PollenLullaby.class));
        cards.add(new SetCardInfo("Ponder", 79, Rarity.COMMON, mage.cards.p.Ponder.class));
        cards.add(new SetCardInfo("Primal Command", 233, Rarity.RARE, mage.cards.p.PrimalCommand.class));
        cards.add(new SetCardInfo("Profane Command", 135, Rarity.RARE, mage.cards.p.ProfaneCommand.class));
        cards.add(new SetCardInfo("Protective Bubble", 80, Rarity.COMMON, mage.cards.p.ProtectiveBubble.class));
        cards.add(new SetCardInfo("Prowess of the Fair", 136, Rarity.UNCOMMON, mage.cards.p.ProwessOfTheFair.class));
        cards.add(new SetCardInfo("Purity", 37, Rarity.RARE, mage.cards.p.Purity.class));
        cards.add(new SetCardInfo("Quill-Slinger Boggart", 137, Rarity.COMMON, mage.cards.q.QuillSlingerBoggart.class));
        cards.add(new SetCardInfo("Rebellion of the Flamekin", 188, Rarity.UNCOMMON, mage.cards.r.RebellionOfTheFlamekin.class));
        cards.add(new SetCardInfo("Ringskipper", 81, Rarity.COMMON, mage.cards.r.Ringskipper.class));
        cards.add(new SetCardInfo("Rings of Brighthearth", 259, Rarity.RARE, mage.cards.r.RingsOfBrighthearth.class));
        cards.add(new SetCardInfo("Rootgrapple", 234, Rarity.COMMON, mage.cards.r.Rootgrapple.class));
        cards.add(new SetCardInfo("Runed Stalactite", 260, Rarity.COMMON, mage.cards.r.RunedStalactite.class));
        cards.add(new SetCardInfo("Scarred Vinebreeder", 138, Rarity.COMMON, mage.cards.s.ScarredVinebreeder.class));
        cards.add(new SetCardInfo("Scattering Stroke", 82, Rarity.UNCOMMON, mage.cards.s.ScatteringStroke.class));
        cards.add(new SetCardInfo("Scion of Oona", 83, Rarity.RARE, mage.cards.s.ScionOfOona.class));
        cards.add(new SetCardInfo("Secluded Glen", 271, Rarity.RARE, mage.cards.s.SecludedGlen.class));
        cards.add(new SetCardInfo("Seedguide Ash", 235, Rarity.UNCOMMON, mage.cards.s.SeedguideAsh.class));
        cards.add(new SetCardInfo("Sentinels of Glen Elendra", 84, Rarity.COMMON, mage.cards.s.SentinelsOfGlenElendra.class));
        cards.add(new SetCardInfo("Sentry Oak", 38, Rarity.UNCOMMON, mage.cards.s.SentryOak.class));
        cards.add(new SetCardInfo("Shapesharer", 85, Rarity.RARE, mage.cards.s.Shapesharer.class));
        cards.add(new SetCardInfo("Shelldock Isle", 272, Rarity.RARE, mage.cards.s.ShelldockIsle.class));
        cards.add(new SetCardInfo("Shields of Velis Vel", 39, Rarity.COMMON, mage.cards.s.ShieldsOfVelisVel.class));
        cards.add(new SetCardInfo("Shimmering Grotto", 273, Rarity.COMMON, mage.cards.s.ShimmeringGrotto.class));
        cards.add(new SetCardInfo("Shriekmaw", 139, Rarity.UNCOMMON, mage.cards.s.Shriekmaw.class));
        cards.add(new SetCardInfo("Silvergill Adept", 86, Rarity.UNCOMMON, mage.cards.s.SilvergillAdept.class));
        cards.add(new SetCardInfo("Silvergill Douser", 87, Rarity.COMMON, mage.cards.s.SilvergillDouser.class));
        cards.add(new SetCardInfo("Skeletal Changeling", 140, Rarity.COMMON, mage.cards.s.SkeletalChangeling.class));
        cards.add(new SetCardInfo("Smokebraider", 189, Rarity.COMMON, mage.cards.s.Smokebraider.class));
        cards.add(new SetCardInfo("Soaring Hope", 40, Rarity.COMMON, mage.cards.s.SoaringHope.class));
        cards.add(new SetCardInfo("Soulbright Flamekin", 190, Rarity.COMMON, mage.cards.s.SoulbrightFlamekin.class));
        cards.add(new SetCardInfo("Sower of Temptation", 88, Rarity.RARE, mage.cards.s.SowerOfTemptation.class));
        cards.add(new SetCardInfo("Spellstutter Sprite", 89, Rarity.COMMON, mage.cards.s.SpellstutterSprite.class));
        cards.add(new SetCardInfo("Spiderwig Boggart", 141, Rarity.COMMON, mage.cards.s.SpiderwigBoggart.class));
        cards.add(new SetCardInfo("Spinerock Knoll", 274, Rarity.RARE, mage.cards.s.SpinerockKnoll.class));
        cards.add(new SetCardInfo("Spring Cleaning", 236, Rarity.COMMON, mage.cards.s.SpringCleaning.class));
        cards.add(new SetCardInfo("Springjack Knight", 41, Rarity.COMMON, mage.cards.s.SpringjackKnight.class));
        cards.add(new SetCardInfo("Springleaf Drum", 261, Rarity.COMMON, mage.cards.s.SpringleafDrum.class));
        cards.add(new SetCardInfo("Squeaking Pie Sneak", 142, Rarity.UNCOMMON, mage.cards.s.SqueakingPieSneak.class));
        cards.add(new SetCardInfo("Stinkdrinker Daredevil", 191, Rarity.COMMON, mage.cards.s.StinkdrinkerDaredevil.class));
        cards.add(new SetCardInfo("Stonybrook Angler", 90, Rarity.COMMON, mage.cards.s.StonybrookAngler.class));
        cards.add(new SetCardInfo("Streambed Aquitects", 91, Rarity.COMMON, mage.cards.s.StreambedAquitects.class));
        cards.add(new SetCardInfo("Summon the School", 42, Rarity.UNCOMMON, mage.cards.s.SummonTheSchool.class));
        cards.add(new SetCardInfo("Sunrise Sovereign", 192, Rarity.RARE, mage.cards.s.SunriseSovereign.class));
        cards.add(new SetCardInfo("Surge of Thoughtweft", 43, Rarity.COMMON, mage.cards.s.SurgeOfThoughtweft.class));
        cards.add(new SetCardInfo("Surgespanner", 92, Rarity.RARE, mage.cards.s.Surgespanner.class));
        cards.add(new SetCardInfo("Swamp", 290, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 291, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 292, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 293, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sygg, River Guide", 251, Rarity.RARE, mage.cards.s.SyggRiverGuide.class));
        cards.add(new SetCardInfo("Sylvan Echoes", 237, Rarity.UNCOMMON, mage.cards.s.SylvanEchoes.class));
        cards.add(new SetCardInfo("Tarfire", 194, Rarity.COMMON, mage.cards.t.Tarfire.class));
        cards.add(new SetCardInfo("Tar Pitcher", 193, Rarity.UNCOMMON, mage.cards.t.TarPitcher.class));
        cards.add(new SetCardInfo("Thieving Sprite", 143, Rarity.COMMON, mage.cards.t.ThievingSprite.class));
        cards.add(new SetCardInfo("Thorn of Amethyst", 262, Rarity.RARE, mage.cards.t.ThornOfAmethyst.class));
        cards.add(new SetCardInfo("Thorntooth Witch", 144, Rarity.UNCOMMON, mage.cards.t.ThorntoothWitch.class));
        cards.add(new SetCardInfo("Thoughtseize", 145, Rarity.RARE, mage.cards.t.Thoughtseize.class));
        cards.add(new SetCardInfo("Thoughtweft Trio", 44, Rarity.RARE, mage.cards.t.ThoughtweftTrio.class));
        cards.add(new SetCardInfo("Thousand-Year Elixir", 263, Rarity.RARE, mage.cards.t.ThousandYearElixir.class));
        cards.add(new SetCardInfo("Thundercloud Shaman", 195, Rarity.UNCOMMON, mage.cards.t.ThundercloudShaman.class));
        cards.add(new SetCardInfo("Tideshaper Mystic", 93, Rarity.COMMON, mage.cards.t.TideshaperMystic.class));
        cards.add(new SetCardInfo("Timber Protector", 238, Rarity.RARE, mage.cards.t.TimberProtector.class));
        cards.add(new SetCardInfo("Treefolk Harbinger", 239, Rarity.UNCOMMON, mage.cards.t.TreefolkHarbinger.class));
        cards.add(new SetCardInfo("Triclopean Sight", 45, Rarity.COMMON, mage.cards.t.TriclopeanSight.class));
        cards.add(new SetCardInfo("Turtleshell Changeling", 94, Rarity.UNCOMMON, mage.cards.t.TurtleshellChangeling.class));
        cards.add(new SetCardInfo("Twinning Glass", 264, Rarity.RARE, mage.cards.t.TwinningGlass.class));
        cards.add(new SetCardInfo("Veteran of the Depths", 46, Rarity.UNCOMMON, mage.cards.v.VeteranOfTheDepths.class));
        cards.add(new SetCardInfo("Vigor", 240, Rarity.RARE, mage.cards.v.Vigor.class));
        cards.add(new SetCardInfo("Vivid Crag", 275, Rarity.UNCOMMON, mage.cards.v.VividCrag.class));
        cards.add(new SetCardInfo("Vivid Creek", 276, Rarity.UNCOMMON, mage.cards.v.VividCreek.class));
        cards.add(new SetCardInfo("Vivid Grove", 277, Rarity.UNCOMMON, mage.cards.v.VividGrove.class));
        cards.add(new SetCardInfo("Vivid Marsh", 278, Rarity.UNCOMMON, mage.cards.v.VividMarsh.class));
        cards.add(new SetCardInfo("Vivid Meadow", 279, Rarity.UNCOMMON, mage.cards.v.VividMeadow.class));
        cards.add(new SetCardInfo("Wanderer's Twig", 265, Rarity.COMMON, mage.cards.w.WanderersTwig.class));
        cards.add(new SetCardInfo("Wanderwine Hub", 280, Rarity.RARE, mage.cards.w.WanderwineHub.class));
        cards.add(new SetCardInfo("Wanderwine Prophets", 95, Rarity.RARE, mage.cards.w.WanderwineProphets.class));
        cards.add(new SetCardInfo("Warren Pilferers", 146, Rarity.COMMON, mage.cards.w.WarrenPilferers.class));
        cards.add(new SetCardInfo("Warren-Scourge Elf", 241, Rarity.COMMON, mage.cards.w.WarrenScourgeElf.class));
        cards.add(new SetCardInfo("Weed Strangle", 147, Rarity.COMMON, mage.cards.w.WeedStrangle.class));
        cards.add(new SetCardInfo("Wellgabber Apothecary", 47, Rarity.COMMON, mage.cards.w.WellgabberApothecary.class));
        cards.add(new SetCardInfo("Whirlpool Whelm", 96, Rarity.COMMON, mage.cards.w.WhirlpoolWhelm.class));
        cards.add(new SetCardInfo("Wild Ricochet", 196, Rarity.RARE, mage.cards.w.WildRicochet.class));
        cards.add(new SetCardInfo("Windbrisk Heights", 281, Rarity.RARE, mage.cards.w.WindbriskHeights.class));
        cards.add(new SetCardInfo("Wings of Velis Vel", 97, Rarity.COMMON, mage.cards.w.WingsOfVelisVel.class));
        cards.add(new SetCardInfo("Wispmare", 48, Rarity.COMMON, mage.cards.w.Wispmare.class));
        cards.add(new SetCardInfo("Wizened Cenn", 49, Rarity.UNCOMMON, mage.cards.w.WizenedCenn.class));
        cards.add(new SetCardInfo("Woodland Changeling", 242, Rarity.COMMON, mage.cards.w.WoodlandChangeling.class));
        cards.add(new SetCardInfo("Woodland Guidance", 243, Rarity.UNCOMMON, mage.cards.w.WoodlandGuidance.class));
        cards.add(new SetCardInfo("Wort, Boggart Auntie", 252, Rarity.RARE, mage.cards.w.WortBoggartAuntie.class));
        cards.add(new SetCardInfo("Wren's Run Packmaster", 244, Rarity.RARE, mage.cards.w.WrensRunPackmaster.class));
        cards.add(new SetCardInfo("Wren's Run Vanquisher", 245, Rarity.UNCOMMON, mage.cards.w.WrensRunVanquisher.class));
        cards.add(new SetCardInfo("Wydwen, the Biting Gale", 253, Rarity.RARE, mage.cards.w.WydwenTheBitingGale.class));
        cards.add(new SetCardInfo("Zephyr Net", 98, Rarity.COMMON, mage.cards.z.ZephyrNet.class));
    }

    @Override
    public BoosterCollator createCollator() {
        return new LorwynCollator();
    }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/lrw.html
// order not known for uncommon runs, but card division is
// pack distribution for uncommons not specified, assuming AAB ABB as in Onslaught
class LorwynCollator implements BoosterCollator {
    private final CardRun commonA = new CardRun(true, "91", "191", "128", "197", "177", "35", "77", "108", "260", "231", "32", "84", "189", "214", "126", "23", "181", "134", "77", "231", "258", "156", "33", "189", "90", "128", "211", "126", "35", "96", "227", "148", "48", "91", "161", "103", "229", "260", "181", "32", "78", "227", "156", "143", "23", "96", "103", "148", "211", "258", "20", "84", "191", "108", "197", "33", "78", "177", "134", "229", "161", "48", "90", "143", "214", "20");
    private final CardRun commonB = new CardRun(true, "118", "57", "17", "212", "110", "190", "68", "201", "34", "265", "118", "151", "242", "25", "115", "76", "184", "228", "147", "27", "57", "183", "223", "257", "4", "146", "184", "212", "50", "137", "43", "201", "194", "265", "87", "4", "198", "110", "185", "261", "232", "17", "68", "146", "190", "223", "43", "76", "147", "185", "242", "261", "27", "115", "151", "228", "87", "34", "137", "198", "50", "194", "257", "25", "232", "183");
    private final CardRun commonC = new CardRun(true, "16", "62", "132", "152", "206", "12", "54", "129", "163", "234", "16", "97", "166", "111", "241", "152", "8", "81", "99", "273", "205", "170", "29", "89", "141", "166", "93", "234", "45", "132", "163", "62", "241", "29", "141", "154", "81", "218", "45", "129", "157", "93", "206", "54", "8", "154", "111", "218", "170", "12", "89", "99", "205", "97", "157");
    private final CardRun commonD = new CardRun(true, "22", "225", "153", "109", "79", "217", "140", "39", "164", "204", "51", "24", "138", "225", "41", "79", "100", "80", "164", "140", "52", "24", "236", "153", "47", "215", "101", "98", "100", "22", "70", "186", "40", "204", "47", "52", "127", "98", "138", "215", "80", "180", "51", "236", "109", "39", "127", "186", "41", "217", "70", "101", "180", "40", "273");
    private final CardRun uncommonA = new CardRun(false, "5", "102", "155", "7", "55", "11", "162", "59", "207", "208", "13", "112", "64", "165", "167", "169", "67", "18", "174", "117", "119", "26", "224", "226", "122", "72", "73", "130", "136", "188", "82", "42", "237", "239", "94", "46", "275", "277", "279", "243");
    private final CardRun uncommonB = new CardRun(false, "53", "199", "158", "160", "9", "200", "10", "58", "60", "61", "63", "113", "168", "114", "116", "171", "172", "216", "19", "220", "221", "182", "222", "28", "124", "125", "74", "36", "235", "38", "139", "86", "142", "193", "144", "195", "276", "278", "49", "245");
    private final CardRun rare = new CardRun(false, "1", "266", "2", "150", "149", "267", "3", "104", "6", "246", "105", "159", "202", "106", "254", "56", "203", "255", "256", "247", "107", "209", "210", "65", "14", "66", "248", "15", "213", "268", "69", "173", "175", "21", "249", "176", "269", "219", "178", "179", "71", "120", "121", "123", "230", "30", "31", "75", "270", "250", "131", "187", "133", "233", "135", "37", "259", "83", "271", "85", "272", "88", "274", "192", "92", "251", "262", "145", "44", "263", "238", "264", "240", "280", "95", "196", "281", "252", "244", "253");

    private final BoosterStructure AAAAAACCCCC = new BoosterStructure(
            commonA, commonA, commonA, commonA, commonA, commonA,
            commonC, commonC, commonC, commonC, commonC
    );
    private final BoosterStructure AAAAAADDDDD = new BoosterStructure(
            commonA, commonA, commonA, commonA, commonA, commonA,
            commonD, commonD, commonD, commonD, commonD
    );
    private final BoosterStructure BBBBBBCCCCC = new BoosterStructure(
            commonB, commonB, commonB, commonB, commonB, commonB,
            commonC, commonC, commonC, commonC, commonC
    );
    private final BoosterStructure BBBBBBDDDDD = new BoosterStructure(
            commonB, commonB, commonB, commonB, commonB, commonB,
            commonD, commonD, commonD, commonD, commonD
    );
    private final BoosterStructure ABB = new BoosterStructure(uncommonA, uncommonB, uncommonB);
    private final BoosterStructure AAB = new BoosterStructure(uncommonA, uncommonA, uncommonB);

    private final BoosterStructure R1 = new BoosterStructure(rare);

    private final RarityConfiguration commonRuns = new RarityConfiguration(
            AAAAAACCCCC, AAAAAADDDDD, BBBBBBCCCCC, BBBBBBDDDDD
    );

    private final RarityConfiguration uncommonRuns = new RarityConfiguration(
            AAB, ABB
    );

    private final RarityConfiguration rareRuns = new RarityConfiguration(R1);

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        booster.addAll(commonRuns.getNext().makeRun());
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(rareRuns.getNext().makeRun());
        return booster;
    }
}

package mage.cards.r;

import java.util.UUID;
import mage.constants.SubType;
import mage.target.common.TargetLandPermanent;
import mage.abilities.effects.common.AttachEffect;
import mage.constants.Outcome;
import mage.target.TargetPermanent;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class RunawayGrowth extends CardImpl {

    public RunawayGrowth(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{G}");
        
        this.subtype.add(SubType.AURA);

        // Starting intensity 1
        // Enchant land
        TargetPermanent auraTarget = new TargetLandPermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.BoostCreature));
        this.addAbility(new EnchantAbility(auraTarget));

        // Whenever enchanted land is tapped for mana, its controller adds an additional amount of {G} equal to Runaway Growth's intensity. Then Runaway Growth intensifies by 1.
    }

    private RunawayGrowth(final RunawayGrowth card) {
        super(card);
    }

    @Override
    public RunawayGrowth copy() {
        return new RunawayGrowth(this);
    }
}

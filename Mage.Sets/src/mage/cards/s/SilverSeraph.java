package mage.cards.s;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.ThresholdCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.AbilityWord;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author LoneFox
 */
public final class SilverSeraph extends CardImpl {

    public SilverSeraph(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{W}{W}{W}");
        this.subtype.add(SubType.ANGEL);
        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Threshold - Other creatures you control get +2/+2 as long as seven or more cards are in your graveyard.
        this.addAbility(new SimpleStaticAbility(new ConditionalContinuousEffect(
                new BoostControlledEffect(2, 2, Duration.WhileOnBattlefield, true),
                ThresholdCondition.instance, "other creatures you control get +2/+2 as long as seven or more cards are in your graveyard"
        )).setAbilityWord(AbilityWord.THRESHOLD));
    }

    private SilverSeraph(final SilverSeraph card) {
        super(card);
    }

    @Override
    public SilverSeraph copy() {
        return new SilverSeraph(this);
    }
}

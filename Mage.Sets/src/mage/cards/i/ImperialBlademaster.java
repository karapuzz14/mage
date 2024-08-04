package mage.cards.i;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.DoubleStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class ImperialBlademaster extends CardImpl {

    public ImperialBlademaster(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}{W}");
        
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SAMURAI);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        // Double strike
        this.addAbility(DoubleStrikeAbility.getInstance());

        // Whenever a Samurai or Warrior you control attacks alone, draft a card from Imperial Blademaster's spellbook.
    }

    private ImperialBlademaster(final ImperialBlademaster card) {
        super(card);
    }

    @Override
    public ImperialBlademaster copy() {
        return new ImperialBlademaster(this);
    }
}

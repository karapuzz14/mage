package mage.cards.i;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.ReconfigureAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class InchbladeCompanion extends CardImpl {

    public InchbladeCompanion(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{W}");
        
        this.subtype.add(SubType.EQUIPMENT);
        this.subtype.add(SubType.INSECT);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // Equipped creature gets +1/+1.
        // Whenever Inchblade Companion becomes attached to a creature, create a token that's a copy of Inchblade Companion, except it doesn't have this ability. This ability triggers only once each turn.
        // Reconfigure {2}
        this.addAbility(new ReconfigureAbility("{2}"));

    }

    private InchbladeCompanion(final InchbladeCompanion card) {
        super(card);
    }

    @Override
    public InchbladeCompanion copy() {
        return new InchbladeCompanion(this);
    }
}

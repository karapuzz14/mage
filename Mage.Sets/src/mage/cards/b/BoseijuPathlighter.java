package mage.cards.b;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class BoseijuPathlighter extends CardImpl {

    public BoseijuPathlighter(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}");
        
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        // When Boseiju Pathlighter enters the battlefield, draft a card from Boseiju Pathlighter's spellbook.
    }

    private BoseijuPathlighter(final BoseijuPathlighter card) {
        super(card);
    }

    @Override
    public BoseijuPathlighter copy() {
        return new BoseijuPathlighter(this);
    }
}

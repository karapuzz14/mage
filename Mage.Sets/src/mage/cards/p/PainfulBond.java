package mage.cards.p;

import java.util.UUID;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class PainfulBond extends CardImpl {

    public PainfulBond(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{1}{B}");
        

        // Draw two cards, then nonland cards in your hand with mana value 3 or less perpetually gain "When you cast this spell, you lose 1 life."
    }

    private PainfulBond(final PainfulBond card) {
        super(card);
    }

    @Override
    public PainfulBond copy() {
        return new PainfulBond(this);
    }
}

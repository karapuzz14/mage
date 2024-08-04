package mage.cards.u;

import java.util.UUID;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class UndercityPlunder extends CardImpl {

    public UndercityPlunder(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{B}");
        

        // Target opponent discards a card. Then they may discard an additional card. If they don't, conjure a duplicate of a random card from their library into your hand. It perpetually gains "You may spend mana as though it were mana of any color to cast this spell."
    }

    private UndercityPlunder(final UndercityPlunder card) {
        super(card);
    }

    @Override
    public UndercityPlunder copy() {
        return new UndercityPlunder(this);
    }
}

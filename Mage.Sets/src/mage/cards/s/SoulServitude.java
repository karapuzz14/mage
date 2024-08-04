package mage.cards.s;

import java.util.UUID;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class SoulServitude extends CardImpl {

    public SoulServitude(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{B}");
        

        // Target player sacrifices a nontoken creature. When they do, you may discard a card. If you do, conjure a duplicate of the sacrificed creature into your hand. It perpetually gains "You may spend mana as though it were mana of any color to cast this spell."
    }

    private SoulServitude(final SoulServitude card) {
        super(card);
    }

    @Override
    public SoulServitude copy() {
        return new SoulServitude(this);
    }
}

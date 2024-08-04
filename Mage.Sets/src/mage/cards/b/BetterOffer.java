package mage.cards.b;

import java.util.UUID;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class BetterOffer extends CardImpl {

    public BetterOffer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{X}{U}");
        

        // Put a random creature card with mana value X or less from target opponent's library onto the battlefield under your control. It perpetually has base power and toughness X/X and perpetually gains ward {1}.
    }

    private BetterOffer(final BetterOffer card) {
        super(card);
    }

    @Override
    public BetterOffer copy() {
        return new BetterOffer(this);
    }
}

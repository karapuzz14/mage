package mage.cards.h;

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
public final class HolographicDouble extends CardImpl {

    public HolographicDouble(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{U}");
        
        this.subtype.add(SubType.ILLUSION);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // {U}, Exile Holographic Double from your hand: Choose a creature card in your hand. Conjure a duplicate of it into your hand.
    }

    private HolographicDouble(final HolographicDouble card) {
        super(card);
    }

    @Override
    public HolographicDouble copy() {
        return new HolographicDouble(this);
    }
}

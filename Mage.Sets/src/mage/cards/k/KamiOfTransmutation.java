package mage.cards.k;

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
public final class KamiOfTransmutation extends CardImpl {

    public KamiOfTransmutation(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");
        
        this.subtype.add(SubType.SPIRIT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // When Kami of Transmutation enters or leaves the battlefield, choose one --
        // * Each permanent card in your hand perpetually becomes an artifact in addition to its other types.
        // * Each permanent card in your hand perpetually becomes an enchantment in addition to its other types.
    }

    private KamiOfTransmutation(final KamiOfTransmutation card) {
        super(card);
    }

    @Override
    public KamiOfTransmutation copy() {
        return new KamiOfTransmutation(this);
    }
}

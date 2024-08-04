package mage.cards.f;

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
public final class ForcefulCultivator extends CardImpl {

    public ForcefulCultivator(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}{G}");
        
        this.subtype.add(SubType.SNAKE);
        this.subtype.add(SubType.SHAMAN);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        // This spell costs {2} less to cast if there are no land cards in your hand.
        // When Forceful Cultivator enters the battlefield, search your library for a basic land card, put that card onto the battlefield tapped, then shuffle.
    }

    private ForcefulCultivator(final ForcefulCultivator card) {
        super(card);
    }

    @Override
    public ForcefulCultivator copy() {
        return new ForcefulCultivator(this);
    }
}

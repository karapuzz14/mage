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
public final class KamiOfMourning extends CardImpl {

    public KamiOfMourning(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}");
        
        this.subtype.add(SubType.SPIRIT);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        // Whenever Kami of Mourning enters the battlefield, target creature you control or creature card in your graveyard perpetually gains "Whenever a creature you control with greater mana value than this card dies, return this card from your graveyard to the battlefield tapped."
    }

    private KamiOfMourning(final KamiOfMourning card) {
        super(card);
    }

    @Override
    public KamiOfMourning copy() {
        return new KamiOfMourning(this);
    }
}

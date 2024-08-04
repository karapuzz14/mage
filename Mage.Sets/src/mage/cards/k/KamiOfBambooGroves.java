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
public final class KamiOfBambooGroves extends CardImpl {

    public KamiOfBambooGroves(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT, CardType.CREATURE}, "{G}");
        
        this.subtype.add(SubType.SPIRIT);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // When Kami of Bamboo Groves enters the battlefield, you may put a land card from your hand onto the battlefield tapped.
        // Channel -- {2}{G}, Discard Kami of Bamboo Groves: Conjure two cards named Forest into your hand.
    }

    private KamiOfBambooGroves(final KamiOfBambooGroves card) {
        super(card);
    }

    @Override
    public KamiOfBambooGroves copy() {
        return new KamiOfBambooGroves(this);
    }
}

package mage.cards.a;

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
public final class ArtilleryEnthusiast extends CardImpl {

    public ArtilleryEnthusiast(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}");
        
        this.subtype.add(SubType.GOBLIN);
        this.subtype.add(SubType.ARTIFICER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        // Modified creatures you control have menace.
        // When Artillery Enthusiast enters the battlefield, you may discard a card. If you do, seek a card with mana value equal to that card's mana value.
    }

    private ArtilleryEnthusiast(final ArtilleryEnthusiast card) {
        super(card);
    }

    @Override
    public ArtilleryEnthusiast copy() {
        return new ArtilleryEnthusiast(this);
    }
}

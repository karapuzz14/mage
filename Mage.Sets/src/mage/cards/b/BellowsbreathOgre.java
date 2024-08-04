package mage.cards.b;

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
public final class BellowsbreathOgre extends CardImpl {

    public BellowsbreathOgre(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{2}{R}");
        
        this.subtype.add(SubType.OGRE);
        this.subtype.add(SubType.SHAMAN);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Starting intensity 1
        // Whenever Bellowsbreath Ogre attacks, it deals damage equal to its intensity to any target. Then Bellowsbreath Ogre intensifies by 1.
    }

    private BellowsbreathOgre(final BellowsbreathOgre card) {
        super(card);
    }

    @Override
    public BellowsbreathOgre copy() {
        return new BellowsbreathOgre(this);
    }
}

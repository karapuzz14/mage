package mage.cards.c;

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
public final class ChroniclerOfWorship extends CardImpl {

    public ChroniclerOfWorship(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}");
        
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.MONK);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // When Chronicler of Worship enters the battlefield, put a random Shrine card from among the top seven cards of your library into your hand. It perpetually gains "This spell costs {1} less to cast." Then shuffle.
        // {T}: Add one mana of any color.
    }

    private ChroniclerOfWorship(final ChroniclerOfWorship card) {
        super(card);
    }

    @Override
    public ChroniclerOfWorship copy() {
        return new ChroniclerOfWorship(this);
    }
}

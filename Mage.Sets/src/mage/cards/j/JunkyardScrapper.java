package mage.cards.j;

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
public final class JunkyardScrapper extends CardImpl {

    public JunkyardScrapper(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}");
        
        this.subtype.add(SubType.GOBLIN);
        this.subtype.add(SubType.ARTIFICER);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Whenever a nontoken artifact enters the battlefield under your control, exile a random nonland artifact card with lesser mana value from your library. You may cast that card until the end of your next turn.
    }

    private JunkyardScrapper(final JunkyardScrapper card) {
        super(card);
    }

    @Override
    public JunkyardScrapper copy() {
        return new JunkyardScrapper(this);
    }
}

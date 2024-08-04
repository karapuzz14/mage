package mage.cards.j;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.NinjutsuAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class JukaiLiberator extends CardImpl {

    public JukaiLiberator(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}");
        
        this.subtype.add(SubType.SNAKE);
        this.subtype.add(SubType.NINJA);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Ninjutsu {1}{G}
        this.addAbility(new NinjutsuAbility("{1}{G}"));

        // Whenever Jukai Liberator deals combat damage to a player, choose land or nonland. Seek a permanent card of the chosen type.
    }

    private JukaiLiberator(final JukaiLiberator card) {
        super(card);
    }

    @Override
    public JukaiLiberator copy() {
        return new JukaiLiberator(this);
    }
}

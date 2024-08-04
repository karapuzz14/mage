package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.FlashAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class SaibaSyphoner extends CardImpl {

    public SaibaSyphoner(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}{U}");
        
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.NINJA);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Flash
        this.addAbility(FlashAbility.getInstance());

        // This spell costs {2} less to cast if there are no instant or sorcery cards in your hand.
        // When Saiba Syphoner enters the battlefield, return target instant or sorcery card from your graveyard to your hand.
        // If Saiba Syphoner would die, shuffle it into your library instead.
    }

    private SaibaSyphoner(final SaibaSyphoner card) {
        super(card);
    }

    @Override
    public SaibaSyphoner copy() {
        return new SaibaSyphoner(this);
    }
}

package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.NinjutsuAbility;
import mage.abilities.keyword.DeathtouchAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class SwarmSaboteur extends CardImpl {

    public SwarmSaboteur(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");
        
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.NINJA);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Ninjutsu {B}
        this.addAbility(new NinjutsuAbility("{B}"));

        // Deathtouch
        this.addAbility(DeathtouchAbility.getInstance());

        // Whenever Swarm Saboteur deals combat damage to a player, conjure a card named Virus Beetle into your hand.
    }

    private SwarmSaboteur(final SwarmSaboteur card) {
        super(card);
    }

    @Override
    public SwarmSaboteur copy() {
        return new SwarmSaboteur(this);
    }
}

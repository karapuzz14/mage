package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.ReconfigureAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class SemblanceScanner extends CardImpl {

    public SemblanceScanner(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{2}{U}");
        
        this.subtype.add(SubType.EQUIPMENT);
        this.subtype.add(SubType.SHAPESHIFTER);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        // Whenever Semblance Scanner or equipped creature deals combat damage to a player, if it's not a token, conjure a duplicate of it into your hand.
        // Reconfigure {1}
        this.addAbility(new ReconfigureAbility("{1}"));

    }

    private SemblanceScanner(final SemblanceScanner card) {
        super(card);
    }

    @Override
    public SemblanceScanner copy() {
        return new SemblanceScanner(this);
    }
}

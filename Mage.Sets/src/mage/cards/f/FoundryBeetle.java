package mage.cards.f;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.abilities.keyword.ReconfigureAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class FoundryBeetle extends CardImpl {

    public FoundryBeetle(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{1}{R}");
        
        this.subtype.add(SubType.EQUIPMENT);
        this.subtype.add(SubType.INSECT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // First strike
        this.addAbility(FirstStrikeAbility.getInstance());

        // Equipped creature has first strike.
        // At the beginning of your upkeep, a random artifact card in your hand perpetually gains "This spell costs {1} less to cast."
        // Reconfigure {R}
        this.addAbility(new ReconfigureAbility("{R}"));

    }

    private FoundryBeetle(final FoundryBeetle card) {
        super(card);
    }

    @Override
    public FoundryBeetle copy() {
        return new FoundryBeetle(this);
    }
}

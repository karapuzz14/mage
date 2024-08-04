package mage.cards.f;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.ReconfigureAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class ForgebornPhoenix extends CardImpl {

    public ForgebornPhoenix(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{1}{R}{R}");
        
        this.subtype.add(SubType.EQUIPMENT);
        this.subtype.add(SubType.PHOENIX);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Equipped creature has flying.
        // Whenever Forgeborn Phoenix or equipped creature dies, it perpetually gains "Whenever an equipped creature you control deals combat damage to a player or planeswalker, return this card from your graveyard to the battlefield tapped."
        // Reconfigure {R}
        this.addAbility(new ReconfigureAbility("{R}"));

    }

    private ForgebornPhoenix(final ForgebornPhoenix card) {
        super(card);
    }

    @Override
    public ForgebornPhoenix copy() {
        return new ForgebornPhoenix(this);
    }
}

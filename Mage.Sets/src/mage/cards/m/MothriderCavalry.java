package mage.cards.m;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class MothriderCavalry extends CardImpl {

    public MothriderCavalry(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}{W}");
        
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SAMURAI);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // This spell costs {2} less to cast if you have no creature cards in hand not named Mothrider Cavalry.
        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Other creatures you control get +1/+1.
    }

    private MothriderCavalry(final MothriderCavalry card) {
        super(card);
    }

    @Override
    public MothriderCavalry copy() {
        return new MothriderCavalry(this);
    }
}

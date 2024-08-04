package mage.cards.c;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class ConsumingOni extends CardImpl {

    public ConsumingOni(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}{B}");
        
        this.subtype.add(SubType.OGRE);
        this.subtype.add(SubType.DEMON);
        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Menace
        this.addAbility(new MenaceAbility());

        // At the beginning of your end step, a random nonland card in your hand perpetually gains "When you cast this spell, you lose 3 life."
    }

    private ConsumingOni(final ConsumingOni card) {
        super(card);
    }

    @Override
    public ConsumingOni copy() {
        return new ConsumingOni(this);
    }
}

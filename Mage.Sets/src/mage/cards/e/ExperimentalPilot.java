package mage.cards.e;

import java.util.UUID;
import mage.MageInt;
import mage.constants.SubType;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.keyword.WardAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class ExperimentalPilot extends CardImpl {

    public ExperimentalPilot(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{U}");
        
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.PILOT);
        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        // Ward {2}
        this.addAbility(new WardAbility(new ManaCostsImpl<>("{2}")));

        // {U}, Discard two cards: Draft a card from Experimental Pilot's spellbook.
        // Experimental Pilot crews Vehicles as though its power were 2 greater.
    }

    private ExperimentalPilot(final ExperimentalPilot card) {
        super(card);
    }

    @Override
    public ExperimentalPilot copy() {
        return new ExperimentalPilot(this);
    }
}

package mage.cards.f;

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
public final class FuturistSpellthief extends CardImpl {

    public FuturistSpellthief(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        
        this.subtype.add(SubType.MOONFOLK);
        this.subtype.add(SubType.WIZARD);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        // Flash
        this.addAbility(FlashAbility.getInstance());

        // When Futurist Spellthief enters the battlefield, conjure a duplicate of target spell into your hand. That card perpetually gains "You may spend mana as though it were mana of any color to cast this spell."
    }

    private FuturistSpellthief(final FuturistSpellthief card) {
        super(card);
    }

    @Override
    public FuturistSpellthief copy() {
        return new FuturistSpellthief(this);
    }
}

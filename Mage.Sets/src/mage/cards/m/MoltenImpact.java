package mage.cards.m;

import java.util.UUID;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class MoltenImpact extends CardImpl {

    public MoltenImpact(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{R}");
        

        // Molten Impact deals 4 damage to target creature or planeswalker. If excess damage was dealt this way, note that excess damage, then you get a one-time boon with "When you cast an instant or sorcery spell, this boon deals damage equal to the noted number to target creature or planeswalker an opponent controls."
    }

    private MoltenImpact(final MoltenImpact card) {
        super(card);
    }

    @Override
    public MoltenImpact copy() {
        return new MoltenImpact(this);
    }
}

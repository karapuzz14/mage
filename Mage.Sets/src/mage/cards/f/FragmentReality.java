package mage.cards.f;

import java.util.UUID;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author anonymous
 */
public final class FragmentReality extends CardImpl {

    public FragmentReality(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{W}");
        

        // Exile target nontoken artifact, creature, or enchantment an opponent controls. Its controller puts a random creature card with lesser mana value from their library onto the battlefield tapped.
    }

    private FragmentReality(final FragmentReality card) {
        super(card);
    }

    @Override
    public FragmentReality copy() {
        return new FragmentReality(this);
    }
}

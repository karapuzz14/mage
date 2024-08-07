
package mage.cards.s;

import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.CostAdjuster;
import mage.abilities.costs.common.DiscardTargetCost;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.effects.common.InfoEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Zone;
import mage.filter.common.FilterLandCard;
import mage.game.Game;
import mage.target.common.TargetCardInHand;
import mage.target.common.TargetLandPermanent;
import mage.target.targetadjustment.XTargetsCountAdjuster;
import mage.util.CardUtil;

import java.util.UUID;

/**
 * @author fireshoes
 */
public final class ScorchedEarth extends CardImpl {

    public ScorchedEarth(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{X}{R}");

        // As an additional cost to cast Scorched Earth, discard X land cards.
        Ability ability = new SimpleStaticAbility(Zone.ALL, new InfoEffect("as an additional cost to cast this spell, discard X land cards"));
        ability.setRuleAtTheTop(true);
        this.addAbility(ability);

        // Destroy X target lands.
        Effect effect = new DestroyTargetEffect();
        effect.setText("Destroy X target lands");
        this.getSpellAbility().addTarget(new TargetLandPermanent());
        this.getSpellAbility().addEffect(effect);
        this.getSpellAbility().setTargetAdjuster(new XTargetsCountAdjuster());
        this.getSpellAbility().setCostAdjuster(ScorchedEarthCostAdjuster.instance);
    }

    private ScorchedEarth(final ScorchedEarth card) {
        super(card);
    }

    @Override
    public ScorchedEarth copy() {
        return new ScorchedEarth(this);
    }
}

enum ScorchedEarthCostAdjuster implements CostAdjuster {
    instance;

    @Override
    public void adjustCosts(Ability ability, Game game) {
        int xValue = CardUtil.getSourceCostsTag(game, ability, "X", 0);
        if (xValue > 0) {
            ability.addCost(new DiscardTargetCost(new TargetCardInHand(xValue, xValue, new FilterLandCard("land cards"))));
        }
    }
}
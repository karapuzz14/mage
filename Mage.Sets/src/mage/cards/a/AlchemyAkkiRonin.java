package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksAloneControlledTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;
import mage.target.common.TargetCardInHand;

import java.util.UUID;

/**
 * @author karapuzz14
 */
public final class AlchemyAkkiRonin extends AkkiRonin {

    public AlchemyAkkiRonin(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}");

        this.subtype.add(SubType.GOBLIN);
        this.subtype.add(SubType.SAMURAI);
        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        // Whenever a Samurai or Warrior you control attacks alone, you may put a card from your hand on the bottom of your library. If you do, draw a card.
        this.addAbility(new AttacksAloneControlledTriggeredAbility(new AlchemyAkkiRoninEffect(),
                StaticFilters.FILTER_CONTROLLED_SAMURAI_OR_WARRIOR, false, false));
    }
}

class AlchemyAkkiRoninEffect extends OneShotEffect {

    AlchemyAkkiRoninEffect() {
        super(Outcome.Benefit);
        staticText = "you may put a card from your hand on the bottom of your library. If you do, draw a card";
    }

    private AlchemyAkkiRoninEffect(final AlchemyAkkiRoninEffect effect) {
        super(effect);
    }

    @Override
    public AlchemyAkkiRoninEffect copy() {
        return new AlchemyAkkiRoninEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player == null
                || player.getHand().isEmpty()
                || !player.chooseUse(
                outcome, "Put a card from your hand " +
                        "on the bottom of your library?", source, game
        )) {
            return false;
        }
        TargetCard target = new TargetCardInHand();
        player.choose(outcome, player.getHand(), target, source, game);
        Card card = game.getCard(target.getFirstTarget());
        if (card == null) {
            return false;
        }
        if (player.putCardsOnBottomOfLibrary(card, game, source, false)) {
            player.drawCards(1, source, game);
        }
        return true;
    }
}

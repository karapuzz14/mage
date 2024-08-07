package mage.abilities.common;

import mage.abilities.effects.Effect;
import mage.constants.SetTargetPointer;
import mage.constants.Zone;
import mage.filter.FilterPermanent;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;
import mage.util.CardUtil;

/**
 *
 * @author LevelX2
 */
public class EntersBattlefieldControlledTriggeredAbility extends EntersBattlefieldAllTriggeredAbility {

    /**
     * zone = BATTLEFIELD, optional = false
     */
    public EntersBattlefieldControlledTriggeredAbility(Effect effect, FilterPermanent filter) {
        this(Zone.BATTLEFIELD, effect, filter, false);
    }

    public EntersBattlefieldControlledTriggeredAbility(Zone zone, Effect effect, FilterPermanent filter, boolean optional) {
        this(zone, effect, filter, optional, SetTargetPointer.NONE);
    }

    public EntersBattlefieldControlledTriggeredAbility(Zone zone, Effect effect, FilterPermanent filter, boolean optional, SetTargetPointer setTargetPointer) {
        super(zone, effect, filter, optional, setTargetPointer);
        makeTriggerPhrase();
    }

    protected EntersBattlefieldControlledTriggeredAbility(final EntersBattlefieldControlledTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        Permanent permanent = game.getPermanent(event.getTargetId());
        if (permanent == null || !permanent.isControlledBy(getControllerId())) {
            return false;
        }
        return super.checkTrigger(event, game);
    }

    private void makeTriggerPhrase() {
        String filterMessage = filter.getMessage();
        if (filterMessage.startsWith("one or more")) {
            setTriggerPhrase(getWhen() + filterMessage + " you control enter, ");
        }
        setTriggerPhrase(getWhen() + CardUtil.addArticle(filterMessage) + " you control enters, ");
    }

    @Override
    public EntersBattlefieldControlledTriggeredAbility copy() {
        return new EntersBattlefieldControlledTriggeredAbility(this);
    }
}

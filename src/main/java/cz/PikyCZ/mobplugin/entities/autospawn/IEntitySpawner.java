/**
 * EntitySpawner.java
 * 
 * Created on 10:38:53
 */
package cz.PikyCZ.mobplugin.entities.autospawn;

import java.util.Collection;

import cn.nukkit.IPlayer;
import cn.nukkit.Player;
import cn.nukkit.level.Level;
import cn.nukkit.level.Position;

/**
 * @author <a href="mailto:kniffman@googlemail.com">Michael Gertz</a>
 */
public interface IEntitySpawner {

    public void spawn(Collection<Player> onlinePlayers);

    public SpawnResult spawn(IPlayer iPlayer, Position pos, Level level);
    
    public int getEntityNetworkId ();
    
    public String getEntityName ();

}
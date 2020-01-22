package mindustry.ecs;

import arc.ecs.*;
import arc.graphics.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.ArcAnnotate.*;
import mindustry.entities.Effects.*;
import mindustry.entities.traits.BuilderTrait.*;
import mindustry.entities.traits.*;
import mindustry.game.*;
import mindustry.net.*;
import mindustry.type.*;

public class Components{

    public static class Healthc extends Component{
        public float health;
        public boolean dead;
    }

    public static class Hitboxc extends Component{
        public float width, height;
    }

    public static class Posc extends Component{
        public float x, y;
    }

    public static class Rotc extends Component{
        public float rot;
    }

    public static class Velocityc extends Component{
        public Vec2 vec = new Vec2();
    }

    public static class Teamc extends Component{
        public Team team = Team.derelict;
    }

    public static class Minec extends Component{
        public int tile;
    }

    public static class Buildc extends Component{
        public float buildSpeed = 1f;
        public Queue<BuildRequest> requests = new Queue<>();
        public boolean building;
    }

    public static class Syncc{
        //network ID
        public int id;
    }

    public static class Effectc extends Component{
        public Effect effect;
    }

    public static class Flyingc{
        public boolean achievedFlight;
        public boolean flying;
    }

    public static class Boostc{
        public float boostHeat;
    }

    public static class Legsc{
        public float rotation;
    }

    public static class Spawningc{
        public SpawnerTrait spawner, lastSpawner;
    }

    public static class Itemc{
        public ItemStack stack = new ItemStack();
    }

    public static class Statusesc{
        public Array<StatusEntry> list = new Array<>();

        public static class StatusEntry{
            public StatusEffect effect;
            public float time;

            public StatusEntry set(StatusEffect effect, float time){
                this.effect = effect;
                this.time = time;
                return this;
            }
        }
    }

    public static class Shellc{
        //insert unit type / mech here, for the mech-rework branch
    }

    public static class Drawc{
        //???
    }

    public static class Playerc{
        public String name = "noname";
        public @Nullable String uuid, usid;
        public boolean isAdmin, isTransferring, isShooting, isBoosting, isMobile, isTyping;
        public float destructTime;
        public Color color = new Color();

        public @Nullable NetConnection con;
        public boolean isLocal = false;

        public @Nullable String lastText;
        public float textFadeTime;
    }

}

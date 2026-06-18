package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {

        // a. Create Veena object and call play()
        Veena v = new Veena();
        v.play();

        // b. Create Saxophone object and call play()
        Saxophone s = new Saxophone();
        s.play();

        // c. Store objects in Playable reference and call play()
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}

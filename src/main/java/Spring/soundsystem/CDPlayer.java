package Spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhaoxueyu on 2018/4/22.
 */
public class CDPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    public void play(){
        compactDisc.play();
    }
}

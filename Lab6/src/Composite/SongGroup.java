package Composite;
import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    ArrayList songComponents = new ArrayList();
    String groupName;
    String groupDesc;

    public SongGroup(String groupName, String groupDesc) {
        this.groupName = groupName;
        this.groupDesc = groupDesc;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void add(SongComponent newComponent) {
        songComponents.add(newComponent);
    }

    public void remove(SongComponent newComponent) {
        songComponents.remove(newComponent);
    }

    public SongComponent getComponent(int index) {
        return (SongComponent) songComponents.get(index);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDesc() + "/n");
        Iterator songIterator = songComponents.iterator();
        while (songIterator.hasNext()) {

            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}

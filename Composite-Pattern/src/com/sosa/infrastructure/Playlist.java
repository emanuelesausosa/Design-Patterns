package com.sosa.infrastructure;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playListName;
    public ArrayList<IComponent> playlist = new ArrayList<>();

    public Playlist(String playListName) {
        this.playListName = playListName;
    }

    @Override
    public void play() {
        System.out.println("Now playing " + getName());
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent component:
             playlist) {
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playListName;
    }

    /*Tree operations*/
    public void add(IComponent component){
        playlist.add(component);
    }

    public void remove(IComponent component){
        int index = getItemIndex(component);
        if (index >= 0) {
            playlist.remove(index);
        }
    }

    private int getItemIndex(IComponent component){
        int index = -1;
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getName().equalsIgnoreCase(component.getName())){
                index = i;
                break;
            }
        }
        return index;
    }
}

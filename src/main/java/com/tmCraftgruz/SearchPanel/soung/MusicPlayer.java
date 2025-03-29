package com.tmCraftgruz.SearchPanel.soung;

import javazoom.jl.player.Player;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

@Service
@Data
public class MusicPlayer {

    private static Player player;

    public static Player musicPlay() {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\idea\\IdeaProjects\\TMCRAFTGRUZPROJECT\\SearchPanel\\src\\main\\resources\\soung\\1.mp3");
            player = new Player(fileInputStream);
            player.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return player;
    }
}

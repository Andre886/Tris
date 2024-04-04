package tris_;

import javafx.scene.media.MediaPlayer;

public class MuteController {
    private MediaPlayer mediaPlayer;

    public MuteController(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    // Metodo per mettere in muto l'audio
    public void muteAudio() {
        mediaPlayer.setVolume(0.0);
    }

    // Metodo per riattivare l'audio
    public void unmuteAudio() {
        mediaPlayer.setVolume(1.0); // Imposta il volume a 1.0 per attivare l'audio
    }
}

import javax.swing.*;
import java.awt.*;

public class TestAlbum {
    public static void main(String[] args) {

        int track;
        String trackString;

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN , 12);
        textArea.setFont(font);

        textArea.setText(String.format("%-12s%-5s%-%s","Track Number","Title","Artist"));


        Song song1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song song2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song song3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song song4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song song5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

        Song allSongs[] = new Song[5];
        allSongs[0] = song1;
        allSongs[1] = song2;
        allSongs[2] = song3;
        allSongs[4] = song4;
        allSongs[5] = song5;


        Album album1 = new Album("Now that’s what I call music 98",allSongs, "Universal Music", 2016);



        textArea.append(String.valueOf(album1));

        JOptionPane.showMessageDialog(null,textArea,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        trackString = JOptionPane.showInputDialog("Which track number would you like to play ? : ");
        track = Integer.parseInt(trackString);

        JOptionPane.showMessageDialog(null,"Now playing track - details as follows:" + "\n" + track,"Playing Track",JOptionPane.INFORMATION_MESSAGE);





    }
}

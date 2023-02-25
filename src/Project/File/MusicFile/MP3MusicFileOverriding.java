package Project.File.MusicFile;

public class MP3MusicFileOverriding extends AbstractMusicFile {

    int quality;

    public MP3MusicFileOverriding(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    public int getQuality() {
        return quality;
    }

    // methode overriding test zakomentowaæ jak nie u¿ywane
    @Override
    public String getName() {
        return "Plik nazywa sie " + super.getName();
    }

    @Override
    public String toString() {
        return "MP3MusicFile{" +
                "bandName='" + bandName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

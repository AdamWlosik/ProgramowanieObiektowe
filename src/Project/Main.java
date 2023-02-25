package Project;

import Project.Drive.Drive;
import Project.Drive.HDDDrive;
import Project.Drive.SSDDrive;
import Project.File.File;
import Project.File.ImageFile.GIFImageFile;
import Project.File.ImageFile.JPGImageFile;
import Project.File.MusicFile.MP3MusicFile;
import Project.File.MusicFile.MP3MusicFileOverriding;
import Project.UsbDevice.MemoryStick;
import Project.UsbDevice.Mouse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    @Test
    public void test() {
        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());

        monitor.setLowResolution();
        System.out.println(monitor.getResolution());

        //HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();

        Computer computer = new Computer(monitor, drive);


        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);
    }

    // Test skoñczonej aplikacji
    @Test
    public void finishApplicationTest() {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "xyz", "aaaaa", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

    }


    // methode overriding test
    @Test
    public void methodeOverridingTest() {
        MP3MusicFileOverriding mp3MusicFile = new MP3MusicFileOverriding("plik.mp3", 200, "Butelki", "Benzyny", 90);
        System.out.println(mp3MusicFile.getName());
        System.out.println(mp3MusicFile);
    }

    // instanceof test
    @Test
    public void instanceofTest() {
        JPGImageFile jpgImageFile = new JPGImageFile("plik.jpg", 100, 100);
        GIFImageFile gifImageFile = new GIFImageFile("plik1.gif", 200);

        List<File> files = new ArrayList<>();
        files.add(jpgImageFile);
        files.add(gifImageFile);

        for (File file : files) {
            if (file instanceof JPGImageFile) {
                System.out.println("To plik JPG");
            } else if (file instanceof GIFImageFile) {
                System.out.println("To plik GIF");
            }
        }
    }

    // metoda domyœlna default int getVersion() w klasie File
    @Test
    public void defaultMethodeTest(){
        GIFImageFile gifImageFile = new GIFImageFile("plik.gif", 100);
        System.out.println(gifImageFile.getVersion());

    }

    // pola i metody publiczne statyczne w klasie Monitor mo¿emy z metod statycznych klasy wyci¹gn¹æ dane bez
    // tworzenia instancji tej klasy
    @Test
    public void staticMethodeTest() {
        System.out.println(Monitor.MAX_HEIGHT);
        System.out.println(Monitor.getMaxHeight());

    }

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4};

        for(int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

    }

}


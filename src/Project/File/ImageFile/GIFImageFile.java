package Project.File.ImageFile;

public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(String name, int size) {
        super(name, size);

    }

    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }
}

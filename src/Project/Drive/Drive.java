package Project.Drive;

import Project.File.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String name);
}

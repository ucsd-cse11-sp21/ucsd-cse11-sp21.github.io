import tester.*;
import java.util.List;

interface FolderContent {
    boolean containsFile(String name);
}

class File implements FolderContent {
    String name;
    String contents;
    File(String name, String contents) {
        this.name = name;
        this.contents = contents;
    }
    public boolean containsFile(String name) {
        return this.name.equals(name);
    }
}

class Folder1 implements FolderContent {
    String name;
    List<FolderContent> contents;
    Folder1(String name, List<FolderContent> contents) {
        this.name = name;
        this.contents = contents;
    }
    public boolean containsFile(String name) {
        for (FolderContent fc: this.contents) {
            if (fc.containsFile(name)) {
                return true;
            }
        }
        return false;
    }
}


class Folder2 {
    String name;
    List<File> files;
    List<Folder2> folders;
    Folder2(String name, List<File> files, List<Folder2> folders) {
        this.name = name;
        this.files = files;
        this.folders = folders;
    }
}


class FilesystemExamples {

    //Folder1 example
    Folder1 dictionaries = new Folder1("dictionaries", List.of());
    Folder1 poems = new Folder1(
        "poems",
        List.of(
            new File("haiku.txt", "")
        )
    );
    Folder1 textfiles = new Folder1(
        "textfiles",
        List.of(
            dictionaries,
            poems,
            new File("words.txt", "hello\ngoodbye\na\ncat")
        )
    );
    Folder1 lecture28a00 = new Folder1(
        "Lecture-Live A00", 
        List.of(
            new File("FilesystemExamples.java", "<java code>"), 
            textfiles
        )
    );

    //Test as a field definition
    boolean fieldName = lecture28a00.containsFile("haiku.txt");

    //Test as a test method
    void testContainsFile(Tester t) {
        t.checkExpect(lecture28a00.containsFile("haiku.txt"), true);
        t.checkExpect(lecture28a00.containsFile("notthere.txt"), false);
        t.checkExpect(dictionaries.containsFile("haiku.txt"), false);
        t.checkExpect(textfiles.containsFile("FilesystemExamples.java"), false);
    }











    //Folder2 example
    Folder2 dictionaries2 = new Folder2(
        "dictionaries", 
        List.of(),
        List.of()
    );
    Folder2 poems2 = new Folder2(
        "poems",
        List.of(
            new File("haiku.txt", "")
        ),
        List.of(
        )
    );
    Folder2 textfiles2 = new Folder2(
        "textfiles",
        List.of(
            new File("words.txt", "hello\ngoodbye\na\ncat")
        ),        
        List.of(
            dictionaries2,
            poems2
        )
    );
    Folder2 lecture28a00f2 = new Folder2(
        "Lecture-Live A00", 
        List.of(
            new File("FilesystemExamples.java", "<java code>")
        ),
        List.of(
            textfiles2
        )
    );


  // Challenge: implement and test countFiles, which takes no arguments and
  // returns the total number of File objects contained within a Folder1/Folder2
  // and all of its subfolders

  // Challenge: implement and test containsString, which takes a string to
  // search for in a directory and returns true if any file found in that
  // directory contains a file whose contents contains that string

  // Challenge: implement and test totalSize, which takes no arguments and
  // returns the total count of characters in all the files in that directory
  // structure.

}

package CommandPattern;

public class UnixFileSystemReciever implements FileSystemReciever{

    @Override
    public void openfile(){
        System.out.println("Opening file in UNIX System");
    }

    @Override
    public void writefile(){
        System.out.println("Writing file in Unix System");
    }

    @Override
    public void closefile() {
        System.out.println("Closing file in Unix System");
    }
}

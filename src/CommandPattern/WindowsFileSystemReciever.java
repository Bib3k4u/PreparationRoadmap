package CommandPattern;

public class WindowsFileSystemReciever implements FileSystemReciever{
    @Override
    public void openfile(){
        System.out.println("Opening file in Windows System");
    }
   @Override
   public void writefile(){
        System.out.println("Writing file in Windows System");
    }
    @Override
    public void closefile(){
        System.out.println("Closing file in Windows System");
    }
}

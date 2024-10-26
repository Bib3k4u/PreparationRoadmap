package CommandPattern;

public class FileSystemRecieverUtil {
    public static FileSystemReciever getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReciever();
        }else{
            return new UnixFileSystemReciever();
        }
    }
}

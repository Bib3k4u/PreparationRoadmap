package CommandPattern;


public class WriteFileCommand implements Command{
    private FileSystemReciever fileSystemReciever;

    public WriteFileCommand(FileSystemReciever fileSystemReciever){
        this.fileSystemReciever = fileSystemReciever;
    }
    @Override
    public void execute(){
        this.fileSystemReciever.writefile();
    }
}

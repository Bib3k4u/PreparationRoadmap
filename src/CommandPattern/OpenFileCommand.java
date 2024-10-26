package CommandPattern;

public class OpenFileCommand implements Command{
    private FileSystemReciever fileSystemReciever;

    public OpenFileCommand(FileSystemReciever fileSystemReciever){
        this.fileSystemReciever = fileSystemReciever;
    }

    @Override
    public void execute(){
        this.fileSystemReciever.openfile();
    }
}

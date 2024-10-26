package CommandPattern;

public class CloseFileCommand implements Command{
    private FileSystemReciever fsReciever;
    public CloseFileCommand(FileSystemReciever fsReciever){
        this.fsReciever = fsReciever;
    }
    @Override
    public void execute(){
        this.fsReciever.closefile();
    }
}

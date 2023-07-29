package BehaviouralPatterns.ChainOfResponsibility.Exercise;

public abstract class DataReader {
    private DataReader nextReader;

    public abstract String getExtension();
    public abstract void DoRead(String fileName);

    public void SetNext(DataReader nextDataReader){
        nextReader = nextDataReader;
    }



    public void read(String fileName) {
        if(fileName.endsWith(getExtension())){
            DoRead(fileName);
            return;
        }
        if(nextReader!=null)
            nextReader.read(fileName);
        else
            System.out.println("File Not Supported");
    }
}

package readingfile;


public  class DigitalOnlyFileReader extends AbstractFileReader{

    public DigitalOnlyFileReader(String filepath){
        super(filepath);
    }

    @Override
    protected String parseLine(String  line){
        return line.replaceAll("[^0-9]","");
    }
}

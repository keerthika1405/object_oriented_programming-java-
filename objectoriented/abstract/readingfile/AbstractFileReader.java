package readingfile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractFileReader {
    
    private  final Path filepath;

    protected  AbstractFileReader(String filepath){
        this.filepath =Path.of(filepath);
    }
    
    public String  getpath(){
        return filepath.toString();
    }

    public List<String> readFile() throws IOException{
        return Files.lines(filepath)
                .map(this::parseLine)
                .collect(Collectors.toList());
    }
    protected  abstract String parseLine(String  line);
}

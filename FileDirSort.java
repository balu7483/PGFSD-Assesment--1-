package lockedMe.com;
// good resource for sorting collections - https://javatutorialhq.com/java/example-source-code/io/file/list-files-sorted-filename-ascending-descending-java/
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileDirSort {
	
	public static void AscOrder() {
        File fileDir = new File("C:\\Users\\robie\\eclipse-workspace\\Phase1FinalProject\\");
        if(fileDir.isDirectory()){
            List <String>listFile = Arrays.asList(fileDir.list());
            Collections.sort(listFile);
            System.out.println("---------------------------------------------------------");
            System.out.println("Sorting filenames in an ascending order ... ");
            for(String s:listFile){
                System.out.println(s);	                
            }
            System.out.println("---------------------------------------------------------");
            ProjectMenus.MainMenu();
        }
        else{
            System.out.println("Error. The following directory does not exist:" + fileDir.getAbsolutePath());
            ProjectMenus.MainMenu();
        }
        
    }

}

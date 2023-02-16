package lockedMe.com;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.*;

public class BusinessLevelOperations {
	
    public static void SearchFile() {

        System.out.println("Please enter a filename to search for:");
        Scanner Searchsc = new Scanner(System.in);
        String SearchName = Searchsc.next();
        File searchfile = new File("C:\\Users\\robie\\eclipse-workspace\\Phase1FinalProject\\"+SearchName);
        
        if (searchfile.exists()) {
            System.out.println("File found: " + searchfile.getAbsolutePath());
            
        } else {
            System.out.println("File Not Found");
            
        }
        ProjectMenus.BusinessLevelOperationsMenu();
        
    }
    
    public static void CreateFile() throws IOException {
    	String createfilename;
        Scanner Createsc = new Scanner(System. in ); 
        System.out.println("Please enter a new file name to create:");
        createfilename = Createsc.nextLine();

        
        Path createfilepath = Paths.get("C:\\Users\\robie\\eclipse-workspace\\Phase1FinalProject\\" + createfilename);
        
        
        try {
            

        		Files.createFile(createfilepath);
                System.out.println("New file created: " + createfilepath);
                ProjectMenus.BusinessLevelOperationsMenu();
                
            
        } catch (FileAlreadyExistsException ex ) {
        	
            System.out.println("New file cannot be created. It already exists");
            ProjectMenus.BusinessLevelOperationsMenu();
        }
    }
    public static void DeleteFile() {
        String deletefilename;
        Scanner Deletesc = new Scanner(System.in);
        System.out.println("Please enter the file you would like to delete (along with its extension ie: .txt, .png, etc.):");
        deletefilename = Deletesc.nextLine();
        //File deletedfile= new File("C:\\Users\\robie\\eclipse-workspace\\Phase1FinalProject\\" + deletefilename);
        
        Path deletefilepath = Paths.get("C:\\Users\\robie\\eclipse-workspace\\Phase1FinalProject\\" + deletefilename);

        try {

        	boolean result = Files.deleteIfExists(deletefilepath);

        	if (result) {
        		System.out.println("File has been deleted: " + deletefilename);
        		ProjectMenus.BusinessLevelOperationsMenu();
        	}else {
        		System.out.println("File does not exist");
        		ProjectMenus.BusinessLevelOperationsMenu();
        	}
        }catch (IOException e) {

        	// TODO Auto-generated catch block
        	System.out.println("An error occurred.");
        	e.printStackTrace();
        	ProjectMenus.BusinessLevelOperationsMenu();
        }
    }
}



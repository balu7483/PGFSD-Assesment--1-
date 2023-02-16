package lockedMe.com;

import java.util.Scanner;

public class ProjectMenus {
    
	public static void MainMenu() {
		System.out.println("---------------------------------------------------------");
    	System.out.println("Choose from a to c:");
        System.out.println("a) Display the Current File Names in Ascending Order");
        System.out.println("b) Perform a Business Level Operation");
        System.out.println("c) Exit the Application");  	
        System.out.println("---------------------------------------------------------");
    }	    
	
    public static void BusinessLevelOperationsMenu() {	    	
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Choose from a to d:");
        System.out.println("a) Search for a File");
        System.out.println("b) Create New File");
        System.out.println("c) Delete a File");
        System.out.println("d) Go to Main Menu");
        System.out.println("---------------------------------------------------------");
        String BusinessOp;
        Scanner BusinessOps=new Scanner(System.in);
    	try {	    		
             BusinessOp = BusinessOps.nextLine();
             switch(BusinessOp) {
             
           //Can choose Upper or Lower Case Letters
             
             case "a":
                 System.out.println("Search for new file selected ... ");
                 BusinessLevelOperations.SearchFile();
                 break;
             case "A":
                 System.out.println("Search for new file selected ... ");
                 BusinessLevelOperations.SearchFile();
                 break;
                 
             case "b":
                 System.out.println("Create new file selected ... ");
                 BusinessLevelOperations.CreateFile();
                 break;  
             case "B":
                 System.out.println("Create new file selected ... ");
                 BusinessLevelOperations.CreateFile();
                 break;  
                 
             case "c":
                 System.out.println("Delete file selected ... ");
                 BusinessLevelOperations.DeleteFile();
                 break;
             case "C":
                 System.out.println("Delete file selected ... ");
                 BusinessLevelOperations.DeleteFile();
                 break;
                 
             case "d":
                 System.out.println("Main menu selected ... ");
                 ProjectMenus.MainMenu();
                 break;
             case "D":
                 System.out.println("Main menu selected ... ");
                 ProjectMenus.MainMenu();
                 break;
             default:
            	 System.out.println("Entry Invalid. Choose Again");
            	 ProjectMenus.BusinessLevelOperationsMenu();
         }
        }catch(Exception e) {
           
           ProjectMenus.BusinessLevelOperationsMenu();
        }	
    }
    
    

}

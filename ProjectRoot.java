package lockedMe.com;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ProjectRoot {
	    
	    public static void main(String[] args) {
	    	
	    	//Welcome Screen:
	    	System.out.println("---------------------------------------------------------");
	        System.out.println("Website: LockedMe.com");
	    	System.out.println("Company: Lockers Pvt. Ltd.");
	        System.out.println("SimpliLearn Project: Created by Robert Hertel");
	        System.out.println("---------------------------------------------------------");
	        
	        Scanner MainMenuScanner = new Scanner(System.in);
	 		ProjectMenus.MainMenu();
	 		String MainMenuSelect;
	 		
	 		
	        while(true) {
	              
	              MainMenuSelect = MainMenuScanner.nextLine();
	              
	              switch(MainMenuSelect) {
	                
	              //Can choose Upper or Lower Case Letters
	              
	                case "a" :
	                    System.out.println("Current Files Sorted in Ascending Order");
	                    FileDirSort.AscOrder();
	                    break;
	                    
	                case "A" :
	                    System.out.println("Current Files Sorted in Ascending Order");
	                    FileDirSort.AscOrder();
	                    break;
	                    
	              	case "b" :
	              		System.out.println("Entering Business Level Operations Menu ...");
	              		ProjectMenus.BusinessLevelOperationsMenu();
	                	break; 
	                	
	              	case "B" :
	              		System.out.println("Entering Business Level Operations Menu ...");
	              		ProjectMenus.BusinessLevelOperationsMenu();
	                	break; 
	                
	                case "c" :
	                    System.out.println("Application closed");
	                    System.exit(0);
	                    break;
	                    
	                case "C" :
	                    System.out.println("Application closed");
	                    System.exit(0);
	                    break;
	                    
	                default:
	                	System.out.println("---------------------------------------------------------");
	                    System.out.println("Entry Invalid. Choose Again");
	                    System.out.println("Choose from a to c:");
	        	        System.out.println("a) Display the Current File Names in Ascending Order");
	        	        System.out.println("b) Perform a Business Level Operation");
	        	        System.out.println("c) Exit Application");  
	        	        System.out.println("---------------------------------------------------------");
	                    break;
	            }
	         }
	      }
	   }
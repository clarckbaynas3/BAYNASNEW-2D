
package baynas.pkg2d;

import java.util.Scanner;


public class BAYNAS2D {

    
    public static void main(String[] args) {
    
      
  
    
   Scanner sc = new Scanner (System.in);
        String response;
        do{
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.print("Enter Action: ");
        int action =  sc.nextInt();
        BAYNAS2D customer = new BAYNAS2D(); 
        switch(action){
            case 1:
               
            customer.addcustomer();
            break;
            
            case 2:
            customer.viewcustomer();
            break;
        }
            System.out.println("Do1 you want to continue? (yes/no): ");
            response = sc.next();  
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thank you!"); 
    }
    public void addcustomer(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("customer First Name: ");
        String fname = sc.next();
        System.out.print(" customer Last Name: ");
        String lname = sc.next();
        System.out.print("customer Email: ");
        String email = sc.next();
        System.out.print("customer Status: ");
        String status = sc.next();

        String sql = "INSERT INTO tbl_customer (c_fname, c_lname, c_email, c_status) VALUES (?, ?, ?, ?)";
       config conf = new config();
       conf.addRecord(sql, fname, lname, email, status);

    }
    
    private void viewcustomer() {
        config conf = new config();
        String votersQuery = "SELECT * FROM tbl_customer";
        String[] votersHeaders = {"customer ID", "First Name", "Last Name", "Email", "Status"};
        String[] votersColumns = {"c_id", "c_fname","c_lname", "c_email", "c_status"};
            
        
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }

   

  
   
    


    
  
}

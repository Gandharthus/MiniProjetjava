package entities;

import java.sql.*;

import java.util.Scanner;
class jdbc {

	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/commande_db?characterEncoding=utf8", "root", "root");
			//here commande_db is database name, root is username and password  
			

			
			System.out.println("entrer les coordonnees du client\n");
			
			Client test = new Client();
			
	        try ( Scanner scanner = new Scanner( System.in ) ) {

	            
	            System.out.print( "\nNom : " );
	            test.setNom( scanner.next());
	            
	            System.out.print( "\nPrenom : " );
	            test.setPrenom( scanner.next());
	            
	            System.out.print( "\nAge : " );
	            test.setAge( scanner.nextInt());
	            
	            System.out.print( "\nAdresse : " );
	            test.setAdresse( scanner.next());
	            
	            System.out.print( "\nVille : " );
	            test.setVille( scanner.next());
	            
	            System.out.print( "\nMail : " );
	            test.setMail( scanner.next());
	            
	            System.out.printf( "\nVos valeurs on ete ajoutés");
	            
	        }
	        
	        PreparedStatement stmt=con.prepareStatement("insert into client(nom,prenom,age,adresse,ville,mail) values(?,?,?,?,?,?)"); 
	        stmt.setString(1,test.getNom());//1 specifies the first parameter in the query  
	        stmt.setString(2,test.getPrenom());
	        stmt.setInt(3,test.getAge());//1 specifies the first parameter in the query  
	        stmt.setString(4,test.getAdresse()); 
	        stmt.setString(5,test.getVille());//1 specifies the first parameter in the query  
	        stmt.setString(6,test.getMail()); 
	
 
	          
	        int i=stmt.executeUpdate();  
	        
	        System.out.println(i+" records inserted");  
	          
	        con.close(); 
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
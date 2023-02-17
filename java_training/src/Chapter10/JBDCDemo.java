package Chapter10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JBDCDemo {
    public static void main(String[] args) {
//        new JBDCDemo().findAll();
//        new JBDCDemo().createEmployee();
//        new JBDCDemo().updateEmployee();
        new JBDCDemo().deleteEmployee();
    }

    public Statement getConn(){
        String path = "C:\\Users\\TMY-15\\Desktop\\Java Training\\training.db";
        Statement stmt = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);
            stmt = conn.createStatement();

        } catch (Exception ex){
            ex.printStackTrace();

        }
        return stmt;
    }
    public void findAll(){

        try {
            Statement stmt = getConn();
            String sql = "SELECT * FROM Employee";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (Exception ex){
            ex.printStackTrace();

        }
    }

    public void createEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.next();
        System.out.println("Please enter age: ");
        int age = scanner.nextInt();

        try {
            Statement stmt = getConn();
            String sql = "INSERT INTO Employee (name, age) VALUES ('"+name+"', "+age+")";
            stmt.execute(sql);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void updateEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.next();
        System.out.println("Please enter id: ");
        int id = scanner.nextInt();

        try {
            Statement stmt = getConn();
            String sql = "UPDATE Employee SET name = '"+name+"' WHERE id = " + id;
            stmt.execute(sql);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void deleteEmployee(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter id: ");
        int id = scanner.nextInt();

        try {
            Statement stmt = getConn();
            String sql = "DELETE FROM Employee WHERE id = " + id;
            stmt.execute(sql);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

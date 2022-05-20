import java.sql.*;
import java.util.Scanner;

public class MdBb {
    public static void main(String[] args) {
        System.out.println("We Are BACK");

        try{

            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","er34I76Dg!");

            Statement stmt=con.createStatement();

            //ResultSet rs = stmt.executeQuery("select * from users");
            //while(rs.next()){
            //   System.out.println(rs.getString("Name"));
            //}

/*
            PreparedStatement stmt = con.prepareStatement("insert into users ('Name', 'Email', 'Password', 'Mobile', 'Gender') " +
                    "values ('Myself', 'labbadabbadubdbu@gmail.com', '123456', '1234', 'Male')");

            stmt.setString( 1,"Test");
            stmt.setString( 2,"Test");
            stmt.setString( 3,"Test");
            stmt.setString( 4,"Test");
            stmt.setString( 5,"Test");
            stmt.setString( 6,"Test");

            int i=stmt.executeUpdate();
            
 */
            Scanner scanner = new Scanner(System.in);





            while(true){
                System.out.println("What are you looking for? \n");

                String input = scanner.nextLine();

                input = input.trim();

                boolean isCountry = false;
                boolean isContinent = false;
                boolean isCity = false;

                if(!isContinent){
                    int countryCount = 0;
                    ResultSet rs1 =stmt.executeQuery("select * from country where Continent= '"+ input + "'");
                    while(rs1.next()){
                        isContinent = true;
                        countryCount++;
                    }
                    if(isContinent){
                        System.out.println("You searched For Continent Which Has "+ countryCount + " Countries");
                    }
                }

                if( !isContinent ){
                    ResultSet rs1 =stmt.executeQuery("select * from country where Name= '"+ input + "'");
                    while(rs1.next()){
                        isCountry = true;
                        System.out.println("You searched For Country. Code is "+ rs1.getString("Code") + " Population is "+ rs1.getInt("Population") + " Region is "+ rs1.getString("Region") + " Continent is "+ rs1.getString("Continent") + ".");
                    }
                }

                if( !isContinent && !isCountry){
                    ResultSet rs1 =stmt.executeQuery("select * from city where Name= '"+ input + "'");
                    while(rs1.next()){
                        isCity = true;
                        System.out.println("You searched For City. Code is "+ rs1.getString("CountryCode") + " Population is "+ rs1.getInt("Population"));
                    }
                }

                if(!isCountry && !isContinent && !isCity){
                    System.out.println("Please search something that makes sense");
                    break;
                }
            }

            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}


/// take user input... if it is continent return number of countries... if it is country name return details of country...
/// if it is city.. return city details... otherwise return null
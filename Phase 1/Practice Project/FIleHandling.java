package Practice_Projects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FIleHandling {

	public static void main(String[] args) {
		
		        System.out.println("Enter File Name: ");

		        Scanner sc = new Scanner(System.in);
		        String nameOfFile = sc.next();

		        File file = new File(nameOfFile);

		        try {
		            if (file.createNewFile()) {
		                System.out.println("File Created Successfully");
		            } else {
		                System.out.println("File already exists");
		            }

		            boolean run = true;
		            while (run) {


		                System.out.println("Select an operation :");
		                System.out.println("Press 1: Read");
		                System.out.println("Press 2: Write");
		                System.out.println("Press 3: Append");
		                System.out.println("Press 4: Exit");

		                int ip = sc.nextInt();

		                switch (ip) {
		                    case 1:
		                        readFile(file);
		                        break;
		                    case 2:
		                        writeFile(file);
		                        break;
		                    case 3:
		                        appendFile(file);
		                        break;
		                    case 4:
		                        run = false;
		                        break;
		                }
		            }

		        } catch (Exception e) {
		            System.out.println("Error Occured");
		        }


		    }

		    static void readFile(File file) {

		        try {
		            Scanner myReader = new Scanner(file);
		            while (myReader.hasNextLine()) {
		                String data = myReader.nextLine();
		                System.out.println( data );
		            }
		            myReader.close();
		        } catch (Exception e) {
		            return;
		        }

		    }

		    static void writeFile(File file) {
		        System.out.println("Write Something:");
		        Scanner sc = new Scanner(System.in);
		        String x = sc.nextLine();
		        try {
		            FileWriter myWriter = new FileWriter(file);
		            myWriter.write(x);
		            myWriter.close();
		        } catch (Exception e) {
		            return;
		        }

		    }

		    static void appendFile(File file) {

		        System.out.println("Write Something:");
		        Scanner sc = new Scanner(System.in);
		        String x = sc.nextLine();
		        try {
		            BufferedWriter out = new BufferedWriter(
		                    new FileWriter(file, true));
		            out.write(x);
		            out.close();
		        } catch (Exception e) {
		            return;
		        }
	}

}

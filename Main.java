import java.io.*;
class Main {
  public static void main(String args[]){
        //add code to run the methods
        System.out.println("Sum of positive values: " + countTotalPositiveValue("fifty.txt"));
      

        int [] nums = {1,3,5,7,9,11,13,15,17,19};
        String [] odds = {"One", "Three", "Five", "Seven", "Nine"};
        
        writeToFile(nums, "odd numbers.txt");
        writeToFile(odds, "odd in words.txt");

        // see notes on writeToFile method - this is how you would call the methods using different parameters
        /* writeToFile(nums,"odd numbers.txt")
           writeStringToFile(odds,"odds in words.txt")
         */
    }//main method
    // return total value of numbers in specified file
    public static int countTotalPositiveValue(String fileName) {

      int sumPostive = 0;
       // open file
       
  try {
    FileReader fr = new FileReader(fileName);BufferedReader br = new BufferedReader(fr);
    String line = br.readLine();
    while (line != null) { // while not end of file   
    int num = Integer.parseInt(line);  
     if (num >= 0){
         sumPostive += num;
     }//if
   
    line = br.readLine();
    }//while
    br.close();
    fr.close();
   
  }catch(IOException e){
    System.out.println(e);
  }//catch / try
    return sumPostive;
    }//countTotalPositiveValue()

    // write array data elements to specified file
    public static void writeToFile(int[] data,  String fileName) {

      

      try{
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
          //Trying with both an array of integers and an array of Strings, saving at one page // you should amend this and split into 2 methods 
          // think about using this method in a real program, everytime you will need use this method you will need to send through a int [] and a string [] along with the 2 filenames. If you split this method into 2 and have 1 that works with int [] and the 2nd method to work with string [] you will have developed more dynamic usable code

            for (int i=0; i<data.length; i++) {
                pw.println(data[i] + "\n");
            }//for
         
            pw.close();
            bw.close();
            fw.close();
          
            
        }//try
        catch (IOException e) {
            System.out.println(e);
        }//catch
    }

    public static void writeToFile(String [] odds, String fileName) {

      try{
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);


            for (int i=0; i<odds.length; i++) {
                pw.println(odds[i]);
            }//for
    
            pw.close();
            bw.close();
            fw.close();
            
        }//try
        catch (IOException e) {
            System.out.println(e);
        }//catch

    }//writeToFile()

}
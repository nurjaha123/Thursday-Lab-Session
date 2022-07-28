1.Paul has bought a new notebook of "idol" brand, with a processor speed of 2.66GHz, 8 GB of RAM, 500GB hard disk, 
with a 15-inch monitor, for $1760.55. He has chosen service plan 'C' among plans 'A', 'B', 'C', and 'D', 
plus on-site servicing but did not choose extended warranty. Identify the data types and name the variables.


class Store
{
 
public static void main(String[] args)
{

String customername = "Paul"; 
String brand = "idol";
double processor =2.66;
byte ram =8;
short hardDisk =500;
byte monitor =15;
char planA ='A';
char planB = 'B';
char planC = 'C';
char planD = 'D';

System.out.println("Customer Name: "+ customername + "(Date Type: String)");
System.out.println("Brand Name: "+ brand + "(Data Type: String)");
System.out.println("Processor speed: " + processor + "GHz" + "(Data Type: double)"); 
System.out.println("Ram capacity: "+ ram + "GB" + "(Data Type: byte)"); 
System.out.println("Hard Disk: " + hardDisk + "GB" +" (Data Type: short)"); 
System.out.println("Monitor Size: " + monitor + "inch" +" (Data Type: byte)"); 
System.out.println("Plans:" +planA +","+ planB+"," + planC+"," + planD + " (Data Type:char)"); 
}
}

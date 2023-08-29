
package hospital_system;

import java.util.Scanner;

public class Hospital_System {


    public static void main(String[] args) {
       Hospital h=new Hospital();
       Scanner s=new Scanner(System.in);
       System.out.print("Enter no of rooms in the hospital:");
       h.setRooms(s.nextInt());
       System.out.print("Enter no of beds in each room:");
       h.setBeds(s.nextInt());
       System.out.print("Enter total number of patients in the hospital:");
       h.setPatients(s.nextInt());
       System.out.print("Enter per day charges of the hospital:");
       h.setPer_day_charges(s.nextInt());
       System.out.print("Enter no of patients stayed in the hospital:");
       h.setDays(s.nextInt());
       System.out.println("output>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
       
       System.out.println("Number of rooms in hospital: "+h.getRooms());
       System.out.println("Number of beds in each room: "+ h.getBeds());
       System.out.println("Total number of patients in hospital: "+h.getPatients());
       System.out.println("Per day charges of the hospital: "+h.getPer_day_charges());
       System.out.println("Total no of days the patient stayed in the hospital: "+h.getDays());
       
       System.out.print("Number of available beds is: ");
       h.bed_allotment();
       System.out.print("Total charges: ");
       h.total_charges();
    }
    
}
class Hospital{
    private int rooms;
     private int beds;
    private int per_day_charges;
    private int days;
    private int patients;

    
    
    
    public Hospital(){
        System.out.println("Constructor Called");
    }
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getPer_day_charges() {
        return per_day_charges;
    }

    public void setPer_day_charges(int per_day_charges) {
        this.per_day_charges = per_day_charges;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        this.patients = patients;
    }
   
    public void bed_allotment(){
        int Beds_available=(rooms*beds)-patients;
        System.out.println(Beds_available);
    }
    public void total_charges(){
        int Total_charges=per_day_charges*days;
        System.out.println(Total_charges);
    }
}
package com.company;
import java.util.*;
public class Univer {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    ArrayList<Prepod> arrp = new ArrayList<>();
	arrp.add(new Prepod("Nikita", 10000));
	arrp.add(new Prepod("Ivan", 10000));
	arrp.add(new Prepod("Maria", 10000));
	arrp.add(new Prepod("Petr", 10000));
	System.out.println("Teachers:");
	for (Prepod i: arrp){
	    i.outp();
        }

	ArrayList<Student> arrs = new ArrayList<>();
	arrs.add(new Student("Dima", 6, true, true));

	ArrayList<Course> arrsub = new ArrayList<>();
	arrsub.add(new Course("Algebra",5,2 ));
	arrsub.add(new Course("Geometry",5,1 ));
    arrsub.add(new Course("Phyzics",5,4 ));
    arrsub.add(new Course("English",5,3 ));
        System.out.println("");
        System.out.println("Courses:");
        for (Course j: arrsub){
         j.outp();
        }

	ArrayList<Timetable> timetables = new ArrayList<>();
	timetables.add(new Timetable());

	for (Timetable y: timetables){

    }
    }
}

class Prepod{

    public Prepod (String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void outp(){
        System.out.println("Name: "+getName()+" Salary = "+getSalary());
    }

    private String name;
    private double salary;
}

class Student{
    public Student(String n, int sem, boolean f, boolean s) {
        name = n;
        semestr = sem;
        forma = f;
        stip = s;
    }

    public String getName(){
        return name;
    }

    public int getSemestr(){
        return semestr;
    }

    public boolean getForma(){
        return forma;
    }

    public boolean getStip(){
        return stip;
    }
    public void outp(){
        System.out.println("Name: " + getName() + " Semestr = "
                + getSemestr() + " forma= " + (getForma() ? "Denna" : "Zaochna") + " stipendiya= "
                + (getStip() ? "+" : "-"));
    }

    private String name;
    private int semestr;
    private boolean forma;
    private boolean stip;

}
class Course {
    public Course(String n, int pte, int p) {
        nazva = n;
        PTE = pte;                //people to enter
        para = p;
    }
        public String getNazva(){
            return nazva;
        }
        public int getPTE(){
            return PTE;
        }
        public int getPara(){
            return para;
        }

        public void outp(){
        System.out.println("Name of subject: "+getNazva()+"people to enter: "+getPTE()+"Position"+getPara());
        }

        private String nazva;
        private int PTE;
        private int para;
}
class Timetable{
    public Timetable(){
        Prepod arrp;
        Course arrsub;

    }
    public void getTime(){
        System.out.println("Name of prepod: ");
    }
    /*public Prepod getName(){
      return arrp();
    }
    public Subject getName(){
        return getName();
    }*/
}
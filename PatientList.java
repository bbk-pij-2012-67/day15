import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class PatientList{



	private List<Patient> patients = new LinkedList<>();
	public void addPatient(String name, int yearOfBirth){
		try{
			Patient newPatient = new Patient(name, yearOfBirth);
			patients.add(newPatient);
		}catch (IllegalArgumentException ex){
			ex.printStackTrace();
		}
	}

	public void printList(){
		for (Patient next : patients){
			System.out.println(next.getName() + " " + next.getYearOfBirth());
		}
	}

	public static void main(String[] args){
		PatientList pl = new PatientList();
		String name;
		int yearOfBirth=0;
		do{
			System.out.println("Add a patient to the list:");
			System.out.println("Enter patient name (enter 0 to end):");
			name = System.console().readLine();
			if(!name.equals("0")){
				System.out.println("Enter patient year of birth:");
				yearOfBirth = Integer.parseInt(System.console().readLine());

				pl.addPatient(name,yearOfBirth);
			}
		}while(!name.equals("0"));
		pl.printList();

	}
	private class Patient{
		private  String name;
		private int yearOfBirth;

		public Patient(String name, int yearOfBirth){
			if (Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth < 0 || Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth > 130)
				throw new IllegalArgumentException("Year supplied is invalid");
			this.name = name;
			this.yearOfBirth = yearOfBirth;
		}

		public String getName(){
			return this.name;
		}

		public int getYearOfBirth(){
			return this.yearOfBirth;
		}
	}


}

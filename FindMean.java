public class FindMean{



	private int[] inputList = null;
	private int size;

	private int[] getList(){

		int[] userList = new int[this.size];
		Integer num=null;
		for (int c=0;c<this.size;c++){
			do{
				num = getInputNumber();
			}while(num == null);

			userList[c] = (int)num;
		}
		return userList;
	}

	private Integer getInputNumber(){

		System.out.println("Please enter a number");
		String str = System.console().readLine();
		return stringToInteger(str);
	}

	private Integer stringToInteger(String str){
		//returns null if not a number
		Integer num = null;
		try{
			num = Integer.valueOf(str);
		}catch(NumberFormatException ex){
			System.out.println(str + " is not a valid number.");
			num = null;
		}finally{
			return num;
		}
	}

	public double mean(){

		Integer size = null;
		do{
			System.out.println("How many numbers do you wish to enter?");
			size = stringToInteger(System.console().readLine());
		}while(size == null);
		this.size = (int)size;
		int[] myList = getList();
		int total = 0;
		for (int c=0;c<this.size;c++){
			total += myList[c];
		}
		return (double)total/this.size;
	}

	public static void main(String[] args){

		FindMean fm = new FindMean();
		System.out.println("The mean of your set of numbers is " + fm.mean());

	}
}

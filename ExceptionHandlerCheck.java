import java.util.ArrayList;
import java.util.List;

public class ExceptionHandlerCheck{

	public static void main(String[] args){
		ExceptionHandlerCheck ec = new ExceptionHandlerCheck();

		ec.launch();

	}

	public void launch() {
		List<Integer> intList = null;
		try{
			intList.add(1);
		}catch (NullPointerException ex){
			System.out.println("NullPointerException exception handled");
			ex.printStackTrace();
		}catch (Exception ex){
			System.out.println("General exception handled");
			ex.printStackTrace();
		}
	}
}

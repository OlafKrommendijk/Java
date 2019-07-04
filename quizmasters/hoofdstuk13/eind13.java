package hoofdstuk13;

//Importeren van de Java Calender API
import java.util.Calendar;

public class eind13 {
	public static void main(String[] args) {
		//Met Calender.Getinstance wordt gebruikt om de default en local time zone hierdoor ziet de opgehaalde tijd er ook zo uit zoals hij er uit ziet in de console, getTime geeft de huidig tijd terug.
		System.out.print(Calendar.getInstance().getTime());
	}
}

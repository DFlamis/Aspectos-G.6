import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public aspect Log
{
	File file = new File("Color-Log.txt");
	Calendar cal = Calendar.getInstance();
	
    public void writeFile(String linea) {
    	try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(linea + "\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    pointcut color(): call( void Colores.observer() );
    after() : color()
    {
    	String text = "Color cambiado - Fecha: " + cal.getTime();
		System.out.println(text);
		writeFile(text);
    }
}

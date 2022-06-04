import javafx.scene.layout.VBox;

public class Colores
{
    public static void observer()
    {

    }
    
    public static void cambiarColor(String color, VBox container)
    {
        container.styleProperty().set("-fx-background-color: "+color);
    }
}

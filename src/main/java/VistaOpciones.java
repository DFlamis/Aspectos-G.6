import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VistaOpciones extends Observable
{
    public VBox inicio;

    private Observer observer;

    public VistaOpciones()
    {
        inicio = new VBox();
        
        //Label
        Label head = new Label("Observers Grupo: 6");
        head.setFont(new Font("Times New Roman", 30));
        Label space = new Label("");
        space.setFont(new Font(10));

        //Botones
        Button verde = new Button("Verde");
        Button rojo = new Button("Rojo");
        Button azul = new Button("Azul");
        Button salir = new Button("Salir");

        //Agregar botones al contenedor
        inicio.getChildren().addAll(head, space, verde, rojo, azul, salir);

        //Centrar los botones
        inicio.setAlignment(Pos.CENTER);
        inicio.setSpacing(12);
        
        // Accion del boton verde
        verde.setOnMouseClicked((e1) -> {
            // inicio.styleProperty().set("-fx-background-color: #81c483");
            Colores.cambiarColor("#81c483", inicio);
            Colores.observer();

            Directory.st.setTitle("Observers");
            Directory.st.setScene( Directory.sc );
            Directory.st.show();
            });

        //Accion del boton rojo
        rojo.setOnMouseClicked((e2) -> {
            // inicio.styleProperty().set("-fx-background-color: #ff6961");
            Colores.cambiarColor("#ff6961", inicio);
            Colores.observer();

            Directory.st.setTitle("Observers");
            Directory.st.setScene( Directory.sc );
            Directory.st.show();
        });
        
        //Accion del boton azul
        azul.setOnMouseClicked((e3) -> {
            // inicio.styleProperty().set("-fx-background-color: #779ECB");
            Colores.cambiarColor("#779ECB", inicio);
            Colores.observer();
            
            Directory.st.setTitle("Observers");
            Directory.st.setScene( Directory.sc );
            Directory.st.show();
        });
        
        //Accion boton cerrar
        salir.setOnMouseClicked((e4) -> {
            Stage stage = (Stage) salir.getScene().getWindow();
            stage.close();
        });
    }

    @Override
    public void addObserver(Observer observer)
    {
        this.observer = observer;
    }
    
    @Override
    public void notifyObservers()
    {
        if( observer != null )
        {
            observer.update(this, "inicio");
            System.out.println("Aqui");
        }
    }

    public VBox getInicio()
    {
        return inicio;
    }
}
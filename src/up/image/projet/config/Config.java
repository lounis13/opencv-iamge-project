package up.image.projet.config;

import javafx.stage.Screen;

public class Config {

    /**
     * <h3>Recuprer la taille de l'ecran</h3>
     * <p>
     *     La Classe Screen nous permet de récupérer les dimensions maximales d’un écran.
     * </p>
     **/
    public final static double MAX_WIDTH_SCREAN = Screen.getPrimary().getVisualBounds().getMaxX();
    public final static double MAX_HEIGHT_SCREAN = Screen.getPrimary().getVisualBounds().getMaxY();

}

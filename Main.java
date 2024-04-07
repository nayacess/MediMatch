// Main.java

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de DatabaseConnector
        model.DatabaseConnector databaseConnector = new model.DatabaseConnector();

        // Appel de la méthode connect pour établir la connexion à la base de données
        databaseConnector.connect();
    }
}

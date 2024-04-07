package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private Connection connection = null;

    public void connect() {
        try {
            // Chargement du pilote JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Création de la connexion à la base de données
            String url = "jdbc:mysql://localhost:3306/MediMatch?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String username = "root";
            String password = ""; // Mot de passe vide
            connection = DriverManager.getConnection(url, username, password);

            // Vérification de la connexion réussie
            if (connection != null) {
                System.out.println("Connexion à la base de données réussie !");
            } else {
                System.out.println("La connexion à la base de données a échoué !");
            }

            // Ici, vous pouvez exécuter vos opérations sur la base de données...

        } catch (ClassNotFoundException e) {
            System.out.println("Erreur : le pilote MySQL n'a pas été trouvé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données !");
            e.printStackTrace();
        } finally {
            // Fermeture de la connexion
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Erreur lors de la fermeture de la connexion !");
                    e.printStackTrace();
                }
            }
        }
    }
}

package controller;


import entities.*;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Controller implements Initializable {
	@FXML
	private TableView<Article> articlesTable;
	
	@FXML
	private TableView<Client> clientsTable;
	
	@FXML
	private TableView<Commande> commandsTable;
	
	@FXML
	private TableView<Ligne> ligneTable;
	
	@FXML
	private TableColumn<Client, Integer> idClient;

	@FXML
	private TableColumn<Client, String> nom;	
	
	@FXML
	private TableColumn<Client, String> prenom;	
	
	@FXML
	private TableColumn<Client, String> adresse;
	
	@FXML
	private TableColumn<Client, String> ville;
	
	@FXML
	private TableColumn<Client, String> mail;	
	
	@FXML
	private TableColumn<Client, Integer> age;
	
	@FXML
	private TableColumn<Client, Void> clientModify;
	
	@FXML
	private TableColumn<Client, Void> clientDelete;
	
	@FXML
	private TableColumn<Article, String> idArticle;

	@FXML
	private TableColumn<Article, String> design;	
	
	@FXML
	private TableColumn<Article, Integer> prix;
	
	@FXML
	private TableColumn<Article, String> categorie;
	
	@FXML
	private TableColumn<Article, Void> articleModify;
	
	@FXML
	private TableColumn<Article, Void> articleDelete;
	
	@FXML
	private TableColumn<Commande, Integer> idComm;
	
	@FXML
	private TableColumn<Commande, Integer> idClientComm;
	
	@FXML
	private TableColumn<Commande, String> colDate;
	
	@FXML
	private TableColumn<Commande, Void> commandeModify;
	
	@FXML
	private TableColumn<Commande, Void> commandeDelete;
	
	@FXML
	private TableColumn<Ligne, Integer> idCommLigne;
	
	@FXML
	private TableColumn<Ligne, String> idArticleLigne;
	
	@FXML
	private TableColumn<Ligne, Integer> quantite;
	
	@FXML
	private TableColumn<Ligne, Integer> prixUnite;
	
	@FXML
	private TableColumn<Ligne, Integer> totalLigne;
	
	@FXML
	private TableColumn<Ligne, Void> ligneModify;
	
	@FXML
	private TableColumn<Ligne, Void> ligneDelete;
	
	@FXML
	private Button addArticle;
	
	@FXML
	private Button addClient;

	@FXML
	private Button addCommande;
	
	@FXML
	private Button addLigne;
	
    @FXML
    private Button articleBtn;

    @FXML
    private Button clientBtn;

    @FXML
    private Button commandeBtn;
    
    @FXML
    private Button ligneBtn;
    
    @FXML
    private GridPane clientPn;

    @FXML
    private GridPane commandePn;

    @FXML
    private GridPane articlePn;
    
    @FXML
    private GridPane lignePn;
    
    @FXML
    private Pane addArticlePn;
    
    @FXML
    private Pane addClientPn;
    
    @FXML
    private Pane addCommandePn;
    
    @FXML
    private Pane addLignePn;
    
    @FXML
    private Pane updateArticlePn;
    
    @FXML
    private Pane updateClientPn;
    
    @FXML
    private Pane updateCommandePn;
    
    @FXML
    private Pane updateLignePn;
    
    @FXML
    private TextField idArticleField;
    
    @FXML
    private TextField designField;
    
    @FXML
    private TextField prixField;
    
    @FXML
    private TextField catField;
    
    @FXML
    private TextField idClientField;
    
    @FXML
    private TextField nomField;
    
    @FXML
    private TextField prenomField;
    
    @FXML
    private TextField ageField;
    
    @FXML
    private TextField adresseField;
    
    @FXML
    private TextField villeField;
    
    @FXML
    private TextField mailField;
    
    @FXML
    private TextField idCommField;
    
    @FXML
    private TextField idClientCommField;
    
    @FXML
    private TextField anneeField;
    
    @FXML
    private TextField moisField;
    
    @FXML
    private TextField jourField;
    
    @FXML
    private TextField idCommUpdateField;
    
    @FXML
    private TextField idClientCommUpdateField;
    
    @FXML
    private TextField anneeUpdateField;
    
    @FXML
    private TextField moisUpdateField;
    
    @FXML
    private TextField jourUpdateField;
    
    @FXML
    private TextField idClientUpdateField;
    
    @FXML
    private TextField nomUpdateField;
    
    @FXML
    private TextField prenomUpdateField;
    
    @FXML
    private TextField ageUpdateField;
    
    @FXML
    private TextField adresseUpdateField;
    
    @FXML
    private TextField villeUpdateField;
    
    @FXML
    private TextField mailUpdateField;
    
    @FXML
    private TextField idCommLigneField;
    
    @FXML
    private TextField idArticleLigneField;
    
    @FXML
    private TextField prixUniteField;
    
    @FXML
    private TextField quantiteField;
    
    @FXML
    private TextField idCommLigneUpdateField;
    
    @FXML
    private TextField idArticleLigneUpdateField;
    
    @FXML
    private TextField prixUniteUpdateField;
    
    @FXML
    private TextField quantiteUpdateField;
    
    @FXML
    private Button addArticleSubmit;
    
    @FXML
    private Button addClientSubmit;
    
    @FXML
    private Button addCommandeSubmit;
    
    @FXML
    private Button addLigneSubmit;
    
    @FXML
    private TextField idArticleUpdateField;
    
    @FXML
    private TextField designUpdateField;
    
    @FXML
    private TextField prixUpdateField;
    
    @FXML
    private TextField catUpdateField;
    
    @FXML
    private TextField searchArticle;
    
    @FXML
    private TextField searchClient;
    
    @FXML
    private Button updateArticleSubmit;
    
    @FXML
    private Button updateClientSubmit;
    
    @FXML
    private Button updateCommandeSubmit;
    
    @FXML
    private Button updateLigneSubmit;
    
    @FXML
    private Button searchArticleButton;
    
    @FXML
    private Button searchClientButton;
    
    @FXML
    private Pane homePn;
    
    @FXML
    private Pane onglet;
    
    @FXML
    private Label ongletName;
    
    private jdbc dbHandler;
    	
	@Override
	public void initialize(URL Location, ResourceBundle resources) {
		dbHandler = new jdbc();
		
		fillArticle("0");
		fillClient(0);
		fillCommande();
		fillLigne();
	}
	
	//ArticleFunctions
	private void fillArticle(String id){
		ObservableList<Article> listArticle = FXCollections.observableArrayList();
		String query;
		if (id=="0") {
			query ="SELECT * FROM article";
		}else {
			query="SELECT * FROM article WHERE idArticle='"+id+"'";
		}
		
		Connection con=dbHandler.getConnection();
		ResultSet set = null;
		try {
			set = con.createStatement().executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(query);
		try {
			while (set.next()) {
				Article article=new Article();
				article.setDesign(set.getString("design"));
				article.setIdArticle(set.getString("idArticle"));
				article.setPrix(set.getInt("prix"));
				article.setCategorie(set.getString("categorie"));
				
				listArticle.add(article);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		idArticle.setCellValueFactory(new PropertyValueFactory<>("idArticle"));
		design.setCellValueFactory(new PropertyValueFactory<>("design"));
		prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
		categorie.setCellValueFactory(new PropertyValueFactory<>("categorie"));
		
		articlesTable.getItems().clear();
		articlesTable.setItems(listArticle);
		
		articleModify.setCellFactory(col -> new TableCell<Article, Void>() {
	        private final Button button;
	        {
	            button = new Button("edit");
	            button.setOnAction(evt -> {
	                Article item = getTableRow().getItem();
	                showUpdateArticle(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
		articleDelete.setCellFactory(col -> new TableCell<Article, Void>() {
	        private final Button button;
	        {
	            button = new Button("Delete");
	            button.setOnAction(evt -> {
	                Article item = getTableRow().getItem();
	                deleteArticle(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
	}
	
	private void addArticle() {
		String idArticle = idArticleField.getText();
		String design = designField.getText();
		Integer prix = Integer.valueOf(prixField.getText());
		String cat = catField.getText();
		
		String query = "INSERT INTO article (idArticle, design, prix, categorie) VALUES('" +idArticle+ "','" + design + "','" + prix + "','" + cat+"')";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void modifyArticle(Article article) {
		String idArticle = article.getIdArticle();
		String idArticleNew = idArticleUpdateField.getText();
		String design = designUpdateField.getText();
		Integer prix = Integer.valueOf(prixUpdateField.getText());
		String cat = catUpdateField.getText();
		
		String query = "UPDATE article SET idArticle ='"+idArticleNew+"', design='"+design+"', prix='"+prix+"', categorie='"+cat+"' WHERE idArticle='"+idArticle+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void searchArticle() {
		String id;
		if (searchArticle.getText().trim().isEmpty()) {
			id = "0";
		}else {
			id = searchArticle.getText();
		}
		
		fillArticle(id);
	}
	
	private void deleteArticle(Article article) {
		String idArticle = article.getIdArticle();
		String query = "DELETE FROM article WHERE idArticle='"+idArticle+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fillArticle("0");
	}
	
	private void showUpdateArticle(Article article) {
		idArticleUpdateField.setText(article.getIdArticle());
		prixUpdateField.setText(Integer.toString(article.getPrix()));
		designUpdateField.setText(article.getDesign());
		catUpdateField.setText(article.getCategorie());
		updateArticlePn.toFront();
		updateArticleSubmit.setOnAction(evt -> {
            modifyArticle(article);
            fillArticle("0");
			articlesTable.toFront();
        });
	}
	
	
	//ClientFunctions
	private void fillClient(Integer id) {
		ObservableList<Client> listClient = FXCollections.observableArrayList();
		String query;
		if (id==0) {
			query ="SELECT * FROM client";
		}else {
			query="SELECT * FROM client WHERE idClient='"+id+"'";
		}
		Connection con = dbHandler.getConnection();
		ResultSet set = null;
		try {
			set = con.createStatement().executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while (set.next()) {
				Client client=new Client();
				client.setNom(set.getString("nom"));
				client.setIdClient(set.getInt("idClient"));
				client.setPrenom(set.getString("prenom"));
				client.setAge(set.getInt("age"));
				client.setAdresse(set.getString("adresse"));
				client.setVille(set.getString("ville"));
				client.setMail(set.getString("mail"));
				
				listClient.add(client);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		idClient.setCellValueFactory(new PropertyValueFactory<>("idClient"));
		nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
		prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
		age.setCellValueFactory(new PropertyValueFactory<>("age"));
		adresse.setCellValueFactory(new PropertyValueFactory<>("adresse"));
		ville.setCellValueFactory(new PropertyValueFactory<>("ville"));
		mail.setCellValueFactory(new PropertyValueFactory<>("mail"));
		
		clientsTable.getItems().clear();
		clientsTable.setItems(listClient);
		
		clientModify.setCellFactory(col -> new TableCell<Client, Void>() {
	        private final Button button;
	        {
	            button = new Button("Modifier");
	            button.setOnAction(evt -> {
	                Client item = getTableRow().getItem();
	                showUpdateClient(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
		clientDelete.setCellFactory(col -> new TableCell<Client, Void>() {
	        private final Button button;
	        {
	            button = new Button("Supprimer");
	            button.setOnAction(evt -> {
	                Client item = getTableRow().getItem();
	                deleteClient(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
	}
	
	private void addClient() {
		Integer idClient = Integer.valueOf(idClientField.getText());
		String nom = nomField.getText();
		String prenom = prenomField.getText();
		Integer age = Integer.valueOf(ageField.getText());
		String ville = villeField.getText();
		String adresse = adresseField.getText();
		String mail = mailField.getText();
		
		String query = "INSERT INTO client (idClient, nom, prenom, age, adresse, ville, mail) VALUES('" +idClient+ "','" +nom + "','" + prenom + "','" + age+"','" + adresse + "','" + ville + "','" + mail +"')";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void modifyClient(Client client) {
		Integer idClient = client.getIdClient();
		Integer idClientNew = Integer.valueOf(idClientUpdateField.getText());
		String nom = nomUpdateField.getText();
		String prenom = prenomUpdateField.getText();
		Integer age = Integer.valueOf(ageUpdateField.getText());
		String ville = villeUpdateField.getText();
		String adresse = adresseUpdateField.getText();
		String mail = mailUpdateField.getText();
		
		String query = "UPDATE client SET idClient ='"+idClientNew+"', nom='"+nom+"', prenom='"+prenom+"', age='"+age+"',ville='"+ville+"',adresse='"+adresse+"',mail='"+mail+"' WHERE idClient='"+idClient+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void showUpdateClient(Client client) {
		idClientUpdateField.setText(Integer.toString(client.getIdClient()));
		nomUpdateField.setText(client.getNom());
		prenomUpdateField.setText(client.getPrenom());
		ageUpdateField.setText(Integer.toString(client.getAge()));
		villeUpdateField.setText(client.getVille());
		adresseUpdateField.setText(client.getAdresse());
		mailUpdateField.setText(client.getMail());
		updateClientPn.toFront();
		updateClientSubmit.setOnAction(evt -> {
            modifyClient(client);
            fillClient(0);
			clientsTable.toFront();
        });
	}
	
	private void deleteClient(Client client) {
		Integer idClient = client.getIdClient();
		String query = "DELETE FROM client WHERE idClient='"+idClient+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fillClient(0);
	}

	private void searchClient() {
		Integer id;
		if(searchClient.getText().trim().isEmpty()) {
			id = 0;
		}else {
			id = Integer.valueOf(searchClient.getText());
		}
		fillClient(id);
	}
	
	
	//CommandeFunctions
	private void fillCommande(){
		ObservableList<Commande> listCommande = FXCollections.observableArrayList();
		String query="SELECT * FROM commande";
		Connection con = dbHandler.getConnection();
		ResultSet set = null;
		try {
			set = con.createStatement().executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(set.next()) {
				Commande commande = new Commande();
				commande.setIdClient(set.getInt("idClient"));
				commande.setIdComm(set.getInt("idComm"));
				commande.setDate(set.getDate("date"));
				
				listCommande.add(commande);
				System.out.println(commande.getIdComm());
				System.out.println(commande.getIdClient());				
				System.out.println(commande.getDate());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		idComm.setCellValueFactory(new PropertyValueFactory<>("idComm"));
		idClientComm.setCellValueFactory(new PropertyValueFactory<>("idClient"));
		colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
		
		commandsTable.getItems().clear();
		commandsTable.setItems(listCommande);
		
		commandeModify.setCellFactory(col -> new TableCell<Commande, Void>() {
	        private final Button button;
	        {
	            button = new Button("Modifier");
	            button.setOnAction(evt -> {
	                Commande item = getTableRow().getItem();
	                showUpdateCommande(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
		commandeDelete.setCellFactory(col -> new TableCell<Commande, Void>() {
	        private final Button button;
	        {
	            button = new Button("Supprimer");
	            button.setOnAction(evt -> {
	                Commande item = getTableRow().getItem();
	                deleteCommande(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
	}
	
	private void addCommande() {
		Integer idComm = Integer.valueOf(idCommField.getText());
		Integer idClientComm = Integer.valueOf(idClientCommField.getText());
		String annee = anneeField.getText();
		String mois = moisField.getText();
		String jour = jourField.getText();

		java.sql.Timestamp date = Timestamp.valueOf(annee+"-"+mois+"-"+jour+" 00:00:00");
		System.out.println(date);
		String query = "INSERT INTO commande (idComm, idClient, date) VALUES('" +idComm+ "','" +idClientComm + "','" + date + "')";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void modifyCommande(Commande commande) {
		Integer idComm = commande.getIdComm();
		Integer idCommNew = Integer.valueOf(idCommUpdateField.getText());
		Integer idClientComm = Integer.valueOf(idClientCommUpdateField.getText());
		String annee = anneeUpdateField.getText();
		String mois = moisUpdateField.getText();
		String jour = jourUpdateField.getText();
		
		java.sql.Timestamp date = Timestamp.valueOf(annee+"-"+mois+"-"+jour+" 00:00:00");
		
		String query = "UPDATE commande SET idComm ='"+idCommNew+"', idClient='"+idClientComm+"', date='"+date+ "'WHERE idComm='"+idComm+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void showUpdateCommande(Commande commande) {
		idCommUpdateField.setText(Integer.toString(commande.getIdComm()));
		idClientCommUpdateField.setText(Integer.toString(commande.getIdClient()));
		Date date = commande.getDate();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate=dateFormat.format(date);
	
		String[] splitDate = strDate.split("-");
		
		anneeUpdateField.setText(splitDate[0]);
		moisUpdateField.setText(splitDate[1]);
		jourUpdateField.setText(splitDate[2]);
		
		updateCommandePn.toFront();
		updateCommandeSubmit.setOnAction(evt -> {
            modifyCommande(commande);
            fillCommande();
			commandsTable.toFront();
        });
	}
	
	private void deleteCommande(Commande commande) {
		Integer idComm = commande.getIdComm();
		String query = "DELETE FROM commande WHERE idComm='"+idComm+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fillCommande();
	}


	//LigneFunctions
	private void fillLigne(){
		ObservableList<Ligne> listLigne = FXCollections.observableArrayList();
		String query="SELECT * FROM ligne";
		Connection con = dbHandler.getConnection();
		ResultSet set = null;
		try {
			set = con.createStatement().executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(set.next()) {
				Ligne ligne = new Ligne();
				ligne.setIdComm(set.getInt("idComm"));
				ligne.setIdArticle(set.getString("idArticle"));
				ligne.setQuantite(set.getInt("quantite"));
				ligne.setPrixUnite(set.getInt("prixUnite"));
				listLigne.add(ligne);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		idCommLigne.setCellValueFactory(new PropertyValueFactory<>("idComm"));
		idArticleLigne.setCellValueFactory(new PropertyValueFactory<>("idArticle"));
		quantite.setCellValueFactory(new PropertyValueFactory<>("quantite"));
		prixUnite.setCellValueFactory(new PropertyValueFactory<>("prixUnite"));
		
		ligneTable.getItems().clear();
		ligneTable.setItems(listLigne);
		
		ligneModify.setCellFactory(col -> new TableCell<Ligne, Void>() {
	        private final Button button;
	        {
	            button = new Button("Modifier");
	            button.setOnAction(evt -> {
	                Ligne item = getTableRow().getItem();
	                showUpdateLigne(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
		ligneDelete.setCellFactory(col -> new TableCell<Ligne, Void>() {
	        private final Button button;
	        {
	            button = new Button("Supprimer");
	            button.setOnAction(evt -> {
	                Ligne item = getTableRow().getItem();
	                deleteLigne(item);
	            });
	        }
	        @Override
	        protected void updateItem(Void item, boolean empty) {
	            super.updateItem(item, empty);
	            setGraphic(empty ? null : button);
	        }
	    });
	}

	private void addLigne() {
		Integer idCommLigne = Integer.valueOf(idCommLigneField.getText());
		String idArticleLigne = idArticleLigneField.getText();
		Integer prixUnite = Integer.valueOf(prixUniteField.getText());
		Integer quantite = Integer.valueOf(quantiteField.getText());
		
		String query = "INSERT INTO ligne (idComm, idArticle, quantite, prixUnite) VALUES('" +idCommLigne+ "','" +idArticleLigne + "','" + prixUnite + "','" +quantite+ "')";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void modifyLigne(Ligne ligne) {
		Integer idCommLigne = ligne.getIdComm();
		String idArticleLigne = ligne.getIdArticle();
		Integer idCommLigneNew = Integer.valueOf(idCommLigneUpdateField.getText());
		String idArticleLigneNew = idArticleLigneUpdateField.getText();
		Double prixUnite = Double.valueOf(prixUniteUpdateField.getText());
		Integer quantite = Integer.valueOf(quantiteUpdateField.getText());
		
		String query = "UPDATE ligne SET idComm ='"+idCommLigneNew+"', idArticle='"+idArticleLigneNew+"', prixUnite='"+prixUnite+"', quantite='"+quantite+ "'WHERE idComm='"+idCommLigne+"' AND idArticle='"+idArticleLigne+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void showUpdateLigne(Ligne ligne) {
		idCommLigneUpdateField.setText(Integer.toString(ligne.getIdComm()));
		idArticleLigneUpdateField.setText(ligne.getIdArticle());
		prixUniteUpdateField.setText(Double.toString(ligne.getPrixUnite()));
		quantiteUpdateField.setText(Integer.toString(ligne.getQuantite()));

		
		updateLignePn.toFront();
		updateLigneSubmit.setOnAction(evt -> {
            modifyLigne(ligne);
            fillLigne();
			ligneTable.toFront();
        });
	}
	
	private void deleteLigne(Ligne ligne) {
		Integer idComm = ligne.getIdComm();
		String idArticle = ligne.getIdArticle();

		String query = "DELETE FROM ligne WHERE idComm='"+idComm+"' AND idArticle='"+idArticle+"'";
		Connection con=dbHandler.getConnection();
		try {
			con.createStatement().executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fillLigne();
	}

	
	@FXML
	private void handleClicks(ActionEvent event) {
		if (event.getSource() == articleBtn) {
			articlePn.toFront();
			articlesTable.toFront();
		}
		else if (event.getSource() == clientBtn) {
			clientPn.toFront();
			clientsTable.toFront();
		}
		else if (event.getSource() == commandeBtn) {
			commandePn.toFront();
			commandsTable.toFront();
		}
		else if (event.getSource() == ligneBtn) {
			lignePn.toFront();
			ligneTable.toFront();
		}
		else if (event.getSource() == addArticle) {
			addArticlePn.toFront();
		}
		else if (event.getSource() == addClient) {
			addClientPn.toFront();
		}else if (event.getSource() == addCommande) {
			addCommandePn.toFront();
		}else if (event.getSource() == addLigne) {
			addLignePn.toFront();
		}
		else if (event.getSource() == addArticleSubmit) {
			addArticle();
			fillArticle("0");
			articlesTable.toFront();
		}else if (event.getSource() == addClientSubmit) {
			addClient();
			fillClient(0);
			clientsTable.toFront();
		}else if (event.getSource() == addCommandeSubmit) {
			addCommande();
			fillCommande();
			commandsTable.toFront();
		}else if (event.getSource() == addLigneSubmit) {
			addLigne();
			fillLigne();
			ligneTable.toFront();
		}
		else if (event.getSource() == searchArticleButton) {
			searchArticle();
		}else if (event.getSource() == searchClientButton) {
			searchClient();
		}
	}
}
	
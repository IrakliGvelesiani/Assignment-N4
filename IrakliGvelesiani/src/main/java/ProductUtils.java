import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductUtils {

    private ProductUtils() {
    }

    public static void createTable() {

        String createSql = "CREATE TABLE PRODUCT (" +
                "ID INTEGER NOT NULL AUTO_INCREMENT, " +
                "PRODUCT_NAME VARCHAR(255), " +
                "PRODUCT_WEIGHT INTEGER NOT NULL," +
                "PRODUCT_PRICE INTEGER NOT NULL," +
                "PRIMARY KEY(ID))";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }

    public static void insert(Product product) {

        String insertSql = "INSERT INTO PRODUCT(PRODUCT_NAME , PRODUCT_WEIGHT, PRODUCT_PRICE) VALUES(" +
                "'" + product.getProdName() + "', " +
                "'" + product.getProdWeight() + "', " +
                "" + product.getProdPrice() + ")";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Product> getAllProducts() {

        String selectSql = "SELECT * FROM PRODUCT";

        List<Product> products = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                products.add(new Product(
                        resultSet.getLong("ID"),
                        resultSet.getString("PRODUCT_NAME"),
                        resultSet.getInt("PRODUCT_WEIGHT"),
                        resultSet.getInt("PRODUCT_PRICE")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;

    }

    public static void updateProduct(long id, String newProdName) {

        String updateSql = "UPDATE PRODUCT SET PRODUCT_NAME = '" + newProdName + "' WHERE ID = " + id;

        try {
            JDBCUtil.getStatement().executeUpdate(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteProduct(long id) {

        String deleteAll = "DELETE FROM PRODUCT WHERE ID = " + id;

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteAll() {

        String deleteAll = "DELETE FROM PRODUCT";

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
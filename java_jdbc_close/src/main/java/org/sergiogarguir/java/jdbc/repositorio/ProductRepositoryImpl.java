package org.sergiogarguir.java.jdbc.repositorio;

import org.sergiogarguir.java.jdbc.models.Category;
import org.sergiogarguir.java.jdbc.models.Product;
import org.sergiogarguir.java.jdbc.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements Repository{
    private Connection getConnection() throws SQLException {
        return DBConnection.getInstance();
    }
    @Override
    public List findAll() {
        List<Product> products = new ArrayList<>();

        try(Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT p.*, c.name as category FROM productos as p INNER JOIN categorias as c ON (p.categoria_id = c.id)")){
            while(rs.next()){
                Product p = getProduct(rs);
                products.add(p);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return products;
    }

    @Override
    public Object forId(Long id) {
        Product product = null;
        try(Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT p.*, c.name as category FROM productos as p INNER JOIN categorias as c ON (p.categoria_id = c.id) WHERE p.id = ?")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = getProduct(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        };
        return product;
    }

    @Override
    public void save(Product product) {

        String sql = null;
        if (product.getId() != null && product.getId() > 0) {
            sql = "UPDATE productos SET name = ?, price = ?, categoria_id = ? WHERE id = ?";
        }else{
            sql = "INSERT INTO productos(name, price, categoria_id, register_date) VALUES (?,?,?,?)";
        }
        try(Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, product.getName());
            stmt.setLong(2,product.getPrice());
            stmt.setLong(3,product.getCategory().getId());
            if (product.getId() != null && product.getId() > 0) {
                stmt.setLong(4, product.getId());
            }else{
                stmt.setDate(4, new Date(product.getRegister_date().getTime()));
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long id) {
        try(Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM productos WHERE id = ?")){
            stmt.setLong(1,id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Product getProduct(ResultSet rs) throws SQLException {
        Product p = new Product();
        p.setId(rs.getLong("id"));
        p.setName(rs.getString("name"));
        p.setPrice(rs.getInt("price"));
        p.setRegister_date(rs.getDate("register_date"));
        Category category = new Category();
        category.setId(rs.getLong("categoria_id"));
        category.setName(rs.getString("category"));
        p.setCategory(category);
        return p;
    }
}


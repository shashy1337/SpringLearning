package ru.shashy.purchaseexercise.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.shashy.purchaseexercise.Model.Purchase;

import java.util.List;

@Repository
public class PurchaseRepository {

    private final JdbcTemplate jdbcTemplate;

    public PurchaseRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void storePurchase(Purchase purchase){
        String sqlQ = "INSERT INTO Purchase VALUES (NULL, ?, ?)";
        jdbcTemplate.update(sqlQ, purchase.getProduct(), purchase.getPrice());
    }

    public List<Purchase> findAllPurchases(){
        String sqlQ = "SELECT * FROM Purchase";
        RowMapper<Purchase> purchaseRowMapper = (r, i) -> {
            Purchase rowObject = new Purchase();
            rowObject.setId(r.getInt("id"));
            rowObject.setProduct(r.getString("product"));
            rowObject.setPrice(r.getBigDecimal("price"));
            return rowObject;
        };
        return jdbcTemplate.query(sqlQ, purchaseRowMapper);
    }
}

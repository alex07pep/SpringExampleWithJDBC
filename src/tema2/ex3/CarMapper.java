package tema2.ex3;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car>
{
    public Car mapRow(ResultSet rs, int	rowNum) throws SQLException
    {
        Car car = new Car();
        car.setId(rs.getInt(	"id"));
        car.setLicensePlate(rs.getString("license_plate"));
        car.setYear(rs.getInt("production_year"));
        car.setColor(rs.getString("color"));
        car.setKilometers(rs.getInt("kilometers"));
        car.setModel(rs.getString("model"));

        return car;
    }
}

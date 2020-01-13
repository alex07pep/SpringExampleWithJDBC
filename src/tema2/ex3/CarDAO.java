package tema2.ex3;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CarDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource= dataSource;
        this.jdbcTemplateObject= new JdbcTemplate(dataSource);
    }
    

    public void insert(String license_plate,int production_year,String color,int kilometers, String model)
    {
        String SQL = "insert into Cars (license_plate, production_year, color, kilometers, model) values (?, ?, ?, ?, ?)";
        jdbcTemplateObject.update( SQL, license_plate,production_year,color,kilometers, model);
    }

    public void update(int id,String license_plate,int production_year,int color,int kilometers, String model)
    {
        String SQL = "update Cars set license_plate = ?, production_year = ?, color = ?, kilometers = ?, model = ? where id = ?";
        jdbcTemplateObject.update(SQL, license_plate,production_year,color,kilometers, id, model);
    }

    public void delete(String license_plate)
    {
        String SQL = "delete from Cars where license_plate = ?";
        jdbcTemplateObject.update(SQL, license_plate);
    }

    public Car getCar(String license_plate)
    {
        String SQL ="select * from Cars where license_plate = ?";
        Car car = jdbcTemplateObject.queryForObject(SQL,	new	Object[]{license_plate},new CarMapper());
        return car;
    }

    public List<Car> getAllCars()
    {
        String SQL ="select * from Cars";
        List <Car> pers =	jdbcTemplateObject.query(SQL,new	CarMapper());
        return	pers;
    }

    public	List<Car> getCarsModel(String model)
    {
        String SQL ="select * from Cars where model = ?";
        List <Car> pers =	jdbcTemplateObject.query(SQL,new Object[]{model},new	CarMapper());
        return	pers;
    }

    public	List<Car> getCarsUnder5Years(int year)
    {
        String SQL ="select * from Cars where production_year > ?";
        List <Car> pers =	jdbcTemplateObject.query(SQL, new Object[]{year}, new	CarMapper());
        return	pers;
    }

    public	List<Car> getCarsUnder100Km()
    {
        String SQL ="select * from Cars where kilometers < 100000";
        List <Car> pers =	jdbcTemplateObject.query(SQL,new	CarMapper());
        return	pers;
    }
}

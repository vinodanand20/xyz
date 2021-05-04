package info.ibn.springJdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("info.ibn");

JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
String query = "insert into emp_tbl values(?,?,?)";

//jdbcTemplate.update(query, 121, "PK", 10000);
//jdbcTemplate.update(query, 15,"Litish",60000);
//jdbcTemplate.update(query, 13,"Titish",20000);

//jdbcTemplate.update(query, 110,"Nitish",40000);
//jdbcTemplate.update(query, 111,"Mitish",50000);
jdbcTemplate.update(query, 112,"Sitish",30000);

container.close();
    }
    
}

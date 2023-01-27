package oop._05_ocp.good;

//@Configuration
public class CarConfig {

//    @Bean
    public Driver driver() {
        return new Driver(new Avante());
    }

}

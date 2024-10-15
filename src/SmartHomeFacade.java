public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem security;
    private EntertainmentSystem entertainment;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem security, EntertainmentSystem entertainment) {
        this.light = light;
        this.thermostat = thermostat;
        this.security = security;
        this.entertainment = entertainment;
    }
    public void LeaveHome(){
        System.out.println("Leave home mode is on");
        light.off();
        thermostat.setTemperature(0);
        security.on();
        entertainment.off();
    }
    public void arriveHome(){
        System.out.println("Home mode is on");
        light.on();
        thermostat.setTemperature(20);
        security.off();
        entertainment.on();
    }
    public void nightMode(){
        System.out.println("Night mode is on");
        light.dim(10);
        thermostat.setTemperature(17);
        security.on();
        entertainment.off();
    }
    public void movieMode(String movie) {
        System.out.println("Movie mode is on");
        light.dim(20);
        thermostat.setTemperature(19);
        entertainment.on();
        entertainment.playMovie(movie);
    }
}

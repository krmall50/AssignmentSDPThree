//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Adapter--------------");

        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "music.mp3");
        AudioPlayer wavPlayer = new AudioAdapter("wav");
        wavPlayer.play("wav", "wav Music");
        AudioPlayer accPlayer = new AudioAdapter("acc");
        accPlayer.play("acc", "acc music");

        System.out.println("---------------Bridge--------------");


        Device tv = new TVDevice();
        RemoteControl basic = new BasicRemote(tv);
        basic.powerOn();
        basic.setChannel(5);
        basic.powerOff();

        Device soundSys = new SoundSystemDevice();
        RemoteControl advanced = new AdvancedRemote(soundSys);
        advanced.powerOn();
        advanced.setVolume(7);
        advanced.powerOff();

        System.out.println("---------------Composite--------------");

        MenuComponent salad = new MenuItem("SaladName", "SaladDesc", 5590);
        MenuComponent dish1 = new MenuItem("dishName1", "dishDesc1", 5545);
        MenuComponent dish2 = new MenuItem("dishName2", "dishDesc2", 9450);
        MenuComponent dish3 = new MenuItem("dishName3", "dishDesc3", 8520);

        Menu dinner = new Menu("DinnerMenu", "SomeDishes");
        dinner.add(salad);
        dinner.add(dish1);
        dinner.add(dish2);
        dinner.add(dish3);

        Menu breakfast = new Menu("Default breakfast", "healthy");
        MenuComponent egg = new MenuItem("egg", "boiled", 600);
        MenuComponent yogurt = new MenuItem("yogurt", "with banana", 400);
        breakfast.add(egg);
        breakfast.add(yogurt);

        Menu mainMenu = new Menu("All menues", "available");
        mainMenu.add(dinner);
        mainMenu.add(breakfast);

        mainMenu.print();

        System.out.println("---------------Decorator--------------");

        Pizza pizza = new MargheritaPizza();
        pizza = new PepperoniTopping(pizza);
        pizza = new CheeseTopping(pizza);
        System.out.println("Description: " + pizza.getDesc() + "\n" + "Cost: " + pizza.getCost());

        System.out.println("---------------Facade--------------");

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem security = new SecuritySystem();
        EntertainmentSystem entertainment = new EntertainmentSystem();
        SmartHomeFacade smart = new SmartHomeFacade(light, thermostat, security, entertainment);

        smart.arriveHome();
        smart.movieMode("Naruto");
        smart.nightMode();
        smart.LeaveHome();

        System.out.println("---------------Flyweight--------------");

        TextEditor editor = new TextEditor();
        editor.insertText("Hello world", "Arial", 12, 10, 15, 2);
        editor.insertText("Bye Hollow", "Arial", 12, 10, 45, 2);
        editor.renderDocument();

        System.out.println("---------------Proxy--------------");

        OnlineCourse course = new OnlineCourse();
        course.addVideoLectures(new ProxyVideoLecture("Java"));
        course.addVideoLectures(new ProxyVideoLecture("Python"));
        course.addVideoLectures(new ProxyVideoLecture("C++"));

        System.out.println("Content: ");
        course.showCourseContent();

        System.out.println();
        System.out.println("Starting video...");
        course.playVideoLecture(1);
        course.playVideoLecture(2);
        course.playVideoLecture(0);

        }


    }

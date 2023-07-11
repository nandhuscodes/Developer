interface Computer{
    abstract void developApp();
}
class Laptop implements Computer{
    @Override
    public void developApp() {
        System.out.println("You are provided with a Laptop");
    }
}
class Desktop implements Computer{
    @Override
    public void developApp() {
        System.out.println("You are provided with a Desktop");
    }
}
class Developer{
    void developApp(Computer computer){
        computer.developApp();
    }
}
public class Main {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer developer = new Developer();
        developer.developApp(laptop);
        developer.developApp(desktop);
    }
}

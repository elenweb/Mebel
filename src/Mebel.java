public class Mebel {
    protected String name;
    protected String color = "бежевый";
    protected double height;
    protected double width;
    protected String place;
    protected String about;
    public void help(){
        System.out.println("Это " + name + ". " + about);
    }
}

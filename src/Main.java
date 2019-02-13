public class Main {
    public static void main(String[] args) {
        Chair ch = new Chair();
        ch.name = "СТУЛ";
        ch.color = "черный";
        ch.about = "На нем сидят.";
        ch.help();

        Table ta = new Table();
        ta.name = "СТОЛ";
        ta.color = "белый";
        ta.about = "Зв ним едят.";
        ta.help();

        Sofa so = new Sofa();
        so.name = "ДИВАН";
        so.about = "На нем иногда спят.";
        so.help();
        instock(ch);
        instock(ta);
        instock(so);
    }

    private static void instock(Mebel k) {
        System.out.println("В наличии: " + k.name + ", цвет " + k.color);
    }
}

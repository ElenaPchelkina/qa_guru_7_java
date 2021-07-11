package guru.ga;

public class Table {

    static String form = "square";

    String material;
    int weight;
    boolean wasUsed;

    public Table(String material, int weight) {
        this.material = material;
        this.weight = weight;
    }

    public Table() {
    }

    String getMaterial () {
        return material;

    }

    void setWeight (int weight) {
        this.weight = weight;

    }

    static void sayFormTables () {
        System.out.println(form);


    }


}

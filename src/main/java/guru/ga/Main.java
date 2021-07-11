package guru.ga;

public class Main {

    public static void main(String[] args) {
        Table TableOne = new Table("wood","20");
        Table TableTwo = new Table();
        TableOne.material = "wood";

        TableOne.setWeight(20);
        TableTwo.setWeight(30);

        Table.sayFormTables();

        System.out.println(TableOne.getMaterial());


    }
}

public class SimpleArray {
    public static void main(String[] args) {
        String plantList[] = new String[3];
        plantList[0] = "Philodendron";
        plantList[1] = "Syngonium";
        plantList[2] = "Alocasia";

        String examplePlant = plantList[2];
        System.out.println(examplePlant);
        int lenghtOfPlantList = plantList.length;
        System.out.println("My Plant List contains " + lenghtOfPlantList + " plants");
    }
}

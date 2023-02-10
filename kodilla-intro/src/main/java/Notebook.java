public class Notebook {
        int weight;
        int price;
        int year;
        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;

        }

        public void checkPrice (){
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                } else if (this.price >= 600 && this.price <= 1000){
                        System.out.println("The price is good.");
                } else if (this.price > 1000) {
                        System.out.println("This notebook is expensive");
                }
        }
        public void checkWeight (){
                if (this.weight < 1000){
                        System.out.println("This laptop weighs little");
                } else if (this.weight >= 1000 && this.weight <= 1700){
                        System.out.println("Weight of this laptop is average");
                } else if (this.weight > 1700) {
                        System.out.println("This laptop is heavy");
                }
        }
        public void isALaptopGoodOffer (){
                if (this.price < 700 && this.year < 2018){
                        System.out.println("This is an old laptop but with a good price");
                } else if (this.price >= 700 && this.price <= 1300 && this.year >= 2018 && this.year <= 2022){
                        System.out.println("This is not a brand new laptop, but for a good price");
                } else if (this.price > 1300 && this.year > 2022){
                        System.out.println("This is a new and expensive laptop");
                }
        }

}
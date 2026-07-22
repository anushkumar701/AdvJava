package VarArgs;

class Product {

    int pid;
    String name;
    double price;

    Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    // Filter products above 2000
    public static void filterProductAbove2k(Product... p) {

        for (Product i : p) {

            if (i.price > 2000) {
                i.details();
            }
        }

        System.out.println("*********");
    }

    // Sort low to high
    public static void sortLowtoHigh(Product... p) {

        for (int i = 0; i < p.length - 1; i++) {

            for (int j = 0; j < p.length - 1; j++) {

                if (p[j].price > p[j + 1].price) {

                    Product temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }

        for (Product i : p) {
            i.details();
        }
    }

    static void main(String[] args) {

        Product p1 = new Product(1, "A", 3000);

        Product p2 = new Product(2, "B", 1000);

        Product p3 = new Product(3, "C", 4000);

        Product p4 = new Product(4, "D", 2500);

        filterProductAbove2k(p1, p2, p3, p4);

        sortLowtoHigh(p1, p2, p3, p4);
    }

    public void details() {
        System.out.println("Id - " + pid +
                " Name - " + name +
                " Price - " + price);
    }
}
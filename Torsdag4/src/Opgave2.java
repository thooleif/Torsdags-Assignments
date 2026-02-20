void main(){

    Product p1 = new Product("Screen", 800, new String[]{"Electronics", "Sale"});
    Product p2 = new Product("Mouse", 399, new String[]{"Electronics", "Sale"});
    Product p3 = new Product("Keyboard", 1200, new String[]{"Electronics", "New"});
    Product p4 = new Product("Mouse Pad", 400, new String[]{"Accessories"});

    Product[] products = {p1, p2, p3, p4};

    System.out.println("Products on sale: ");
    for(Product p : products){
        if(p.hasTag("Sale")){
            p.printInfo();
        }
    }
    System.out.println();

    System.out.println("Most expensive product: ");
    Product expensive = mostExpensive(products);
    expensive.printInfo();
}

Product mostExpensive(Product[] products){
    Product mostExpensive = products[0];
    for (Product p : products) {
        if (p.price > mostExpensive.price) {
            mostExpensive = p;
        }
    }
    return mostExpensive;
}

class Product{
    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags){
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    void printInfo(){
        System.out.println(name + " costs: " + price + " and has the tag: " + Arrays.toString(tags));
    }

    boolean hasTag(String tag){
        for(String t : tags){
            if(t.equals(tag)){
                return true;
            }
        }
        return false;
    }
}
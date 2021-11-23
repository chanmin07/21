interface Product {
    void seeContents();
    void getSample();
}

class Book implements Product {
    @Override
    public void seeContents() { /* ���� ���� */ }

    @Override
    public void getSample() { /* ���� ���� */ }
}

class CD implements Product {
    @Override
    public void seeContents() { /* ���� ���� */ }
    @Override  
    public void getSample() { /* ���� ���� */ }
}

class NShelf {

    Product product;

    void addProduct(Product product) { /* ���� ���� */ }
    void customizeShelf() { /* ���� ���� */ }
}


public class Ex_9 {

}

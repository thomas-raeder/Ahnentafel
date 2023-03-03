public class Ahnentafel {


    private BinaryTree<Person> ahnentafel;
    private BinaryTree<Integer> testBaum;

    public Ahnentafel(){
        BinaryTree<Person> b1 = new BinaryTree<Person>(new Person("Bouvier", "Jacqueline", 'w'));
        BinaryTree<Person> b2 = new BinaryTree<Person>(new Person("Bouvier", "Clancy", 'm'));
        BinaryTree<Person> b3 = new BinaryTree<Person>(new Person("Simpson", "Marge", 'w'), b1, b2);
        BinaryTree<Person> b4 = new BinaryTree<Person>(new Person("Simpson", "Mona", 'w'));
        BinaryTree<Person> b5 = new BinaryTree<Person>(new Person("Simpson", "Abraham J.", 'm'));
        BinaryTree<Person> b6 = new BinaryTree<Person>(new Person("Simpson", "Homer", 'w'), b4, b5);
        ahnentafel = new BinaryTree<>(new Person("Simpson", "Lisa", 'w'), b3, b6);

        BinaryTree<Integer> tb7 = new BinaryTree<>(7);
        BinaryTree<Integer> tb4 = new BinaryTree<>(4);
        BinaryTree<Integer> tb5 = new BinaryTree<>(5);
        BinaryTree<Integer> tb6 = new BinaryTree<>(6);
        BinaryTree<Integer> tb2 = new BinaryTree<>(2, tb4, tb5);
        BinaryTree<Integer> tb3 = new BinaryTree<>(3, tb6, tb7);
        tb7.setRightTree(new BinaryTree<Integer>(8));

        testBaum = new BinaryTree<>(1, tb2, tb3);

    }

    public BinaryTree<Person> getAhnentafel() {
        return ahnentafel;
    }
    public BinaryTree<Integer> getTestbaum() {
        return testBaum;
    }

    public void preorder(BinaryTree<Person> b){
        System.out.println(b.getContent()); //Hinweis: eine toString() Methode muss in Person def. sein
        if (!b.getLeftTree().isEmpty()){
            preorder(b.getLeftTree());
        }
        if (!b.getRightTree().isEmpty()){
            preorder(b.getRightTree());
        }
    }

    public void inorder(BinaryTree<Person> b){
        if (!b.getLeftTree().isEmpty()){
            preorder(b.getLeftTree());
        }
        System.out.println(b.getContent());
        if (!b.getRightTree().isEmpty()){
            preorder(b.getRightTree());
        }
    }

    public void postorder(BinaryTree<Person> b){
        if (!b.getLeftTree().isEmpty()){
            preorder(b.getLeftTree());
        }
        if (!b.getRightTree().isEmpty()){
            preorder(b.getRightTree());
        }
        System.out.println(b.getContent());
    }

    public static void main(String[] args) {
        Ahnentafel program = new Ahnentafel();
        program.preorder(program.getAhnentafel());
        program.inorder(program.getAhnentafel());
        program.postorder(program.getAhnentafel());
        new BaumZeichner(800,800,program.getAhnentafel());
        new BaumZeichner(800,800,program.getTestbaum());
    }
}
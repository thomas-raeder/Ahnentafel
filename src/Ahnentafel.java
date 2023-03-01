public class Ahnentafel {

    BinaryTree<Person> ahnentafel;

    public Ahnentafel(){
        BinaryTree<Person> b1 = new BinaryTree<Person>(new Person("Bouvier", "Jacqueline", 'w'));
        BinaryTree<Person> b2 = new BinaryTree<Person>(new Person("Bouvier", "Clancy", 'm'));
        BinaryTree<Person> b3 = new BinaryTree<Person>(new Person("Simpson", "Marge", 'w'), b1, b2);
        BinaryTree<Person> b4 = new BinaryTree<Person>(new Person("Simpson", "Mona", 'w'));
        BinaryTree<Person> b5 = new BinaryTree<Person>(new Person("Simpson", "Abraham J.", 'm'));
        BinaryTree<Person> b6 = new BinaryTree<Person>(new Person("Simpson", "Homer", 'w'), b4, b5);
        ahnentafel = new BinaryTree<>(new Person("Simpson", "Lisa", 'w'), b3, b6);
    }





    public static void main(String[] args) {
        Ahnentafel program = new Ahnentafel();
    }
}
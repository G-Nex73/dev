public class test
{
    BinarySearchTree<Person> Tree=new BinarySearchTree<Person>();
    String[] text={"Ahmet","Mehmet","Veli","Deli","Melih","Halit","Ilker","Enes","Serif","Yasemin"};
    public void test()
    {
        for(int i=0;i<10;i++)
        {   
            Person p= new Person((int)(Math.random()*30+20),(int)(Math.random()*10+30),(int)(Math.random()*40+150),text[i]);
            Tree.insert(p);
        }
    }
    public void lesen_rec(BinaryTree<Integer> B)
    {
        BinaryTree<Integer> Left,Right;
    int zahl=0;
    //pre
    if(B.getLeftTree().getContent()!=null)
    {
        Left=B.getLeftTree();
        lesen_rec(Left);
    }
    //in
    System.out.println("Der Person heißt"+B.getContent.Name)
    if(B.getRightTree().getContent()!=null)
    {
        Right=B.getRightTree();
        travers_rec(Right);
    }
    //post
    //System.out.println(zahl);
    }
}

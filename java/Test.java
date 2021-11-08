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
        //pre
        if(B.getLeftTree().getContent()!=null)
        {
            Left=B.getLeftTree();
            travers_rec(Left);
        }
        Person p= B.getContent();
        System.out.println(p.Name+p.Alter+p.koerperhoehe+" cm"+p.Schuhgroesse)
        //in
        if(B.getRightTree().getContent()!=null)
        {
            Right=B.getRightTree();
            travers_rec(Right);
        }
        //post
    }
}         
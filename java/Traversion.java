
public class Traversion
{
BinaryTree<Integer> W=new BinaryTree<Integer>();
String aufbauplan="7L19L5L52L9L1ZZZR20ZZR10L13ZR28ZZZR3L70L90ZR4ZZR6L11ZR8L14L2%";
Stack<Integer> S=new Stack<Integer>();
public void Durchlauf()
{
    travers_rec(W);
}
public void Summe()
{
    int zahl=0;
    int summe=0;
    travers_rec(W);
    do
    {
        zahl=S.top();
        summe=summe+zahl;
        S.pop();
    }
    while(!S.isEmpty());
    System.out.println(summe);
}
public void Grosste()
{
    int zahl=0;
    int Gzahl=0;
    travers_rec(W);
    do
    {
        zahl=S.top();
        if(Gzahl<zahl)
        {
            Gzahl=zahl;
        }
        S.pop();
    }
    while(!S.isEmpty());
    System.out.println(Gzahl);
}
public void summealt(BinaryTree<Integer> B)
{
    BinaryTree<Integer> Left,Right;
    int zahl=0;
    int summe=0;
    if(B.getLeftTree().getContent()!=null)
    {
        Left=B.getLeftTree();
        travers_rec(Left);
    }
    if(B.getRightTree().getContent()!=null)
    {
        Right=B.getRightTree();
        travers_rec(Right);
    }
    zahl=B.getContent();
    summe=summe+zahl;
    System.out.println(summe);
}
public void travers_rec(BinaryTree<Integer> B)
{
    BinaryTree<Integer> Left,Right;
    int zahl=0;
    //pre
    if(B.getLeftTree().getContent()!=null)
    {
        Left=B.getLeftTree();
        travers_rec(Left);
    }
    //in
    if(B.getRightTree().getContent()!=null)
    {
        Right=B.getRightTree();
        travers_rec(Right);
    }
    //post
    zahl=B.getContent();
    S.push(zahl);
    //System.out.println(zahl);
}
public void generate()
{
    Stack<BinaryTree> Stapel=new Stack();
    int p=first(aufbauplan);
    String Zahl=aufbauplan.substring(0,p);
    W.setContent(Integer.parseInt(Zahl));
    String Z="";
    BinaryTree<Integer> aktuell=W;
    do
    {
        Z=aufbauplan.substring(0,1);
        aufbauplan=aufbauplan.substring(1);
        p=first(aufbauplan);
        Zahl=aufbauplan.substring(0,p);
        aufbauplan=aufbauplan.substring(p);
        if(Z.equals("R"))
        {
            BinaryTree<Integer> T=new BinaryTree<Integer>(Integer.parseInt(Zahl));
            aktuell.setRightTree(T);
            Stapel.push(aktuell);
            aktuell=T;
        }
        if(Z.equals("L"))
        {
            BinaryTree<Integer> T=new BinaryTree<Integer>(Integer.parseInt(Zahl));
            aktuell.setLeftTree(T);
            Stapel.push(aktuell);
            aktuell=T;
        }
        if(Z.equals("Z"))
        {
            aktuell=Stapel.top();
            Stapel.pop();
        }
    } while(!aufbauplan.equals("%"));
} // generate

public int first(String t)
{
    int l=t.indexOf("L");
    int r=t.indexOf("R");
    int z=t.indexOf("Z");
    int e=t.indexOf("%");
    int min=l;
    if(min==-1) min=999999;
    if((r<min)&&(r>-1)) min=r;
    if((z<min)&&(z>-1)) min=z;
    if((e<min)&&(e>-1)) min=e; 
    return min;
} // first
}
/**
 * @author A. Hernandez
 * Data Structures and Algorithms
 */
public class Node
{

    private int info;     //element stored in this node
    private Node left;    //link to left child
    private Node right;   //link to right child

    Node()
    {
        info = 0;
        left = right = null;
    }

    void setNode(int x, Node l, Node r)
    {
        info = x;
        left = l;
        right = r;
    }

    int getInfo()
    {
        return info;
    }

    Node getLeftChild()
    {
        return left;
    }

    Node getRightChild()
    {
        return right;
    }

    void setInfo(int x)
    {
        info = x;
    }

    void setLeftChild(Node l)
    {
        left = l;
    }

    void setRightChild(Node r)
    {
        right = r;
    }
}


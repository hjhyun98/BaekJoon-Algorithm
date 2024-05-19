import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
     char value;
     Node left;
     Node right;

    public Node(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    static Node[] binaryTree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        binaryTree = new Node[N + 1];

        for(int i = 0; i < N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parentVal = st.nextToken().charAt(0);
            char leftVal = st.nextToken().charAt(0);
            char rightVal = st.nextToken().charAt(0);

            if(binaryTree[parentVal-'A'] == null){
                binaryTree[parentVal - 'A'] = new Node(parentVal);
            }
            if(leftVal != '.'){
                binaryTree[leftVal-'A'] = new Node(leftVal);
                binaryTree[parentVal-'A'].left = binaryTree[leftVal-'A'];
            }
            if(rightVal != '.'){
                binaryTree[rightVal - 'A'] = new Node(rightVal);
                binaryTree[parentVal - 'A'].right = binaryTree[rightVal-'A'];
            }
        }

        preorder(binaryTree[0]);
        System.out.println();

        inorder(binaryTree[0]);
        System.out.println();

        postorder(binaryTree[0]);
        System.out.println();
    }

    static void preorder(Node node){
        System.out.print(node.value);
        if(node.left != null) preorder(node.left);
        if(node.right != null) preorder(node.right);
    }

    static void inorder(Node node){
        if(node.left != null) inorder(node.left);
        System.out.print(node.value);
        if(node.right != null) inorder(node.right);
    }
    static void postorder(Node node){
        if(node.left != null) postorder(node.left);
        if(node.right != null) postorder(node.right);
        System.out.print(node.value);
    }
}



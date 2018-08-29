
package pilha;

/**
 *
 * @author gavaz
 */
public class Pilha {
    
    int top;
    
    int maxSize;
    
    int stack[];
    
    public Pilha(int maxSize) {
        
        this.top = -1;
        
        this.maxSize = maxSize;
        
        stack = new int[maxSize];
    }
    
    public void push(int value) {
        top++;
        
        stack[top] = value;
    }
    
    public int pop(){
        int val = stack[top];
        top--;
        return val;
    }
    
    public int top(){
        return stack[top];
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha1 = new Pilha(5);
        
        pilha1.push(3);
        System.out.println("top():"+pilha1.top());
        pilha1.push(7);
        System.out.println("top():"+pilha1.top());
        pilha1.push(2);
        System.out.println("top():"+pilha1.top());
        pilha1.push(4);
        System.out.println("top():"+pilha1.top());
        pilha1.push(1);
        System.out.println("top():"+pilha1.top());
        
        
        System.out.println("pop():"+pilha1.pop());
        System.out.println("pop():"+pilha1.pop());
        System.out.println("pop():"+pilha1.pop());
        System.out.println("pop():"+pilha1.pop());
        System.out.println("pop():"+pilha1.pop());
        
    }
    
}

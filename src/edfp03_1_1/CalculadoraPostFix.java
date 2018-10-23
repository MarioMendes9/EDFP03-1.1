/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp03_1_1;

/**
 *
 * @author mario
 * @param <T>
 */
public class CalculadoraPostFix {
    
    private ArrayStack<Integer> a;

    public CalculadoraPostFix() {
        this.a = new ArrayStack<>();
    }

    public CalculadoraPostFix(int cap) {
        this.a = new ArrayStack<>(cap);
    }
    
    public int calculate(String n){
        
        String[] parts=n.split(" ");
        
        for(int i=0;i<parts.length;i++){
            
            switch(parts[i]){
            case "+":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int k=a.pop();
                int j=a.pop();
                a.push(k+j);
                }
                break;
            case "-":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int k=a.pop();
                int j=a.pop();
                a.push(j-k);
                }
                break;
            case "/":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int k=a.pop();
                int j=a.pop();
                a.push(j/k);
                }
                break;
            case "*":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int k=a.pop();
                int j=a.pop();
                a.push(k*j);
                }
                break;
            default :
                a.push(Integer.parseInt(parts[i]));
                
                
                break;
        }
            
        }
        
        
            
        return a.peek();
        
        
    }
    
    
}

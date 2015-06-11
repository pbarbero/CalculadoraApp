/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pilar
 */
 public class Operador{
        
        private char op;
        
        public Operador(String s){ op = s.charAt(0);}
        
        //TODO: método operar devuelve 0.0 si la operacion no está bien definida
        public double operar(Double a, Double b) throws Exception{ 
        
            switch (this.op){
                case '+': return a+b;
                case '-': return a-b;
                case '*': return a*b;
                case '/': 
                    if (b!=0) return a/b; 
                    else {throw new Exception();}
                case '^': return Math.pow(a,b);       
                case '%': return a%b;           
            }
            return 0.0;
        }
        
        //TODO: método booleano devuelve si es operador
        public boolean esOperador(){
        switch(this.op){
            case '+': return true;
            case '-': return true;
            case '*': return true;
            case '/': return true;
            case '%': return true;      
            case '^': return true;  
            default: return false;
        }
        }
        //TODO: método getPrecd() devuelve entero que denota precedencia del operador, sino devuelve -1
        private int getPreced() { 
        
         switch(this.op){
            case '(': return 0;
            case ')': return 0;
            case '+': return 1;
            case '-': return 1;
            case '*': return 2;
            case '/': return 2;
            case '%': return 2;      
            case '^': return 3;                  
            }          
            return -1;
        } 
        
        //TODO: método esMasPreced() devuelve booleano comparando operador con string que representa operador
        public boolean esMasPreced(String s){
            Operador res = new Operador(s);            
            return (this.getPreced()<=res.getPreced());    
            
        }
        
        
    
    }
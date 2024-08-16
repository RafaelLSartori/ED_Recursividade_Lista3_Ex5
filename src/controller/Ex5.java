package controller;

public class Ex5 {
    public Ex5(){
        super();
    }
    public int frecfib(int n){
        //O ponto de parada se dá sabendo que a 1ª e 2ª posição da sequência de fibonacci é sempre 1.
        if( n == 1 || n == 2 ){
            return 1;
        }else{
            //Eu chamei a recursiva fazendo a soma dos dois termos anteriores.
            return frecfib(n - 1 ) + frecfib( n - 2 );
        }
    }
}
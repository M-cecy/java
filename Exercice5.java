public class Exercice5 {
    Scanner x= new Scanner(System.in);
    int max;
    int min;
    int n;
    int X;
    max=0;
    min=0;
    do{
        System.out.println("Entrer la longueur a parcourir");
        n= x.nextInt();
    }while(n<0);
    for (int i=1; i<=n.length; i++){
        System.out.println("saisir val+i ")
        do{
            X=x.nextInt();
        }while(X<0);
        if(i==1){
            min=X;
            max=X;
        }elminse{
            if(X<min)
            min=X;
        }
        if(X>max){
            max=X;
        }
    }
    System.out.println("valeur min=" + min);
    System.out.println("valeur max=" + max);

    x1=0
    x2=0
    if(i==1){
        int min1=x1;
        int max2=x1;
        int min2=x2;
        int max2=x2;
    }else{
        if(x1<min1){
            min1=x1;
        }
        if(x2<min2){
            min2=x2;
        }
        if(x1>max1){
            max1=x1;
        }
        if(x2>max2){
            max2=x2;
        }
    }

    
}
